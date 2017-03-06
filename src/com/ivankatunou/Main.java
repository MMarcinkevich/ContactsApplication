package com.ivankatunou;

import java.util.ArrayList;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
	    HomePhone homePhone = new HomePhone("334-67-80", "Минск");
	    MobilePhone mobilePhone =
                new MobilePhone("+375 25 768 00 99", "МТС");

        Contact contact1 =
                new Contact("Вася", "Петров", homePhone, mobilePhone);

        //contact1.getInformation();
        //System.out.println(contact1.homePhone.callAmbulanceNumber());

         /* try {
            int d = 30;
            int result = d/1;
            //Contact contact2 = new Contact();
            //contact2.getInformation();
            System.out.println("это строка выводиться не будет");
        } catch(NullPointerException e) {
            System.out.println("У вас контакт не проинициализорован");
            e.printStackTrace();
            //
        } catch (ArithmeticException e) {
            System.out.println("вы делили на 0");
        } finally {
            System.out.println("этот код выполняется всегда!");
        }


        System.out.println(contact1.toString());*/
        HomePhone homePhone2 = new HomePhone("334-64-00", "Пинск");
        MobilePhone mobilePhone2 =
                new MobilePhone("+375-29-567-56-67", "Velcome");

        Contact contact2 =
                new Contact("Жора", "Гоги", homePhone, mobilePhone);

        String[] strs = new String[]{contact1.toString(),contact2.toString()};
        inputOtputData.writeDataToFile("textFile.txt", strs); // внесение контактов в текстовый файл

         /*String[] strs = new String[]{"one", "two", "three"};
         inputOtputData.writeDataToFile("textFile.txt",strs);*/
        ArrayList<String> listOfContacts  = inputOtputData.readDataFromFile("textFile.txt"); // чтение из файла
        System.out.println(listOfContacts);

        String dbAdmin = DatabaseConfig.getValue("db.username");
        System.out.println(dbAdmin); // выведение скрытого ключа на консоль
    }
}
