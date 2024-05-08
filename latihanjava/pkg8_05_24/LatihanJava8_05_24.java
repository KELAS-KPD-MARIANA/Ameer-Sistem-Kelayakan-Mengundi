package latihanjava.pkg8_05_24;

import java.util.Scanner;

public class LatihanJava8_05_24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int umur;
        boolean status;
        
        System.out.println("Sila masukkan umur anda : ");
        umur = input.nextInt();
        
        System.out.println("Anda sudah mendaftar? (true/false) : ");
        status = input.nextBoolean();
        
        
        if(umur < 18 ){
            System.out.println("Anda terlalu muda dan tidak layak mengundi  : ");
        } else if(umur > 18 && status == false){
            System.out.println("Anda perlu mendaftar dahulu sebelum mengundi");
        } else {
            System.out.println("Anda layak mengundi");
        }
    }
}