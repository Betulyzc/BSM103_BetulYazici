import java.util.Scanner;
import java.util.Stack;

public class PalindromeStack {

    public static void main(String[] args) {

        System.out.print("Lütfen bir string giriniz: ");
        Scanner in=new Scanner(System.in);
        String inputString=in.nextLine();

        Stack stack=new Stack();

        for(int index=0;index<inputString.length();index++){
            stack.push(inputString.charAt(index));
        }
        String reverseString=" ";
        while(!stack.isEmpty()){
            reverseString+=stack.pop();
        }

        if (inputString.equals(reverseString)){
            System.out.println("Girilen kelime palindromdur.");
        }
        else{
            System.out.println("Girilen kelime palindrom değildir.");
        }

    }
}
