
public class palindrome {
    public static void palin(String str){
        int n = str.length;
        for(int i = 0; i<n; i++){
        if(str.charAt(i) = str.charAt(n-i)){
           System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    }
    public static void main(String[]args){
        String str = "Madam";
        palin(str);
    }
    
}