package com.javarush.test.level20.lesson02.task02;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* Читаем и пишем в файл: JavaRush
Реализуйте логику записи в файл и чтения из файла для класса JavaRush
В файле your_file_name.tmp может быть несколько объектов JavaRush
Метод main реализован только для вас и не участвует в тестировании
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            JavaRush javaRush = new JavaRush();
            javaRush.users.add(new User());
            javaRush.users.get(0).setFirstName("Ivan");
            javaRush.users.get(0).setLastName("Ivanov");
            javaRush.users.get(0).setBirthDate(new Date());
            javaRush.users.get(0).setMale(true);
            javaRush.users.get(0).setCountry(User.Country.RUSSIA);
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter printWriter = new PrintWriter(outputStream,true);

            for (User u: users)
            {
                if (u == null)
                {
                    printWriter.println("StartOfEmptyUser");
                }

                if (u != null)
                {
                    printWriter.println("StartOfUser");
                    printWriter.println(u.getFirstName());
                    printWriter.println(u.getLastName());
                    printWriter.println(u.isMale() ? "true" : "false");
                    printWriter.println(u.getCountry().toString());
                    printWriter.println(u.getBirthDate().getTime());
                }
            }
            printWriter.flush();
            printWriter.close();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            while (br.ready())
            {
                String result = br.readLine();
                if (result.equals("StartOfEmptyUser")) {
                    User user = null;
                    users.add(user);
                    result = br.readLine();
                }
                if (result.equals("StartOfUser"))
                {
                    User user = new User();
                    user.setFirstName(br.readLine());
                    user.setLastName(br.readLine());
                    user.setMale(br.readLine().equals("true"));
                    user.setCountry(User.Country.valueOf(br.readLine()));
                    user.setBirthDate(new Date(Long.parseLong(br.readLine())));

                    users.add(user);
                }
            }
            br.close();
        }
    }
}
