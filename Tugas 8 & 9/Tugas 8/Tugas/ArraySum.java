import java.util.Scanner;
    class ArraySum{
    public static void main(String[] args) { //main methode
    Scanner sc=new Scanner(System.in);       //deklarasi scanner sc
        System.out.print("Masukan jumlah Elemen : ");
        int n=sc.nextInt(); //menyimpan inputan pada variable n
        int[] bil=new int[n];    //membuat array dengan elemen sebanyak variable n

        for(int i=0; i<bil.length; i++){    //pengulangan dilakukan sebanyak total banyaknya elemen
           System.out.print("Input Array Index ke-"+i+": ");
           bil[i]=sc.nextInt();
       }
        int sum=0;
        for(int i=0; i<n; i++){
        sum=sum+=bil[i];    //memberi rumus pada variable sum untuk menjumlahkan bil[i] dengan variable sum
       }
       System.out.println("Nilai keseluruhan elemen array jika dijumlahkan adalah : " + sum);
    }
}