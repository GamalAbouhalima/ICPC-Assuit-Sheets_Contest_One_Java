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
    static void Memo_and_Momo(){
        Scanner scan=new Scanner(System.in);
        long a=scan.nextLong();
        long b=scan.nextLong();
        long k=scan.nextLong();

        if(a%k==0 && b%k==0){
            System.out.println("Both");
        } else if (a%k==0 && b%k!=0) {
            System.out.println("Memo");
        }else if (b%k==0 && a%k!=0) {
            System.out.println("Momo");
        } else if(a%k!=0 && b%k!=0){
            System.out.println("No One");
        }

    }
    public static void main(String[] args) {
//        Winter_Sale();
        Memo_and_Momo();


    }

}