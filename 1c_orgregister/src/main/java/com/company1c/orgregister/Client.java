package com.company1c.orgregister;

import com.company1c.orgregister.corporation.РеквизитыЮрЛица;
import com.company1c.orgregister.corporation.РеквизитыЮрЛица.СвОКВЭД;
import com.company1c.orgregister.corporation.РеквизитыЮрЛица.СвУправлДеят.СведДолжнФЛ;
import com.company1c.orgregister.ws.RequisitesWebServiceEndpoint2;
import com.company1c.orgregister.ws.RequisitesWebServiceEndpointImpl2Service;
import mixam.toolkit.BeanTools;

import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.util.ArrayList;
import java.util.List;

public class Client {

    public static РеквизитыЮрЛица getРеквизитыЮрЛица(final String username, final String password, String inn) {
        Authenticator.setDefault(new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password.toCharArray());
            }
        });

        RequisitesWebServiceEndpointImpl2Service service = new RequisitesWebServiceEndpointImpl2Service();
        RequisitesWebServiceEndpoint2 port = service.getRequisitesWebServiceEndpointImpl2Port();

        return port.getCorporationRequisitesByINN(inn, "БухгалтерияПредприятияКОРП");

    }

    public static Report getReport(String inn, String username, String password) {
        РеквизитыЮрЛица recv = getРеквизитыЮрЛица(username, password, inn);

        Report r = new Report();

        r.put(recv, "ИНН");
        r.put(recv, "КПП");
        r.put(recv, "ОГРН");

        r.put("СвНаимЮЛ");
        r.put(recv, "СвНаимЮЛ.НаимЮЛПолн");
        r.put(recv, "СвНаимЮЛ.НаимЮЛСокр");
        r.put(recv, "СвНаимЮЛ.ГРН");
        r.put(recv, "СвНаимЮЛ.НаимЮЛФирм");
        r.put(recv, "СвНаимЮЛ.ДатаНачДейств");
        r.put(recv, "СвНаимЮЛ.ДатаОбрЮЛ");
        r.put(recv, "СвНаимЮЛ.ДатаПрекрЮЛ");
        r.put(recv, "СвНаимЮЛ.ОПФ.КодОПФ");
        r.put(recv, "СвНаимЮЛ.ОПФ.ПолнНаимОПФ");
        r.put(recv, "СвНаимЮЛ.ОПФ.СпрОПФ");
        r.put("СвАдрес");
        r.put(recv, "СвАдрес.ГРН");
        r.put(recv, "СвАдрес.ПризнОтсутАдресЮЛ");
        r.put(recv, "СвАдрес.Адрес.Страна");
        r.put(recv, "СвАдрес.Адрес.Состав");
        r.put(recv, "СвАдрес.ДатаНачДейств");

        r.put("СвОКВЭД");
        for (СвОКВЭД o : recv.getСвОКВЭД()) {
            r.put(o, "ГРН");
            r.put(o, "ДатаНачДейств");
            r.put(o, "КодОКВЭД");
            r.put(o, "ПрОснДоп");
        }
        r.put("СвРегПФ");
        r.put(recv, "СвРегПФ.ГРН");
        r.put(recv, "СвРегПФ.РегНомПФ");
        r.put(recv, "СвРегПФ.ДатаНачДейств");
        r.put(recv, "СвРегПФ.ДатаРег");
        r.put(recv, "СвРегПФ.СвОргПФ.КодПФ");
        r.put(recv, "СвРегПФ.СвОргПФ.НаимПФ");

        r.put("СвРегФСС");
        r.put(recv, "СвРегФСС.ГРН");
        r.put(recv, "СвРегФСС.РегНомФСС");
        r.put(recv, "СвРегФСС.ДатаНачДейств");
        r.put(recv, "СвРегФСС.ДатаРег");
        r.put(recv, "СвРегФСС.СвОргФСС.КодФСС");
        r.put(recv, "СвРегФСС.СвОргФСС.НаимФСС");

        r.put("СвСтатусРО");
        r.put(recv, "СвСтатусРО.ГРН");
        r.put(recv, "СвСтатусРО.ДатаНачДейств");
        r.put(recv, "СвСтатусРО.СвРегОрг.КодНО");
        r.put(recv, "СвСтатусРО.СвРегОрг.НаимНО");
        r.put(recv, "СвСтатусРО.СвСтатус.НаимСтатусЮЛ");
        r.put(recv, "СвСтатусРО.СвСтатус.КодСтатусЮЛ");

        r.put("СвУправлДеят");
        r.put(recv, "СвУправлДеят.УпрОргИн");
        r.put(recv, "СвУправлДеят.УпрОргРос");

        r.put("СвУправлДеят.СведДолжнФЛ");
        for (СведДолжнФЛ o : recv.getСвУправлДеят().getСведДолжнФЛ()) {
            r.put(o, "ГРН");
            r.put(o, "ВидДолжн");
            r.put(o, "ИННФЛ");
            r.put(o, "НаимВидДолжн");
            r.put(o, "НаимДолжн");
            r.put(o, "НомТел");
            r.put(o, "ОГРНИП");
            r.put(o, "ДатаНачДейств");
            r.put(o, "СвДискв");
            r.put(o, "ФИО.Имя");
            r.put(o, "ФИО.Отчество");
            r.put(o, "ФИО.Фамилия");
        }
        r.put("СвУчетНО");
        r.put(recv, "СвУчетНО.ГРН");
        r.put(recv, "СвУчетНО.ИНН");
        r.put(recv, "СвУчетНО.КПП");
        r.put(recv, "СвУчетНО.ДатаНачДейств");
        r.put(recv, "СвУчетНО.ДатаПостУч");
        r.put("СвУчетНО.СвНО");
        r.put(recv, "СвУчетНО.СвНО.КодНО");
        r.put(recv, "СвУчетНО.СвНО.НаимНО");

        return r;
    }

    public static void main(String[] args) throws MalformedURLException {

        final String username = args[0];
        final String password = args[1];
        final String inn = args[2];
        System.out.println(getReport(inn, username, password));
    }

    static class ReportItem {
        String key;
        String label;
        Object src;

        ReportItem(Object src, String key, String label) {
            this.src = src;
            this.key = key;
            this.label = label;
        }

        String value() {
            return BeanTools.getString(src, key);
        }
    }

    static class Report {
        List<Object> parts = new ArrayList<Object>();

        void put(Object src, String key) {
            String arr[] = key.split("\\.");
            parts.add(new ReportItem(src, key, arr[arr.length - 1]));
        }

        void put(String str) {
            parts.add(str);
        }

        // void put(Object src, String key, String label) {
        // parts.add(new ReportItem(src, key, label));
        // }

        public String toString() {
            StringBuffer buff = new StringBuffer();
            int max = 0;
            for (Object part : parts) {
                if (part instanceof ReportItem) {
                    max = Math.max(max, ((ReportItem) part).label.length());
                }
            }

            for (Object part : parts) {
                if (part instanceof ReportItem) {
                    ReportItem item = (ReportItem) part;
                    buff.append(item.label);
                    for (int i = item.label.length(); i < max; i++) {
                        buff.append(" ");
                    }
                    buff.append(" : ");
                    buff.append(item.value() + "\n");
                } else {
                    buff.append("// ");
                    int len = (72 - ((String) part).length()) / 2;
                    for (int i = 0; i < len; i++) {
                        buff.append("=");
                    }
                    buff.append(" " + part + " ");
                    for (int i = 0; i < len; i++) {
                        buff.append("=");
                    }
                    buff.append(" //\n");
                }
            }
            return buff.toString();
        }
    }
}
