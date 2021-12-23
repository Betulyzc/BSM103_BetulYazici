package Uygulama2;

import java.util.Scanner;

public class Betul_Yazici_Uygulama2 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Kaç öğrencinin notu girilecek: ");
        int ogrenciSayisi=input.nextInt();

        double[] ogrenciVize =new double[ogrenciSayisi];
        double[] ogrenciFinal=new double[ogrenciSayisi];
        double[] ortalamaOgrenci=new double[ogrenciSayisi];

        double notToplam=0.0;


        for(int artış=0;artış<ogrenciSayisi;artış++){
                System.out.print((artış+1)+". öğrencinin vize notunu giriniz: ");
                int vizeNotu=input.nextInt();
                ogrenciVize[artış]+=VizeNotuHesaplama(vizeNotu);

                System.out.print((artış+1)+". öğrencinin final notunu giriniz: ");
                int finalNotu=input.nextInt();

                ogrenciFinal[artış]+=FinalNotuHesaplama(finalNotu);
                ortalamaOgrenci[artış]=ogrenciVize[artış]*0.4+ogrenciFinal[artış]*0.6;
            }
        for(int sayac=0;sayac<ogrenciSayisi;sayac++){
            notToplam+=ortalamaOgrenci[sayac];

        }
        double SınıfOrtalaması=notToplam/ogrenciSayisi;

        for(int sayac2=0;sayac2<ogrenciSayisi;sayac2++){
            System.out.println();

            System.out.println((sayac2+1)+". öğrencinin Vize Notu: "+ogrenciVize[sayac2]+", final notu: "+ogrenciFinal[sayac2]+", ortalaması: "+ortalamaOgrenci[sayac2]);

            if(ortalamaOgrenci[sayac2]<SınıfOrtalaması)
                System.out.println((sayac2+1)+". öğrencinin ortalaması sınıf ortalaması altında kaldı.Sınıf Ortalaması: "+SınıfOrtalaması);
            else if(ortalamaOgrenci[sayac2]>SınıfOrtalaması)
                System.out.println((sayac2+1)+". öğrencinin ortalması sınıf ortalaması üstünde. Sınıf Ortalaması: "+SınıfOrtalaması);
        }

        }

        public static double VizeNotuHesaplama(int vizeNotu){
            double not=0.0;
            if (vizeNotu>=80){
                not=vizeNotu*1.10;
            }else if (vizeNotu>=60){
                not=vizeNotu*1.05;
            }
            else
                not=vizeNotu;

            if (not>100)
                not=100;
            return not;

        }
        public static double FinalNotuHesaplama(int finalNotu){
            double not=0.0;
            if (finalNotu>=70){
                not=finalNotu*1.10;
            }
            else if (finalNotu>=40){
                not=finalNotu*1.05;

            }
            else
                not=finalNotu;
            if (not>100)
                not=100;
            return not;

        }
}
