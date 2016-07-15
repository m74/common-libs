package mixam.tools.parser1c;

import mixam.tools.parser1c.stubs.Variables;

public class VariableWorker extends DefaultWorker<Variables> {

	private final Variables vars = new Variables();

	public VariableWorker() {
		super("1CClientBankExchange", "КонецФайла");
	}

	@Override
	public void handlePair(String key, String val) throws Exception {
		handlePair(vars, key, val);
	}

	public Variables getEntity() {
		return vars;
	}

	@Override
	protected void commitEntity(Variables entity) throws Exception {
	}

}
