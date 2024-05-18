

public class Comparison {
    public static void main(String[] args) {
        String a = "Nil";
        String b = "Nil";
        //when only checking value use .equals
        System.out.println(a==b);//true
        System.out.println(a.equals(b));//true
        //creating new objects outside the pool but inside the heap
        String name1 = new String("nilanjan");
        String name2 = new String("nilanjan");
        System.out.println(name1==name2);//false
        System.out.println(name1.equals(name2));//true
        //placeholders
        // There are many format specifiers we can use. Here are some common ones
        //%c - Character
        //%d - Decimal number (base 10)
        //%e - Exponential floating-point number
        //%f - Floating-point number
        //%i - Integer (base 10)
        //%o - Octal number (base 8)
        //%s - String
        //%u - Unsigned decimal (integer) number
        //%x - Hexadecimal number (base 16)
        //%t - Date/time
        //%n - Newline
        System.out.printf("hello my name is %s and i am %s","nil","student");
    }
}

