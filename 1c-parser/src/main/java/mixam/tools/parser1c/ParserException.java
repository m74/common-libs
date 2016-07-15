/*
 * ParserException.java
 *
 * Created on 15 Январь 2008 г., 9:03
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package mixam.tools.parser1c;

/**
 * 
 * @author Максим
 */
public class ParserException extends Exception {

	private static final long serialVersionUID = 307550831427270611L;

	public ParserException(Throwable ex) {
		super(ex);
	}

	public ParserException(String msg) {
		super(msg);
	}

}
