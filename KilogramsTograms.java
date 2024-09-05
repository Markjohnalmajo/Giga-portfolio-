import java.util.Scanner;

public class KilogramsToGrams {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter grams in kilograms: ");
         double kilograms = scanner.nextDouble();
       
        double grams = kilograms * 1000;
       
        System.out.println(kilograms + " kilograms is equal to " + grams + " grams.");
       
    }
}