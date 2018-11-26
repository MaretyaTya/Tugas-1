import java.util.Scanner;
public class PineTree {
	public static void main(String[] args) {  //main class
		Scanner sc = new Scanner(System.in);  //deklarasi scanner
		System.out.print("Masukkan jumlah Baris : ");  //input dan menyimpan di variable n
        int n = sc.nextInt();
        
		if (n >= 2) {           //perintah yang dilakukan apabila variable n>=2
			for (int baris = 1; baris <= n; baris++) {  //deklarasi variable baris=1 dan menghentikan perulangan apabila baris<=n
				for (int kolom = 1; kolom <= n; kolom++) {  //deklarasi variable kolom=1 dan menghentikan perulangan apabila kolom<=n
					for (int a = n - kolom; a > 0; a--) {   //deklarasi variable a=n - kolom dan menghentikan perulangan apabila a>0
						System.out.print(" ");
					}
					for (int b = 1; b <= kolom * 2 - 1; b++) {  //deklarasi variable b=1 dan menghentikan perulangan apabila b<=kolom
					System.out.print("*");
					}
				System.out.println();
				}
			}
        }
        else{                   //perintah yang dilakukan apabila syarat if tidak terpenuhi
            System.out.println("Jumlah Baris minimal 2");
        }
	}	
}