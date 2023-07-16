package PrintingPattern;

public class Third {
    public static void main(String arg[]) {
        for(int i = 0; i<5; i++){
            for(int j = 5; j>i; j--){
                System.out.print("*\t");
            }
            System.out.println("\n");
        }
    }
    
}
