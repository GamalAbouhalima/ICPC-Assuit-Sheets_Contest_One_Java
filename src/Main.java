import java.util.Scanner;

public class Main {
    static void  Winter_Sale(){
        Scanner scan=new Scanner(System.in);
        double discount=scan.nextInt();                 // 15
        double priceAfterDiscount=scan.nextDouble();    // 20

        double ThePercentageOfTheOriginalShirtAfterTheDiscount=100-discount; // 100-15=85
        double deducted=priceAfterDiscount/ThePercentageOfTheOriginalShirtAfterTheDiscount; // 20/85=0.235
        double totalBeforeTheDiscount=(deducted*discount)+priceAfterDiscount; // (0.235*15)+20=23.529
        System.out.println(totalBeforeTheDiscount);
    }
    public static void main(String[] args) {
        Winter_Sale();


    }

}