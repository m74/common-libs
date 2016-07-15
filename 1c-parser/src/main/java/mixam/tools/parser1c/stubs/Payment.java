package mixam.tools.parser1c.stubs;

import java.sql.Date;

import mixam.tools.parser1c.ParserKey;

public class Payment {
	@ParserKey("СекцияДокумент")
	private String title;

	@ParserKey("Номер")
	private String number;

	@ParserKey("Дата")
	private Date date;

	@ParserKey("Сумма")
	private Double sum;

	@ParserKey("ПлательщикСчет")
	private String payerAccount;

	@ParserKey("ДатаСписано")
	public Date sendAt;

	@ParserKey("ПлательщикИНН")
	private String payerInn;

	@ParserKey("Плательщик1")
	private String payerTitle;

	@ParserKey("ПлательщикКПП")
	private String payerKpp;

	@ParserKey("ПлательщикБИК")
	private String payerBik;

	@ParserKey("ПлательщикБанк1")
	private String payerBank;

	@ParserKey("ДатаПоступило")
	public Date receiveAt;

	@ParserKey("ПолучательСчет")
	private String recipierAccount;

	@ParserKey("Получатель1")
	private String recipierTitle;

	@ParserKey("ПолучательИНН")
	private String recipierInn;

	@ParserKey("ПолучательКПП")
	private String recipierKpp;

	@ParserKey("ПолучательБИК")
	private String recipierBik;

	@ParserKey("ПолучательБанк1")
	private String recipierBank;

	@ParserKey("НазначениеПлатежа")
	private String purpose;

	@ParserKey("ОКАТО")
	private String okato;

	@ParserKey("ВидОплаты")
	private String type;

	public void setDate(Date date) {
		if (date != null)
			this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setOkato(String okato) {
		this.okato = okato;
	}

	public String getOkato() {
		return okato;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setPayerKpp(String payerKpp) {
		this.payerKpp = payerKpp;
	}

	public String getPayerKpp() {
		return payerKpp;
	}

	public void setPayerInn(String payerInn) {
		this.payerInn = payerInn;
	}

	public String getPayerInn() {
		return payerInn;
	}

	public void setPayerAccount(String payerAccount) {
		this.payerAccount = payerAccount;
	}

	public String getPayerAccount() {
		return payerAccount;
	}

	public void setPayerBik(String payerBik) {
		this.payerBik = payerBik;
	}

	public String getPayerBik() {
		return payerBik;
	}

	public void setPayerBank(String payerBank) {
		this.payerBank = payerBank;
	}

	public String getPayerBank() {
		return payerBank;
	}

	public void setRecipierTitle(String recipierTitle) {
		this.recipierTitle = recipierTitle;
	}

	public String getRecipierTitle() {
		return recipierTitle;
	}

	public void setRecipierAccount(String recipierAccount) {
		this.recipierAccount = recipierAccount;
	}

	public String getRecipierAccount() {
		return recipierAccount;
	}

	public void setRecipierInn(String recipierInn) {
		this.recipierInn = recipierInn;
	}

	public String getRecipierInn() {
		return recipierInn;
	}

	public void setRecipierKpp(String recipierKpp) {
		this.recipierKpp = recipierKpp;
	}

	public String getRecipierKpp() {
		return recipierKpp;
	}

	public void setRecipierBank(String recipierBank) {
		this.recipierBank = recipierBank;
	}

	public String getRecipierBank() {
		return recipierBank;
	}

	public void setRecipierBik(String recipierBik) {
		this.recipierBik = recipierBik;
	}

	public String getRecipierBik() {
		return recipierBik;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}

	public Double getSum() {
		return sum;
	}

	public void setPayerTitle(String payerTitle) {
		this.payerTitle = payerTitle;
	}

	public String getPayerTitle() {
		return payerTitle;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getPurpose() {
		return purpose;
	}

}
