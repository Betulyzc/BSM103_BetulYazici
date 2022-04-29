import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle{

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Sayiyi giriniz: ");
        int sayi=scan.nextInt();
        System.out.println(PascalTriange(sayi));


    }

    public static ArrayList<ArrayList<Integer>> PascalTriange(int numRows){
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for (int i=0; i<numRows;i++) {
            list.add(new ArrayList<>());
        }

        for (int i=0;i<numRows;i++){
            for (int j=0;j<i+1;j++){
                if (j==0 || j==i){
                    list.get(i).add(1);
                }else{
                    int med=list.get(i-1).get(j)+list.get(i-1).get(j-1);
                    list.get(i).add(med);
                }
            }
        }
        return list;
    }
}
