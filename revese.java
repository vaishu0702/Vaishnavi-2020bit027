import java.util.Scanner;
public class revese{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the string");
         String str = input.nextLine();
         int n = str.length;
         for(int i = 0; i<n/2; i++){
            str.charAt(i) = str.charAt(n-i);
         }

         System.out.println(str);


        

        

    }
}