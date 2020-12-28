package ua.mainacadamy;

import ua.mainacadamy.servise.NumericServices;

import static ua.mainacadamy.servise.NumericServices.GetCharToInt;

public class LogicApp {

    public static void main(String[] args) {
        int result1=NumericServices.GetNumberToString(123456);
        String result3=NumericServices.GetCharArrayFromString("123456");
        char result2 = NumericServices.GetCharToInt('1', '2', '3','4','5','6');
    }
}
