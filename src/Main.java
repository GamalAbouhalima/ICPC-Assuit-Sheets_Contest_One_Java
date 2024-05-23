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
    static void Next_Alphabet(){
        Scanner scan=new Scanner(System.in);
        char letter=scan.next().charAt(0);
        int asciiNum=letter;
        if(asciiNum>=97 &&asciiNum<122){
            asciiNum++;
            char l=(char)asciiNum;
            System.out.println(l);

        }else {
            asciiNum=122-25;
            char l=(char)asciiNum;
            System.out.println(l);
        }

    }
    public static void main(String[] args) {
//        Winter_Sale();
//        Memo_and_Momo();
        Next_Alphabet();

    }

}