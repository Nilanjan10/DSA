
import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //CELSIUS TO FAHRENHEIT
        System.out.println("Enter temperature in C: ");
        float tempC = sc.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println("Temperature in F: " +tempF);
        //FAHRENHEIT TO CELSIUS
        System.out.println("Enter temperature in F: ");
        float tF = sc.nextFloat();
        float tC = (tF-32) * 5/9;
        System.out.println("Temperature in C: " + tC);
    }
}
