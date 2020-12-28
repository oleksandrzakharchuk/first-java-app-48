package ua.mainacadamy.servise;

public class NumericServices {


    private static String str;
    private static Object number2;
    private static Object myChar;

    public static int GetNumberToString(int number) {
        int number1 = number;
        String str = Integer.toString(number);
        System.out.println("Number->String " + str);

        return number1;
    }


    public static String GetCharArrayFromString(String number) {
        String number3 = number;
        char[] result = number3.toCharArray();

        System.out.println("Char array:");
        for (int i = 0; i < result.length; i++)
            System.out.println("Element [" + i + "]: " + result[i]);

        return number3;
    }

    public static char GetCharToInt(char c, char c1, char c2, char c3, char c4, char c5) {

        int a = c;
        int b = c1;
        int o = c2;
        int d = c3;
        int e = c4;
        int f = c5;

        System.out.println(a);
        System.out.println(b);
        System.out.println(o);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        return (char) c;
    }
}























