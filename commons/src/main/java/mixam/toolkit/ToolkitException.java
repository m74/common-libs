/*
 * ToolkitException.java
 *
 * Created on 12 Февраль 2008 г., 9:48
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package mixam.toolkit;

/**
 * 
 * @author Максим
 */
public class ToolkitException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1846358219211467204L;

	public ToolkitException() {
	}

	public ToolkitException(Throwable ex) {
		super(ex);
	}

	public ToolkitException(String message, Throwable ex) {
		super(message, ex);
	}

	public ToolkitException(String message) {
		super(message);
	}

}
