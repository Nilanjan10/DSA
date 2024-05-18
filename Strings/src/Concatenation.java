import java.util.ArrayList;

public class Concatenation {
    public static void main(String[] args) {
        System.out.println('a'+'b');//195->characters get converted into ascii values
        System.out.println("a"+"b");//ab
        System.out.println("a"+3);//a3->int will be converted to Integer that will call toString()
        System.out.println((char)('a'+3));//d
        System.out.println("Nil"+ new ArrayList<>());//Nil[]

        //using concat method
        String s1 = "Nil";
        String s2 = "anjan";
        String name = s1.concat(s2);
        System.out.println(name);//Nilanjan

        //using StringBuilder (best as it edits existing string without creating another)
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<26;i++){
            char c = (char)('a'+i);
            sb.append(c);
        }
        System.out.println(sb);//abcdefghijklmnopqrstuvwxyz
    }
}
