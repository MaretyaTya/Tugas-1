import java.util.Scanner;
    class OddEven{
    public static void main(String[] args) {    //main methode
    Scanner sc=new Scanner(System.in);          //deklarasi scanner sc
        System.out.print("Masukan jumlah Elemen : ");
        int n=sc.nextInt();         //menyimpan inputan pada variable n
        int[] bil=new int[n];       //deklarasi array dengan jumlah elemen sebanyak n

        for(int i=0; i<bil.length; i++){    //perulangan dilakukan sebanyak jumlah total array
           System.out.print("Input Array Index ke-"+i+": ");
           bil[i]=sc.nextInt();             
        }

       System.out.println("Ganjil :");
       for(int i=0; i<bil.length; i++){
            if(bil[i]%2==1){                //jika di modulus 2 hasilnya satu maka dinyatakan ganjil
                System.out.println(bil[i]);
            }
        }

        System.out.println("Genap :");
        for(int i=0; i<bil.length; i++){
            if(bil[i]%2==0){                //jika di modulus 2 hasilnya 0 maka dinyatakan genap
                System.out.println(bil[i]);
            }
        }
       
    }
}