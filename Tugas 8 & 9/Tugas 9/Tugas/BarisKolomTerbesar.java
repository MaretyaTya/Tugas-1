import java.util.Scanner;
public class BarisKolomTerbesar{
	public static void main(String[] args) {	//main methode
		Scanner sc = new Scanner(System.in);	//deklarasi scanner sc
		int[][] array = new int[3][5];			//deklarasi array dengan 3 baris dan 5 kolom
		
		int i = 0;								//deklarasi variable
		int terbesarKolom = 0;
		int terbesarBaris = 0;
		int posisiKolom = 0;
		int posisiBaris = 0;

		do{
			int j=0;
			do{

				System.out.print("Input Nilai Ke [" + i + "][" + j + "]" + ": ");	
				array[i][j] = sc.nextInt();		//menyimpan inputan pada array ke [i][j]
				j++;
			}while(j < 5);
			System.out.println();
			i++;
		}while(i < 3);

		
		i = 0;
		do{
			int j=0;
			do{
				System.out.print(array[i][j] + " ");	//mencetak elemen array yg telah diinputkan tadi
				j++;
			}while(j < 5);
			System.out.println();
			i++;
		}while(i < 3);

		System.out.println();
		
		i = 0;
		do{
			for(int j = 0; j < 3; j++){
				if(terbesarKolom < array[j][i]){		//mengecek apakah variable terbesarkolom < array[j][i]
					terbesarKolom = array[j][i];		//jk pernyataan diatas benar maka terbesarKolom = array[j][i]
					posisiKolom = i;
				}
			}
			i++;
		}while(i < 4);

		//cari terbesar kolom.
		i = 0;
		do{
			for(int j = 0; j < 4; j++){
				if(terbesarBaris < array[i][j]){		//mengecek apakah variable terbesarBaris < array[i][j]
					terbesarBaris = array[i][j];		//jk pernyataan diatas benar maka terbesarBaris = array[i][j]
					posisiBaris = i;
				}
			}
			i++;
		}while(i < 3);
		System.out.println("Angka terbesar adalah " + terbesarKolom);	//meng output kan variable terbesarKolom
		System.out.println("Posisi angka terbesar pada " + posisiKolom + ", " + posisiBaris);
	}
}