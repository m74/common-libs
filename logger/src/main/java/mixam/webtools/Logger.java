package mixam.webtools;

public final class Logger {
	
	@SuppressWarnings("deprecation")
	public static void setContext(Object ctx) {
		LoggerFactory.setContext(ctx);
	}

	@SuppressWarnings("deprecation")
	public static void info(Object scope, Object... messages) {
		LoggerFactory.info(scope, messages);
	}

	@SuppressWarnings("deprecation")
	public static void debug(Object scope, Object... messages) {
		LoggerFactory.debug(scope, messages);
	}

	@SuppressWarnings("deprecation")
	public static void error(Object scope, Throwable t, String... messages) {
		LoggerFactory.error(scope, t, messages);
	}

}
