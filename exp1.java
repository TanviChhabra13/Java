package class_Exp;
import java.util.Scanner;

public class exp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int vow = 0, cons = 0, dig = 0, speCh = 0;

        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') 
            {
                if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') 
                {
                    vow++;
                } 
                else 
                {
                    cons++;
                }
            } 
            else if (ch >= '0' && ch <= '9') {
                dig++;
            } else {
                speCh++;
            }
        }

        System.out.println("Vowels: " + vow);
        System.out.println("Consonants: " + cons);
        System.out.println("Digits: " + dig);
        System.out.println("Special characters: " + speCh);

        scanner.close();
    }
}
