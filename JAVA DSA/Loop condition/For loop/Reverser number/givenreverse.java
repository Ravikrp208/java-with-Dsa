
public class givenreverse{
    public static void main(String [] args){
        int n = 1320;
        int rev = 0;

        while (n > 0) {
            int lastno = n % 10;
            rev = (rev * 10) + lastno;  
            n = n / 10;
        //    System.out.print(lastno);
        }
        System.out.println(rev);
        
    }
}
