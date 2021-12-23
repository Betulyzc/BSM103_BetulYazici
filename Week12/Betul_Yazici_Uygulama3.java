package Uygulama3;

import java.util.Scanner;

public class Betul_Yazici_Uygulama3 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Dizinizin eleman sayısını giriniz: ");
        int elemanSayısı=input.nextInt();

        int[] dizi=new int[elemanSayısı];

        for(int index=0;index<dizi.length;index++){

            System.out.print((index)+". indexsin değerini giriniz: ");
            dizi[index]=input.nextInt();

        }

        double ortalama=ortalama(dizi);
        System.out.println("Dizideki elemanların ortalaması: "+ortalama);



    }

    public static double ortalama(int[] dizi){
        double ortalama=0.0;
        double toplam=0.0;
        for (int index=0;index<dizi.length;index++){
            toplam+=dizi[index];
        }
        ortalama=toplam / dizi.length;

        return ortalama;

    }


}
