package ru.com.m74.npchk_nalog_ru;

import ru.com.m74.npchk_nalog_ru.client.FNSNDSCAWS2;
import ru.com.m74.npchk_nalog_ru.client.FNSNDSCAWS2Port;
import ru.com.m74.npchk_nalog_ru.client.NdsRequest2;
import ru.com.m74.npchk_nalog_ru.client.NdsResponse2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Проверка статуса контрагента по инн и кпп на указанную дату.
 * 
 * @author mixam
 *
 */
public class Client {

	public static final String msgs[] = new String[] {
			"Налогоплательщик зарегистрирован в ЕГРН и имел статус действующего в указанную дату",
			"Налогоплательщик зарегистрирован в ЕГРН, но не имел статус действующего в указанную дату",
			"Налогоплательщик зарегистрирован в ЕГРН",
			"Налогоплательщик с указанным ИНН зарегистрирован в ЕГРН, КПП не соответствует ИНН или не указан*",
			"Налогоплательщик с указанным ИНН не зарегистрирован в ЕГРН", 
			"Некорректный ИНН",
			"Недопустимое количество символов ИНН", 
			"Недопустимое количество символов КПП",
			"Недопустимые символы в ИНН", 
			"Недопустимые символы в КПП", 
			"некорректный формат даты",
			"некорректная дата (ранее 01.01.1991 или позднее текущей даты)" 
	};
	
	public static void main(String[] args) {

		SimpleDateFormat f = new SimpleDateFormat("dd.MM.yyyy");

		FNSNDSCAWS2 service = new FNSNDSCAWS2();
		FNSNDSCAWS2Port port = service.getFNSNDSCAWS2Port();
		NdsRequest2 req = new NdsRequest2();
		{
			NdsRequest2.NP np = new NdsRequest2.NP();
			np.setINN("3731001750");
			np.setKPP("370201001");
			np.setDT(f.format(new Date()));
			req.getNP().add(np);
		}
		NdsResponse2 resp = port.ndsRequest2(req);

		for (NdsResponse2.NP np : resp.getNP()) {
			System.out.println("inn: " + np.getINN());
			System.out.println("dt: " + np.getDT());
			System.out.println("kpp: " + np.getKPP());
			System.out.println("state: " + msgs[Integer.parseInt(np.getState())]);
		}
	}

}
