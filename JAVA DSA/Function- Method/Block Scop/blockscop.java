// block scope in java 

public class blockscop {
    // method funtion class
    public static void printS(){
        int a =45;
    } 
    public static void main (String args []){
        // int a=40;
        {
            int s=34; 
            System.out.println(s);

        }
        int a=40;
        System.out.println(a);
        
    }
    
}
