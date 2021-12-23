package Uygulama1;

public class Betul_Yazici_Uygulama1 {
    public static void main(String[] args){
        ilkMetot();
        System.out.println();
        int donenDeger=ikinciMetot(5);
        System.out.println("İkinciMetot dönen değeri: "+donenDeger);
    }

    public static void ilkMetot(){
        System.out.println("İlk Metot...");

    }

    public static int ikinciMetot(int sayi){
        int donecekSayı=sayi;
        return donecekSayı;

    }
}