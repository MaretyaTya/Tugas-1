import java.util.Scanner;
public class minValue{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int terkecil;
		char ulangi = 'y';
		int pilih;

		int baris, kolom;
		System.out.print("Masukkan Size Baris Array: ");
		baris = scan.nextInt();

		System.out.print("Masukkan Size Kolom Array: ");
		kolom = scan.nextInt();

		int[][] nilai = new int[baris][kolom];
		
		int posisiBaris = 0;
		int posisiKolom = 0;
		//input angka
		do{
			int j=0;
			do{

				System.out.print("Input Nilai Ke [" + i + "][" + j + "]" + ": ");
				nilai[i][j] = scan.nextInt();
				j++;
			}while(j < kolom);
			System.out.println();
			i++;
		}while(i < baris);
		terkecil = nilai[0][0];

		//lakukan perulangan menu
		do{
			ulangi = 'n';
			System.out.println("------------------------------------------------------------");
			System.out.println("Pilih Menu :");
			System.out.println("[1] Mencari Nilai Terkecil");
			System.out.println("[2] Mencari Nilai Terkecil dan Index pada Array");
			System.out.println("[3] Melihat Kondisi Array dengan Angka 50");
			System.out.println("------------------------------------------------------------");
			System.out.print("Masukan input anda = ");
			pilih = scan.nextInt();
			System.out.println("------------------------------------------------------------");
			if(pilih == 1){
				i = 0;
				do{
					for(int j = 0; j < kolom; j++){
						if(terkecil > nilai[i][j]){
							terkecil = nilai[i][j];
						}
					}
					i++;
				}while(i < baris);
				System.out.println("Angka terkecil adalah " + terkecil);
			}else if(pilih == 2){
				int jumlahTerkecil = 1;
				boolean check = false;
				i = 0;

				//menentukan nilai terkecil
				do{
					for(int j = 0; j < kolom; j++){
						if(terkecil >= nilai[i][j]){
							terkecil = nilai[i][j];
						}
					}
					i++;
				}while(i < baris);
				System.out.println("Angka Terkecil Adalah " + terkecil);
				System.out.print("Angka Terletak di = ");
				//pengecekan nilai
				do{
					i = 0;
					do{
						for(int j = 0; j < kolom; j++){
							if(terkecil == nilai[i][j]){
								posisiBaris = i;
								posisiKolom = j;
								jumlahTerkecil += 1;
								System.out.println("nilai[" + posisiBaris + "][" + posisiKolom +"]");
							}
						}
						i++;
					}while(i < baris);
					if(jumlahTerkecil > 1){
						System.out.println("Sehingga, jumlah Angka Terkecil " + (jumlahTerkecil-1));
					}else{
						System.out.println("Sehingga, jumlah Angka Terkecil " + jumlahTerkecil);
					}
					check = true;
				}while(check = false);
			}else if(pilih == 3){
				boolean kondisi = false;
				i = 0;
				do{
					for(int j = 0; j < kolom; j++){
						if(nilai[i][j] == 50){
							posisiBaris = i;
							posisiKolom = j;
							kondisi = true;
							System.out.println("Ada angka 50, pada array baris ke " + posisiBaris + " dan kolom ke " + posisiKolom);
						}
					}
					i++;
				}while(i < baris);
				if(kondisi != true){
					System.out.println("Tidak ada");
				}
			}
			System.out.println("============================================================");
			System.out.print("Ulangi perhitungan? ");
			ulangi = scan.next().charAt(0);
		}while(ulangi == 'y' || ulangi == 'Y');		
	}
}