package Uygulama6;

import java.util.Arrays;

public class Betul_Yazici_Uygulama6 {
    public static void main(String[] args) {
        int x=0;
        int[] arr=new int[4];
        x=x+1;
        mystersy(x,arr);
        System.out.println(x+" "+Arrays.toString(arr));
        x=x+1;
        mystersy(x,arr);
        System.out.println(x+" "+Arrays.toString(arr));
    }
    public static void mystersy(int x,int []arr){
        x=x+1;
        arr[x]=arr[x]+1;
        System.out.println(x+" "+Arrays.toString(arr));
    }
}
