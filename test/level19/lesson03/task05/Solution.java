package com.javarush.test.level19.lesson03.task05;

import java.util.HashMap;
import java.util.Map;

/* Закрепляем адаптер
Адаптировать Customer и Contact к RowItem.
Классом-адаптером является DataAdapter.
Инициализируйте countries перед началом выполнения программы. Соответствие кода страны и названия:
UA Ukraine
RU Russia
CA Canada
*/

public class Solution {
    private static Map<String,String> countries = new HashMap<String,String>();

    public static void main(String[] args) {
        String dial = "+38(050)123-45-67";
        System.out.println(dial.replaceAll("[()-]", ""));

        String name = "Ivanov, Ivan";
        System.out.println(name.substring(0, name.indexOf(',')));
        System.out.println(name.substring(name.indexOf(' ')+1));
        String result=null;
        for (Map.Entry<String, String> pair : countries.entrySet())
        {
            if (pair.getValue().equals("Ukraine"))
            {
                result =  pair.getKey();
            }
        }
        System.out.println(result);
    }
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static class DataAdapter implements RowItem {
        Customer customer;
        Contact contact;

        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCountryCode()
        {
            String result=null;
            for (Map.Entry<String, String> pair : countries.entrySet())
            {
                if (pair.getValue().equals(customer.getCountryName()))
                {
                    result =  pair.getKey();
                }
            }
            return result;
        }

        @Override
        public String getCompany()
        {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName()
        {

            return contact.getName().substring(contact.getName().indexOf(' ')+1);
        }

        @Override
        public String getContactLastName()
        {
            return contact.getName().substring(0, contact.getName().indexOf(','));
        }

        @Override
        public String getDialString()
        {
            return "callto://"+contact.getPhoneNumber().replaceAll("[()-]", "");
        }
    }

    public static interface RowItem {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        String getDialString();         //example callto://+380501234567
    }

    public static interface Customer  {
        String getCompanyName();        //example JavaRush Ltd.
        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan
        String getPhoneNumber();        //example +38(050)123-45-67
    }
}