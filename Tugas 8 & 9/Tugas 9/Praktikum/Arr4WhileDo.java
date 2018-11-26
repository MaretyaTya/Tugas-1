import java.util.Scanner;
class Arr4WhileDo{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int barisA, kolomA;
        System.out.print("Masukkan Size Baris Matriks A : ");
        barisA = input.nextInt();
        System.out.print("Masukkan Size Kolom Matriks A : ");
        kolomA = input.nextInt();
    int[][] MatrikA = new int[barisA][kolomA];
    System.out.println("Input Elemen Matriks A : ");
        int i=0;
        while(i<barisA){
            int j=0;
            while(j<kolomA){
                System.out.print("Matrik A[" + i + "][" + j + "]" + ": ");
                MatrikA[i][j] = input.nextInt();
                j++;
            }
            System.out.println();
            i++;
        }
    System.out.println("Hasil output matriknya adalah : ");
        int a=0;
        do{
            int b=0;
            do{
                System.out.print(MatrikA[a][b]+" ");
                b++;
            }while(b<kolomA);   
            System.out.println();
            a++;
        }while(a<barisA);
    }
}