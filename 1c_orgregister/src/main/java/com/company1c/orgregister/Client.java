package com.company1c.orgregister;

import com.company1c.orgregister.corporation.StringPropertyType;
import com.company1c.orgregister.ws.RequisitesWebServiceEndpoint7;
import com.company1c.orgregister.ws.RequisitesWebServiceEndpointImpl7Service;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.reflect.Field;
import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.List;

public class Client {

    public static Object getРеквизитыЮрЛица(final String username, final String password, String inn) {
        Authenticator.setDefault(new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password.toCharArray());
            }
        });

        RequisitesWebServiceEndpointImpl7Service service = new RequisitesWebServiceEndpointImpl7Service();
        RequisitesWebServiceEndpoint7 port = service.getRequisitesWebServiceEndpointImpl7Port();

        if (inn.length() == 12)
            return port.getEntrepreneurRequisitesByINN(inn, "БухгалтерияПредприятияКОРП");
        else if (inn.length() == 10)
            return port.getCorporationRequisitesByINN(inn, "БухгалтерияПредприятияКОРП");
        else throw new RuntimeException("НЕ корректный ИНН");
    }

    public static String getInfo(String inn) throws IllegalAccessException {
        Object dto = getРеквизитыЮрЛица("9807471", "7q5J3V8", inn);
        if (dto == null) throw new RuntimeException("Компания с таким инн не найдена: " + inn);
        return toString(null, dto);
    }

    public static void main(String[] args) throws MalformedURLException, IllegalAccessException {
        final String inn = "7743098817";
//        final String inn = "773113246935";
        System.out.println(getInfo(inn));
    }


    private static Format df = new SimpleDateFormat("dd.MM.yy");

    private static String toString(String path, Object dto) throws IllegalAccessException {
        String str = "";
        for (Field f : dto.getClass().getDeclaredFields()) {
//            BeanTools.getFieldValue()
            f.setAccessible(true);
            Object val = f.get(dto);

            String name = f.getName();
//            String name;
//            if (f.isAnnotationPresent(XmlElement.class)) {
//                name = f.getAnnotation(XmlElement.class).name();
//            } else if (f.isAnnotationPresent(XmlAttribute.class)) {
//                name = f.getAnnotation(XmlAttribute.class).name();
//            } else {
//                name = f.getName();
//            }

            if (path != null) {
                name = path + "." + name;
            }

            if (val == null) {
                str += name + ": <не задано>\n";
            } else if (val instanceof String) {
                str += name + ": " + val + "\n";
            } else if (val instanceof JAXBElement) {
                str += format(name, (JAXBElement) val) + "\n";
//                str += toString(name, ((JAXBElement) val).getValue());
            } else if (val instanceof List) {
//                str += name + "\n";
                int i = 0;
                for (Object item : (List) val) {
                    str += toString(name + "[" + (i++) + "]", item) + "\n";
                }
            } else if (val instanceof StringPropertyType) {
                StringPropertyType type = (StringPropertyType) val;
                str += name + ": " + type.getValue() + " от " + format(type.getFrom()) + "\n";
            } else if (val instanceof XMLGregorianCalendar) {
                str += name + ": " + format((XMLGregorianCalendar) val) + "\n";
            } else {
                str += toString(name, val) + "\n";
            }
        }
        return str;
    }

    private static String format(String name, JAXBElement val) throws IllegalAccessException {
        if (val.getValue() instanceof JAXBElement) {
            return format(name, (JAXBElement) val.getValue());
        } else if (val.getValue() instanceof String) {
            return String.valueOf(val.getValue());
        } else {
            return toString(name, val.getValue());
        }
    }

    private static String format(XMLGregorianCalendar val) {
        return df.format((val).toGregorianCalendar().getTime());
    }
}
