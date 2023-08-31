import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        calc c = new calc();
        System.out.println("Enter a number:");
        int num = i.nextInt();
        System.out.println(c.func(num));
    }
}

     class calc {
        String func(int n) {
            if (n % 2 == 0)
                return ("Even");
            else
                return ("Odd");
        }
    }
