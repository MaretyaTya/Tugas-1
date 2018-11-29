import java.util.Scanner;
    class Sandbox{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][]arr=new int[3][2];
        
        for(int p=0; p<arr.length; p++){
            for(int q=0; q<arr.length; q++){
                System.out.print("input : ");
                arr[p][q]=sc.nextInt();
            }
        }
        
        for(int p=0; p<arr.length; p++){
            for(int q=0; q<arr.length; q++){
                System.out.println(arr[p][q]+" ");
            }
        }
    }
}