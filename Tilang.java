import java.util.Scanner;

public class Tilang {
    public static void main (String[] args){
        boolean sim = false;
        String sim1;
        boolean stnk = false;
        String stnk1;
        Scanner scanSim = new Scanner(System.in);
        Scanner scanStnk = new Scanner(System.in);

        System.out.println("Apakah kamu memiliki sim?(iya/tidak) ");
        sim1 = scanSim.nextLine();
        if (sim1.equals("iya")){
            sim = true;
        }

        System.out.println("Apakah kamu memiliki stnk?(iya/tidak) ");
        stnk1 = scanStnk.nextLine();
        if (stnk1.equals("iya")){
            stnk = true;
        }

        System.out.println("");
        System.out.println("Mari kita cek, apakah anda akan ditilang atau tidak? ");

        if (sim == true && stnk == true){
            System.out.println("Anda tidak akan ditilang");
        }
        else if (sim == true && stnk == false){
            System.out.println("Anda akan ditilang");
        }
        else if (sim == false && stnk == true){
            System.out.println("Anda akan ditilang");
        }
        else if (sim == false && stnk == false){
            System.out.println("Anda akan ditilang");
        }
    }
}