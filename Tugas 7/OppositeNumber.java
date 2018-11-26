import java.util.Scanner;
	public class OppositeNumber{
		public static void main(String[] args) {   //main class
			Scanner sc = new Scanner(System.in);   //deklarasi scanner
			System.out.print("Masukkan Baris (minimal 2) : "); //input dan menyimpan ke variable n
            int n = sc.nextInt();
            
			if (n > 1) { //perintah yang dilakukan apabila variable n>1
				for (int baris = 1; baris <= n; baris++) { //deklarasi variable baris=1 dan menghentikan perulangan saat variable baris<=n
					if (baris % 2 != 0) {   //jika hasil dari baris%2 tidak sama dengan 0 maka lakukan perintah dibawah
						for (int a = 1; a <= n; a++) {   //deklarasi variable a=1 dan menghentikan perulangan jika variable a<=n
						System.out.print(a + " ");
						}
					} else {
						for (int b = n; b >= 1; b--) { //deklarasi variable b=n dan hentikan perulangan saat variable b>=1
						System.out.print(b + " ");
					}
				}
			    System.out.println();
			    }
            }
            else{ //perintah yang dilakukan apabila syarat if tidak terpenuhi
                System.out.println("Jumlah baris anda kurang");
            }
	}
}
