package mixam.webtools;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

/**
 * @deprecated Use: {@link mixam.webtools.Logger}
 * @author mixam
 *
 */
public class LoggerFactory {

	private static final ThreadLocal<Object> ctxRef = new ThreadLocal<Object>();

	public static void setContext(Object ctx) {
		ctxRef.set(ctx);
		// Logger.getLogger(LoggerFactory.class).debug("setContext: " + ctx);
	}

	public static Logger getLogger(Object src) {
		String name;
		if (src instanceof String)
			name = (String) src;
		else if (src instanceof Class)
			name = getLoggerName((Class<?>) src);
		else
			name = getLoggerName(src.getClass());

		return getLogger(ctxRef.get(), name);
	}

	private static String getLoggerName(Class<?> cls) {
		LoggerName a = cls.getAnnotation(LoggerName.class);
		return a != null ? a.value() : cls.getName();
	}

	public static Logger getLogger(String name) {
		return getLogger(ctxRef.get(), name);
	}

	public static Logger getLogger(Object ctx, String loggerName) {
		if (ctx instanceof HttpServletRequest)
			return getLogger((HttpServletRequest) ctx, loggerName);
		else if (ctx instanceof HttpSession)
			return getLogger((HttpSession) ctx, loggerName);
		else if (ctx instanceof ServletContext)
			return getLogger((ServletContext) ctx, loggerName);
		else
			return Logger.getLogger(loggerName);

	}

	private static String getUid(HttpSession session) {
		try {
			return session != null ? (String) session.getAttribute("UID") : null;
		} catch (IllegalStateException e) {
			return null;
		}
	}

	private static Logger getLogger(HttpServletRequest r, String loggerName) {
		try {
			return getLogger(r.getContextPath(), getUid(r.getSession()), loggerName);
		} catch (Exception e) {
			return getLogger("undefined", "undefined", loggerName);
		}
	}

	private static Logger getLogger(HttpSession ctx, String loggerName) {
		ServletContext c = ctx.getServletContext();
		return getLogger("/" + (c != null ? c.getServletContextName() : ""), getUid(ctx), loggerName);
	}

	private static Logger getLogger(String contextPath, String userName, String loggerName) {
		String name = "[" + contextPath + "]";
		if (userName != null)
			name += ".[" + userName + "]";
		name += "." + loggerName;
		return Logger.getLogger(name);
	}

	private static Logger getLogger(ServletContext ctx, String loggerName) {
		return getLogger("/" + ctx.getServletContextName(), null, loggerName);

	}

	protected static String join(Object arr[]) {
		StringBuffer sb = new StringBuffer();
		for (Object m : arr) {
			if (sb.length() > 0)
				sb.append(" ");
			sb.append(m);
		}

		return sb.toString();
	}

	public static void info(Object scope, Object... messages) {
		getLogger(scope).info(join(messages));
	}

	public static void debug(Object scope, Object... messages) {
		getLogger(scope).debug(join(messages));
	}

	public static void error(Object scope, Throwable t, String... messages) {
		getLogger(scope).error(join(messages), t);
	}

}
