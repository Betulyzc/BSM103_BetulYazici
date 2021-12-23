package Uygulama4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Bir kelime giriniz: ");
        String kelime=input.next();

        System.out.println("Girilen Kelime: "+kelime);
        System.out.println("Girdiğiniz kelimenin tersten yazılımı: "+ TerstenYazma(kelime));

    }
    public static String TerstenYazma(String kelime){
        String Ters="";
        for(int index=kelime.length();index>0;index--){
            Ters+=kelime.substring(index-1,index);
        }
        return Ters;

    }
}