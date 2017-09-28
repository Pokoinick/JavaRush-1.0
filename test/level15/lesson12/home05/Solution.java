package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    Solution() {}
    Solution(int i) {}
    Solution(String s) {}
    protected Solution(double d) {}
    protected Solution(boolean b) {}
    protected Solution(char c) {}
    public Solution(Object o) {}
    public Solution(Integer i) {}
    public Solution(byte b) {}
    private Solution(short s) {}
    private Solution(Double d) {}
    private Solution(Character c) {}
}

