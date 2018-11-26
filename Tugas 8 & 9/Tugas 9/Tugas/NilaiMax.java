import java.util.Scanner;
public class NilaiMax{
    public static void main(String[] args) {        //main methode
        Scanner sc = new Scanner(System.in);        //deklarasi scanner sc
        int[][] arr = new int[3][4];                //deklarasi array arr dengan 3 baris & 4 kolom
        int max = 0;                                //deklarasi wadah untuk menampung nilai elemen terbesar dari array
        
        for(int i=0; i<3; i++){                     //melakukan perulangan sebanyak baris
            for(int j=0; j<4; j++){                 //melakukan perulangan sebanyak kolom
                System.out.print("Input arr Ke [" + i + "][" + j + "]" + ": ");
                arr[i][j] = sc.nextInt();           //menyimpan inputan kedalam array index ke [i][j]
            }
            System.out.println();
        }
        
        for(int i=0; i<3; i++){                     
            for(int j = 0; j < 4; j++){
                if(max < arr[i][j]){                //membandingkan variable max apakah lebih besar dari arr[i][j]
                    max = arr[i][j];                //jika lebih besar maka arr[i][j] akan dinyatakan sebagai variable max
                }
            }
        }
        System.out.println(max);                     //menampilkan isi variable max
    }
}