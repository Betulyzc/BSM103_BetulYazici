package Uygulama5;
import java.util.Scanner;
public class Betul_Yazici_Uygulama5 {
    public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);

        System.out.print("Bir kelime giriniz: ");
        String inputStr=input.next();

        System.out.print("Bir sayı giriniz: ");
        int inputInt=input.nextInt();

        splitter(inputStr,inputInt);

    }
    public static void splitter(String str,int n){
        int index=0;
        for(int i=0;i<str.length() /n;i++){
            System.out.println(str.substring(index,index+n));
            index=index+n;
        }
        System.out.println(str.substring(index,str.length()));
        }
    }


