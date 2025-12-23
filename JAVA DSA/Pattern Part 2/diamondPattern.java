public class diamondPattern {
    public static void Diamond_Pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){

                //space print hoga
                System.out.print(" ");

            }

            //start print hoga
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
         }
         //2nd half print hoga
         for(int i=n; i>=1; i--){
            for(int j=1; j<=(n-i); j++){

                //space print hoga
                System.out.print(" ");

            }
            //start print hoga
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
       
    }
    public static void main(String[] args) {
        Diamond_Pattern(5);
    }
}

