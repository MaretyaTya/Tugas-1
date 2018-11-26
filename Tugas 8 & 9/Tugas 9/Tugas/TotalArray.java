import java.util.Scanner; 
class TotalArray{ 
    public static void main (String []args){        //main methode
    Scanner sc=new Scanner (System.in);             //deklarasi scanner sc
 
    int[][]Array=new int [4][5];                    //membuat array dengan 4 baris dan 5 kolom
    int total=0;                    
 
        System.out.println ("Input Elemen Array"); 
        for(int iOuter=0; iOuter<4; iOuter++){      //membuat perulangan sebanyak jumlah baris
            for (int i=0; i<5; i++){                //membuat perulangan sebanyak jumlah kolom
                System.out.print ("Array ["+iOuter+"]["+i+"] :"); 
                Array[iOuter][i]=sc.nextInt();      //menyimpan data kedalam array 
            } 
            System.out.println (); 
        }

        for (int iOuter=0; iOuter<4; iOuter++){ 
            for (int i=0; i<5; i++){ 
                total=total+Array [iOuter][i];      //menjumlahkan variable total dengan elemen array ke [iOuter][i]
                if (iOuter==3 && i==4){             //jika penjumlahan sudah diulangi sebanyak 3 baris dan 4 kolom maka akan mencetak output
                    System.out.println ("Nilai penjumlahan semua elemen matrik adalah "+total); 
                }
            }
        } 
    } 
} 
