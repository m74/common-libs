/*
 * Parser2.java
 *
 * Created on 14 Январь 2008 г., 21:49
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package mixam.tools.parser1c;

import mixam.toolkit.BeanTools;
import mixam.tools.parser1c.stubs.Account;
import mixam.tools.parser1c.stubs.Variables;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.List;

/**
 * 
 * @author Максим
 */
public class Parser {
	private String inputCharset;
	private final Hashtable<String, Worker<?>> workersMap = new Hashtable<String, Worker<?>>();

	private final AccountWorker accountWorker = new AccountWorker();
	private final VariableWorker variableWorker = new VariableWorker();
	private Worker<?> worker = variableWorker;

	public void put(Worker<?> w) {
		w.setParser(this);
		workersMap.put(w.getStart(), w);
	}

	public Parser() throws Exception {
		this("windows-1251");
	}

	public Parser(String charset) throws Exception {
		inputCharset = charset;
		variableWorker.setParser(this);
		put(accountWorker);
	}

	public List<Account> getAccounts() {
		return accountWorker.getAccounts();
	}

	protected void clearCurrentHandler() {
		worker = null;
	}

	/**
	 * @deprecated Use: {@link Parser#getVariables()}
	 */
	public Object getProperty(String name) {
		return BeanTools.getProperty(getVariables(), name);
	}

	public Variables getVariables() {
		return variableWorker.getEntity();
	}

	private void parseLine(String line) throws Exception {
		String arr[] = line.split("=", 2);
		String key = arr[0];
		String val = arr.length > 1 ? arr[1].trim() : null;

		Worker<?> w = workersMap.get(key);
		if (w != null) {
			if (worker != null)
				worker.commit();
			worker = w;
		}

		if (worker != null)
			worker.handlePair(key, val);

	}

	public void parse(InputStream in) throws Exception {
		BufferedReader r = new BufferedReader(new InputStreamReader(in,
				inputCharset));

		String firstLine = r.readLine();
		
		// empty file
		if (firstLine == null)
			return;

		if (!firstLine.equals("1CClientBankExchange"))
			throw new IllegalArgumentException(
					"Incorrect file format: 1CClientBankExchange");

		for (String line = r.readLine(); line != null; line = r.readLine()) {
			parseLine(line);
		}
		if (worker != null)
			worker.commit();
	}

	public void setDocumentWorker(DocumentWorker<?> documentWorker) {
		put(documentWorker);
	}
}