public class reverse{
    public static void main(String[] args) {
        int n =1320;
        while(n>0){
            int lastno =n%10;
            System.out.print(lastno +" ");
            n= n/10;
        }
       

    }
}