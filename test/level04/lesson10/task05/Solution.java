package com.javarush.test.level04.lesson10.task05;
public class Solution
{
    public static void main(String[] args) throws Exception
    {
    /*    int i = 10;
        int b = 1;

        while(i>0) {
            System.out.println(b*1 +" "+ b*2 +" "+ b*3 + " " +b*4 +" "+ b*5 +" "+ b*6 + " " +b*7 +" "+ b*8 +" "+ b*9 +" "+ b*10);
            b++;
            i--;
        }*/
        //???????? ??? ??? ???
        int i = 1;
        int j = 1;
        while(i<=10){
            if (j == 11) {
                j = 1;
                System.out.println();
            }
            while(j<=10) {
                System.out.print(i * j + " ");
                j++;
            }
            i++;
        }

    }
}