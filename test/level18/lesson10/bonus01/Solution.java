package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream(args[1]);
        OutputStream outputStream = new FileOutputStream(args[2]);
        String key = "MattPear";
        byte[] cypher = key.getBytes();
        byte[] fileData = new byte[inputStream.available()];
        inputStream.read(fileData);

        if (args[0].equals("-e"))
            fileEncrypt(fileData, cypher);
        if (args[0].equals("-d"))
            fileDecrypt(fileData, cypher);

        outputStream.write(fileData);
        outputStream.flush();
        outputStream.close();
    }

    public static void fileEncrypt(byte[] fileData, byte[] cypher) throws IOException {


            for (int i = 0; i < fileData.length; i++)
            {
                fileData[i] = (byte)(fileData[i]^cypher[i % cypher.length]);
            }

    }

    public static void fileDecrypt(byte[] fileData, byte[] cypher) throws IOException {


            for (int i = 0; i < fileData.length; i++) {
               fileData[i] = (byte) (fileData[i]^cypher[i % cypher.length]);
            }

    }
}
