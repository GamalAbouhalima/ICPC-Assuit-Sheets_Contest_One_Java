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
    static void  Ali_Baba_and_Puzzles(){
        Scanner scan=new Scanner(System.in);
        long a=scan.nextLong();
        long b=scan.nextLong();
        long c=scan.nextLong();
        long d=scan.nextLong();

        long res1=a*b-c;
        long res2=a*b+c;
        long res3=a-(b*c);

        long res4=a+(b*c);
        long res5=a+b-c;
        long res6=a-b+c;
        

        if(res1==d ||res2==d ||res3==d ||res4==d ||res5==d ||res6==d){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }


    }
    static void Interval_Sweep(){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b =scan.nextInt();
        int c=a-b;
       if((a==0 && b==0)||Math.abs(c) >= 2){
           System.out.println("NO");
       }else{
           System.out.println("YES");
       }

    }
    static void Adding_Bits(){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=a ^ b;
        System.out.println(c);

    }

    static void Katryoshka(){
        Scanner scan=new Scanner(System.in);
        long eyes=scan.nextLong();
        long mouth=scan.nextLong();
        long body=scan.nextLong();
        long katryoshka=0;

        if(eyes==0 || body==0){
            System.out.println(0);
        }else {
            if((mouth >= eyes && mouth >= body)||
                    (mouth >= body && mouth < eyes)
                    || (mouth < body && mouth >= eyes)){

                katryoshka=Math.min(eyes,body);
                System.out.println(katryoshka);

            }else if (mouth < eyes && mouth < body){
                katryoshka=mouth;
                eyes-=mouth;
                body-=mouth;
                katryoshka+=Math.min(eyes/2,body);
                System.out.println(katryoshka);
            }
        }



    }
    public static void main(String[] args) {
//        Winter_Sale();
//        Memo_and_Momo();
//        Next_Alphabet();
//        Ali_Baba_and_Puzzles();
//        Interval_Sweep();
//        Adding_Bits();
        Katryoshka();
    }

}