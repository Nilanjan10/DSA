import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee id : ");
        int empid = sc.nextInt();
        System.out.println("Enter department : ");
        String dept = sc.next();
        switch (empid){
            case 1:
                System.out.println("Nil ");
                break;
            case 2:
                System.out.println("Ambar ");
                break;
            case 3:
                System.out.println("Asif");
                switch (dept) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("Invalid department");

                }
                break;
            default:
                System.out.println("Invalid Employee id");

        }
    }
}
