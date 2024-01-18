public class factorial {
    public static int fact(int x){
        if(x == 0){
            System.out.println(0);
        }
        if(x==1){
            System.out.println(1);
        }
        return x* fact(x-1);
        }
        

    public static void main(String [] args){
        int x = 5;
       fact(x);
    }

}