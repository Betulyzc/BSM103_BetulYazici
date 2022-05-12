import java.util.Scanner;
import java.util.Stack;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println("Enter Your Word: ");
        Scanner input=new Scanner(System.in);
        String word=input.nextLine();
        Stack stack=new Stack();

        for(int i=0; i<word.length();i++) {
            stack.push(word.charAt(i));
        }
        String space="";

        while(!stack.isEmpty()){
            space=space+stack.pop();
        }
        if(word.equals(space)){
            System.out.println("Girdi Palindromdur.");
        }else{
            System.out.println("Girdi Palindrome değildir.");
        }

    }
}
