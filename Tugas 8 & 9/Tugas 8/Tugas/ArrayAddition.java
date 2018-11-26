import java.util.Scanner;
    class ArrayAddition{
    public static void main(String[] args) { //main methode
    Scanner sc=new Scanner(System.in);       //deklarasi scanner sc
        int[] arr1=new int[3];               //deklarasi arr1 dengan 3 elemen
        int[] arr2=new int[3];               //deklarasi arr2 dengan 3 elemen
       for(int i=0; i<3; i++){ //perulangan sebanyak 3 kali
           System.out.print("Input Arr1 Index ke-"+i+": ");
           arr1[i]=sc.nextInt(); //menyimpan inputan pada variable arr1[i]
       }
       for(int i=0; i<3; i++){
           System.out.print("Input Arr2 Index ke-"+i+": ");
           arr2[i]=sc.nextInt();
       }
       for(int i=0; i<3; i++){
            int Penjumlahan_Array=arr2[i]+arr1[i]; //rumus untuk menjumlahkan arr2 + arr1
            System.out.println("Hasil Penjumlahan Index ke-"+i+" antara arr1 + 2 adalah : "+ Penjumlahan_Array); //menampilkan hasil dari variable Penjumlahan_Array
        }
    }
}