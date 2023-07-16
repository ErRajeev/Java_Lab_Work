package PrintingPattern;

public class FloydsTrangle {
    public static void main(String arg[]){
        int count = 1;
        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(count++ + "\t");
            }
            System.out.println("\n");
        }
    }
}


// public class FloydsTrangle {
//     public static void main(String arg[]){
//         int count = 1;
//         for(int i = 1; i<=5; i++){
//             for(int j = 1; j<=(5-i+1); j++){
//                 System.out.print(count++ + "\t");
//             }
//             System.out.println("\n");
//         }
//     }
// }