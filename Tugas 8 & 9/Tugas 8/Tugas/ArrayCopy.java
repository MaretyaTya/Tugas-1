import java.util.Scanner;
    class ArrayCopy{
    public static void main(String[] args) {//main methode
    Scanner sc=new Scanner(System.in);//membuat object scanner 
        int[] arr1=new int[4]; //deklarasi array arr1, integer dengan jumlah 4 elemen
        int[] arr2=new int[4];  //deklarasi array arr2, integer dengan jumlah 4 elemen

       for(int i=0; i<4; i++){//membuat perulangan yg dilakukan sebanyak 4 kali
            System.out.print("Inputan ke-"+i+": ");
           arr1[i]=sc.nextInt(); //menyimpan data pada variable arr[i]
       }

       for(int i=0; i<4; i++){//membuat perulangan yg dilakukan sebanyak 4 kali
            arr2[i]=arr1[i]; //memberi rumus variable arr2[i]=arr1[i]
            System.out.println("Arr2 ke-"+i+" adalah: "+ arr2[i]);
        }
    }
}