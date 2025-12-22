public class solidHollo {
    public static void solid_holo(int n){
        for (int i=1; i<=n; i++){

             //space
             for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
             }

             //holl rectangle - star
             for(int j=1; j<=n; j++){
                if(i == 1|| i == n || j== 1 || j== n){
                    System.out.print("*");
                 }
                 else{
                    System.out.print(" ");
                 }
            }
         System.out.println();
        }
      
    }
    
    public static void main(String[] args) {
        solid_holo(5);
        
    }
}
