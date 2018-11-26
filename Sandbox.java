import java.util.Scanner;
    class Sandbox{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr=new int[5];
        
        for(int p:arr){
            System.out.print("input : ");
            arr[p]=sc.nextInt();
        }
        for(int p=0; p<5; p++){
            System.out.println(arr[p]);
        }
    }
}