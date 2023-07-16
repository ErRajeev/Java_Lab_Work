package PrintingPattern;

public class HolowRect{
    public static void main(String arg[]){
        int i, j;
        for(i =0; i<5; i++){
            for(j=0; j<5; j++){
                if(i== 0 || j ==0 || i==4 || j==4){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println("\n");
        }
    }
}