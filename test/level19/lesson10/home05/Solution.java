package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со слов, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0]), "cp1251"));
        BufferedWriter fileWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(args[1]),"cp1251"));
        String result = "";
        while (fileReader.ready()) {

            String dataString = fileReader.readLine().trim();
            String[] test = dataString.split(" ");

            for (int i = 0; i < test.length; i++) {
               if (!test[i].replaceAll("[^\\d]", "").isEmpty())
                    result += test[i]+" ";
            }
        }
        System.out.println(result.trim());
        fileWriter.write(result.trim());
        fileReader.close();
        fileWriter.flush();
        fileWriter.close();
    }
}
