//  how to solve pair elements  ex:- [2,4,6,8,10]
public class Pair {
 public static void pariPairs(int num []){
    for (int i=0; i<=num; i++){
        int curr =num [i]; //{2,4,6,8,10};
        for (int j=i+1; j<num.length; j++ )
        {
            System.out.println("(" + curr + "," + num [j] + ")");
        }
     System.out.println();
    }
 }

    public static void main(String[] args) {
        int num [] ={2,4,6,8,10};
    }
    
}
