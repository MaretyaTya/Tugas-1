import java.util.Scanner;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int[] myArray=new int[5];
        for(int i=0; i < 5; i++){
            System.out.print("inputan array ke " + i + " = ");
            myArray[i]=sc.nextInt();
        }

        for(int b=0; b < 5; b++){
            System.out.println(myArray[b]);
        }
    }
}