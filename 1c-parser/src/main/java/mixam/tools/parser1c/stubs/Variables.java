package mixam.tools.parser1c.stubs;

import java.sql.Date;

import mixam.tools.parser1c.ParserKey;

public class Variables {

	@ParserKey("ВерсияФормата")
	public String version;

	@ParserKey("Кодировка")
	public String encoding;

	@ParserKey("Отправитель")
	public String sender;

	@ParserKey("Получатель")
	public String recipier;

	@ParserKey("ДатаСоздания")
	public Date createDate;

	@ParserKey("ВремяСоздания")
	public String createTime;

	@ParserKey("ДатаНачала")
	public Date startAt;

	@ParserKey("ДатаКонца")
	public Date endAt;

	@ParserKey("РасчСчет")
	public String accountNumber[];

	@ParserKey("Документ")
	public String documentType;

}
