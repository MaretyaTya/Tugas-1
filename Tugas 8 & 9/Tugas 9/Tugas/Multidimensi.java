import java.util.Scanner; 
class Multidimensi { 
    public static void main (String []args){ 
    Scanner sc=new Scanner (System.in); 
 
    int n,m; 
    int MatrikA [][]; 
    int hasil=0, pilih, min=0, angka1, angka2, cek=0; 
    String nilai="ab"; 
 
    System.out.print ("Masukkan jumlah baris matrik= "); 
    n=sc.nextInt(); 
    System.out.print ("Masukkan jumlah kolom matrik= "); 
    m=sc.nextInt(); 
    MatrikA =new int[n][m]; 
 
    System.out.println ("Input Elemen Matriks A"); 
    for (int i=0; i<n; i++){ 
        for (int j=0; j<m; j++){ 
        System.out.print ("Matrik A ["+i+"]["+j+"] :"); 
        MatrikA [i][j]=sc.nextInt(); 
        } 
        System.out.println (); 
    } 
 
    System.out.println ("-----------------Pilihan Menu--------------");
    System.out.println ("1. Mencari nilai minimal"); 
    System.out.println ("2. Mencari nilai minimal dan jumlahnya"); 
    System.out.println ("3. Mengecek keberadaan nilai 50"); 
    System.out.println ("-------------------------------------------"); 
 
    System.out.print ("Masukkan pilihan anda : "); 
    pilih=sc.nextInt(); 
 
    if (pilih==1){ 
        for (int i=0; i<n; i++){ 
            for (int j=0; j<m; j++){
                angka1=MatrikA [i][j]; 
                angka2=MatrikA [0][0];
                if (angka1<angka2)    
                min=angka1; 
                if (angka2<angka1) 
                min=angka2; 
            }   
        }  
        System.out.println ("Elemen Matriks terkecil adalah "+min); 
    } 
 
    if (pilih==2){ 
        for (int i=0; i<n; i++){ 
            for (int j=0; j<m; j++){
                angka1=MatrikA [i][j]; 
                angka2=MatrikA [0][0]; 
                if (angka1<angka2)    
                min=angka1; 
                if (angka2<angka1) 
                min=angka2; 
            }   
        }
        for (int i=0; i<n; i++){ 
            for (int j=0; j<m; j++){ 
                if (MatrikA [i][j]==min)    
                hasil=hasil+1; 
            } 
        } 
        for (int i=0; i<n; i++){ 
            for (int j=0; j<m; j++){ 
                if (MatrikA [i][j]==min) 
                System.out.println ("Index matriks minimal adalah ["+i+","+j+"]"); 
            }    
        } 
         System.out.println ("Elemen Matriks terkecil adalah "+min); 
        System.out.println ("Banyak elemen terkecil adalah "+hasil); 
    }

    if (pilih==3){ 
        cek=50; 
        nilai ="TIDAK ADA";
        for (int i=0; i<n; i++){ 
            for (int j=0; j<m; j++){ 
                if (MatrikA [i][j]==cek)    
                nilai="ADA"; 
            }    
        } 
        System.out.println ("Elemen matriks bernilai 50 "+nilai); 
    } 
    } 
} 