import java.util.Scanner;
	public class PrimeNumber {
		public static void main(String[] args) { //main class
		Scanner sc = new Scanner(System.in);     //deklarasi scanner
		System.out.print("Masukkan nilai N :");  //inpput dan menyimpan ke variable n
		int n = sc.nextInt();
			if (n > 0) {    //perintah yang dilakukan apabila variable n>0
				for (int baris = 1; baris <= n; baris++) { //deklarasi variable baris=1 dan menghentikan perulangan saat baris<=n
					int prime = baris * 2 - 1;             //deklarasi dan memberi rumus pada variable prime
					if (baris == 1) {                       //perintah yang dilakukan apabila variable baris == 1
						prime = baris * 2;                  //pemberian rumus pada variable prime
					}
				System.out.print(prime + " ");
			}
        }
        else{               //perintah yang dilakukan apabila syarat if tidak terpenuhi
            System.out.println("Nilai N minimal 1");
        }
	}
}