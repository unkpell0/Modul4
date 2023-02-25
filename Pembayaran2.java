import java.util.*;

public class Pembayaran2 {
    public static void main(String[] args){
        String jawaban ="";
        String kondisiTidak, kondisiIya, kondisiIya2;
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);

        System.out.println("Apakah anda punya kartu member? (iya/tidak) ");
        jawaban = scan.nextLine();

        if (jawaban.equals ("iya")){
            System.out.println("Apakah belanjaan anda lebih dari 500 rb? (iya/tidak) ");
            kondisiIya = scan2.nextLine();

            if (kondisiIya.equals ("iya")){
                System.out.println("mendapatkan diskon 50 rb");
            } 
            else if (kondisiIya.equals ("tidak")){
                System.out.println("tidak mendapatkan diskon");
                System.out.println("Apakah belanjaan anda lebih dari 500rb? (iya/tidak) ");
                kondisiIya2 = scan3.nextLine();
                if (kondisiIya2.equals ("iya")){
                    System.out.println("mendapatkan diskon 15 rb");
                }
                else if (kondisiIya2.equals ("tidak")){
                    System.out.println("tidak mendapatkna diskon");
                }
            }
        }
        else if (jawaban.equals("tidak")){
            System.out.println("Apakah belanjaan anda lebih dari 100rb? (iya/tidak) ");
            kondisiTidak = scan3.nextLine();
            if (kondisiTidak.equals("iya")){
                System.out.println("mendapatkan diskon 10rb");
            }
            else if (kondisiTidak.equals("tidak")){
                System.out.println("tidak mendapatkan diskon");
            }
        }
    }
}