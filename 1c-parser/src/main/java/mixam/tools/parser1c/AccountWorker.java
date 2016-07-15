package mixam.tools.parser1c;

import mixam.tools.parser1c.stubs.Account;
import mixam.webtools.Logger;

import java.util.ArrayList;
import java.util.List;

public class AccountWorker extends DefaultWorker<Account> {

	private final List<Account> list = new ArrayList<Account>();

	public AccountWorker() {
		super("СекцияРасчСчет", "КонецРасчСчет");
	}

	@Override
	protected void commitEntity(Account entity) throws Exception {
		Logger.debug(this, entity);
		list.add(entity);
	}

	public List<Account> getAccounts() {
		return list;
	}
}
