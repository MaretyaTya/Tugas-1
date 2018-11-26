import java.util.Scanner;
    class ReversedArray{
    public static void main(String[] args) { //main methode
    Scanner sc=new Scanner(System.in);       //membuat object scanner 
        int[] bil=new int[6];                //deklarasi array bil, integer dengan jumlah 6 elemen

       for(int i=0; i<4; i++){//membuat perulangan yg dilakukan sebanyak 4 kali
           System.out.print("Bilangan ke-"+i+": ");
           bil[i]=sc.nextInt(); //menyimpan data pada variable bil[i]
       }
       for(int i=3; i>=0; i--){ //membuat perulangan sebanyak 3 kali
        System.out.println("Bilangan ke-"+i+" adalah: "+ bil[i]);
        }
    }
}