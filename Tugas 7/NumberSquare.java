import java.util.Scanner;
public class NumberSquare{
	public static void main(String[] args) {  //main class
		Scanner sc = new Scanner(System.in);  //deklarasi Scanner
		System.out.print("Masukkan n : ");    //input dan menyimpan ke variable n
        int n=sc.nextInt();
        
		if (n>=3){  //lakukan perintah dibawah apabila n>=3
			for (int baris=1; baris<=n; baris++){ //deklarasi variable int=1 dan menghentikan perulangan saat variable baris<=n
				for (int kolom=1; kolom<=n; kolom++) { //deklarasi variable kolom=1 dan menghentikan perulangan saat variable kolom<=n
					if (baris==1 || baris==n || kolom==1 || kolom==n){ //jika baris==1 atau baris==n atau kolom==1 atau kolom==n lakukan perintah berikut
						System.out.print(n);      
					}
					else{
						System.out.print(" ");   
					}	
				}
				System.out.println(); //menginputkan spasi enter disetiap perulangan diatas selesai 
			}
        }
        else{  //jika syarat if tidak terpenuhi lakukan perintah berikut
			System.out.println("Angka harus lebih dari 3 ");
		}
	}
}