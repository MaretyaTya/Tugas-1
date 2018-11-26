import java.util.Scanner;
    class InputArray{
    public static void main(String[] args) { //main methode
    Scanner sc=new Scanner(System.in);       //membuat object scanner bernama sc
        int[] bil=new int[7];                //deklarasi array bil, integer dengan jumlah 7 elemen

       for(int i=0; i<7; i++){               //membuat perulangan yg dilakukan sebanyak 7 kali
           System.out.print("Masukan Bilangan ke-"+i+": ");
           bil[i]=sc.nextInt();              //menyimpan inputan pada array bil[i]
       }
       for(int i=0; i<7; i++){               
        System.out.println("Bilangan ke-"+i+" adalah: "+ bil[i]); //meng-output kan bil[i] sebanyak 7 kali
        }
    }
}  