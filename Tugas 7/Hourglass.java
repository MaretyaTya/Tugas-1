import java.util.Scanner;
public class Hourglass{

    public static void main(String[] args){ //Main class
    Scanner sc = new Scanner(System.in);    //Deklarasi Scanner

        System.out.print("Masukkan Baris yang Di inginkan : ");  //input dan menyimpan ke variable n
        int n=sc.nextInt();
        if (n>=2) {                                              //perintah yang dilakukan jika n lebih dari 2
	        for (int baris=n; baris>=1; baris--) {               //meng inisialisasi variable baris=n dan perulangan berhenti saat baris >= 1
	        	for (int kolom=1; kolom<=n-baris; kolom++) {     //deklarasi variable kolom perulangan utk mencetak spasi
	        		System.out.print(" ");		
	        	}
	        	for (int bintang=1; bintang<=2*baris-1;bintang++) { //perulangan utk mencetak bintang
	        		System.out.print("*");
	        	}
	        	System.out.print("\n");                             //utk mencetak spasi enter setiap perulangan diatas selesai dilakukan
	        }
	        for (int baris2=1; baris2<=n; baris2++) {               //meng inisialisasi variable baris2=1 dan perulangan berhenti saat baris2<=n
	        	for (int kolom2=1; kolom2<=n-baris2; kolom2++) {    //deklarasi variable kolom2 utk mencetak bintang 
	        		System.out.print(" ");		
                }
                for (int bintang2=1; bintang2<=2*baris2-1;bintang2++) { //perulangan utk mencetak bintang
	        		System.out.print("*");
	        	}
	        	System.out.print("\n");                                 //utk mencetak spasi enter setiap perulangan diatas selesai dilakukan
	        }	
        }
        else{                                                           //perintah yang dilakukan apabila syarat if tidak terpenuhi
        	System.out.print("input anda kurang!");
        }   
    }
}