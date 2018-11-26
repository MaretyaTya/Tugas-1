import java.util.Scanner;
class Arr3While{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [][] nilai=new int [2][3];

        int a=0;
        while(a<2){
            int b=0;
            while(b<3){
                System.out.print("Masukkan nilai ke-["+a+"]["+b+"] : ");
                nilai[a][b]=input.nextInt();
                b++;
            }
            System.out.println("------------------------");
            a++;
        }
        int j=0;
        while(j<2){
            int b=0;
            while(b<3){
                System.out.print(nilai[j][b]+" ");
                b++;
            }
            System.out.println();
            j++;
        }
    }
}