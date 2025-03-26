
import java.util.Scanner;


public class AutoLoan {
    public static void main(String[] args){
        Scanner keyb = new Scanner(System.in);
        double monPay = 0.0, intRate = 0.0, prin = 0.0, numMon = 0.0, total = 0.0, tax = 0.0, priceTag = 0.0;
        
        System.out.print("What's the original price on the car? (Not the loan amount): ");
        priceTag = keyb.nextDouble();
        System.out.print("Please enter the loan principal amount(The amount you need to finance the car, excluding any down payments): ");
        prin = keyb.nextDouble();
        System.out.print("Please enter interest rate(ex: 3% should be .03, not 3): ");
        intRate = keyb.nextDouble();
        System.out.print("Please enter the term length in months: ");
        numMon = keyb.nextDouble();
        
        monPay = (intRate/12 * prin)/(1 - Math.pow(1 + intRate/12, -numMon));
        total = monPay * numMon;
        tax = (priceTag - 20) * .0325;
        System.out.printf("The payments will be: $%.2f", monPay);
        System.out.println(" ");
        System.out.printf("Your total will be: $%.2f", total);
        System.out.println(" ");
        System.out.printf("The total interest will be: $%.2f ", total - prin );
        System.out.println(" ");
        System.out.printf("The Oklahoma tax on autos will be: $%.2f ", tax);
        System.out.println(" ");
    }
}


