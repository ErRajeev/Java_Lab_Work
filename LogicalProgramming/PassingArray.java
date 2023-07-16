class PassingArray{
    static void  display(int [] x){
        for(int i:x)
            System.out.println(i);
    }
    public static void main(String arg[]){
        int []arr = {1,2,3,4,5};
        display(arr);
    }
}