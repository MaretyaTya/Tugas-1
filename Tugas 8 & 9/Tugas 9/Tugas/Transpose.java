import java.util.Scanner; 
class Transpose { 
    public static void main (String []args){    //main methode
    Scanner sc=new Scanner (System.in);         //deklarasi scanner sc
 
    int barisA, kolomA;                         //deklarasi variable
 
    System.out.print ("Masukkan size baris matriks A : "); 
    barisA=sc.nextInt();                        //menyimpan inputan pada variable barisA
    System.out.print ("Masukkan size kolom matriks A : "); 
    kolomA=sc.nextInt();                        //menyimpan inputan pada variable barisA
 
    int [][] MatrikA=new int [barisA][kolomA];  //membuat array dengan baris sebanyak [barisA] dan kolom [kolomA]
 
    System.out.println ("Input Elemen Matriks A: "); 
 
    for (int i=0; i<barisA; i++){               //pengulangan yang dilakukan sebanyak baris
        for (int j=0; j<kolomA; j++){           //pengulangan yang dilakukan sebanyak kolom
            System.out.print ("Matrik A ["+i+"]["+j+"] :"); 
            MatrikA [i][j]=sc.nextInt();        //menyimpan pada array MatrikA
        } 
        System.out.println (); 
    }
    System.out.println ("Hasil Transpose Matriks A adalah"); 
    for (int j=0; j<kolomA; j++){                //pengulangan yang dilakukan sebanyak kolomA
        for (int i=0; i<barisA; i++){            //pengulangan yang dilakukan sebanyak barisA
            System.out.print (MatrikA [i][j]+"  ");     //output MatrikA
        } 
        System.out.println (); 
    } 
    } 
} 