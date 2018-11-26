import java.util.Scanner; 
 
class IsiArray { 
    public static void main (String []args){ 
    Scanner input=new Scanner (System.in); 
 
    int [][] MatrikA=new int [4][5]; 
    int hasil=0; 
 
    System.out.println ("Input Elemen Matriks A"); 
    for (int i=0; i<4; i++){ 
        for (int j=0; j<5; j++){
            System.out.print ("Matrik A ["+i+"]["+j+"] :"); 
            MatrikA [i][j]=input.nextInt(); 
        } 
        System.out.println (); 
  } 
    for (int i=0; i<4; i++){ 
        for (int j=0; j<5; j++){ 
            hasil=hasil+MatrikA [i][j]; 
            if (i==3 && j==4){
                System.out.println ("Nilai penjumlahan semua elemen matrik adalah "+hasil); 
            } 
        } 
     
  } 
 } 
} 
