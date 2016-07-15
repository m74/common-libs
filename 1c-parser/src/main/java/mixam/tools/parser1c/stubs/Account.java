package mixam.tools.parser1c.stubs;

import java.sql.Date;

import mixam.tools.parser1c.ParserKey;

public class Account {
	@ParserKey("ДатаНачала")
	private Date begin;

	@ParserKey("ДатаКонца")
	private Date end;

	@ParserKey("РасчСчет")
	private String account;

	@ParserKey("НачальныйОстаток")
	private Double before;

	@ParserKey("ВсегоПоступило")
	private Double in;

	@ParserKey("ВсегоСписано")
	private Double out;

	@ParserKey("КонечныйОстаток")
	private Double after;

	public void setBegin(Date begin) {
		this.begin = begin;
	}

	public Date getBegin() {
		return begin;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public Date getEnd() {
		return end;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getAccount() {
		return account;
	}

	public void setBefore(Double before) {
		this.before = before;
	}

	public Double getBefore() {
		return before;
	}

	public void setIn(Double in) {
		this.in = in;
	}

	public Double getIn() {
		return in;
	}

	public void setOut(Double out) {
		this.out = out;
	}

	public Double getOut() {
		return out;
	}

	public void setAfter(Double after) {
		this.after = after;
	}

	public Double getAfter() {
		return after;
	}
}
