import java.util.Scanner;

public class Delimeters {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 integers on the same line\n");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("Enter 2 very big on the same line\n");
        long long1 = scan.nextLong();
        long long2 = scan.nextLong();

        System.out.println("Enter 2 decimals on the same line\n");
        double double1 = scan.nextDouble();
        double double2 = scan.nextDouble();

        System.out.println("Enter 2 text values on the same line\n");
        String string1 = scan.next();
        String string2 = scan.next();

        System.out.println("You've entered:\n" + num1 + ", " + num2 + ";\n" + long1 + ", " + long2 + ";\n" + string1 + ", " + string2);
    }
}
