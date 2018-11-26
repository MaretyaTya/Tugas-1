import java.util.Scanner;
class PilihMenu{
	public static void main(String[] args) {			//main methode
		Scanner sc=new Scanner(System.in);				//deklarasi scanner sc

		String isi = "ADA" , isi1="TIDAK ADA";			//deklarasi variable
		System.out.print("masukkan jumlah Baris : ");
		int baris=sc.nextInt();							//menyimpan inputan pada variable baris
		System.out.print("masukkan jumlah Kolom : ");
		int kolom=sc.nextInt();							//menyimpan inputan pada variable kolom
		int [][] array = new int[baris][kolom];		//membuat array dengan jumlah baris dan kolom sebanyak angka yg diinputkan diatas

		for(int i=0 ; i<baris ; i++){					//pengulangan yang dilakukan sebanyak baris
				for(int j=0 ; j<kolom ; j++){			//pengulangan yang dilakukan sebanyak kolom
					System.out.print("Masukkan nilai ke-["+i+"]["+j+"]" + ": ");
					array[i][j]=sc.nextInt();			//menyimpan data pada array ke [i][j]
				}
			}System.out.println();


		System.out.println("Pilihan : ");
		System.out.println("1. Menampilkan angka Terkecil");
		System.out.println("2. Menampilkan angka terkecil dan Lokasi Angka Terbesar");
		System.out.println("3. Kondisi Array");
		System.out.println();

		System.out.println("Pilih Menu yang anda ingin ketahui : ");
		int menu=sc.nextInt();							//menyimpan inputan pada variable menu
		System.out.println();

		
		if(menu==1){									//jika variable menu diinput 1
	
			int min=array[0][0];						//wadah untuk menyimpan angka terkecil

			for(int i=0 ; i<baris ; i++){				//pengulangan yang dilakukan sebanyak baris
				for(int j=0 ; j<kolom ; j++){			//pengulangan yang dilakukan sebanyak kolom
					if(array[i][j]<min){				//jika array[i][j] lebih kecil daripada variable min
						min=array[i][j];				//maka array[i][j] akan dinyatakan sebagai variable min
					}
				}
			}System.out.println("Nilai terkecil adalah : " + min);	//output variable min

		}else if(menu==2){								//jika variable menu diinput 1

			int min=array[0][0];						//wadah untuk menyimpan angka terkecil

			for(int i=0 ; i<baris ; i++){				//pengulangan yang dilakukan sebanyak baris
				for(int j=0 ; j<kolom ; j++){			//pengulangan yang dilakukan sebanyak kolom

					if(array[i][j]<min){				//jika array[i][j] lebih kecil daripada variable min
						min=array[i][j];				//maka array[i][j] akan dinyatakan sebagai variable min
					}
				}
			}System.out.println("Nilai terkecil = " + min ); //output variable min

			int key=0;									//deklarasi variable
			int hasil=0;

			for(int i=0 ; i<baris ; i++){				//pengulangan yang dilakukan sebanyak baris
				for(int j=0 ; j<kolom ; j++){			//pengulangan yang dilakukan sebanyak kolom
					if(key==array[i][j]){				//jika variable array sama dengan variable key
						hasil=key;						//maka deklarasikan variable key sama dengan variable hasil
						
						break;							//dan hentikan perulangan ini
					}
				}
			}System.out.println("Lokasi indeks angka terbesarnya : " + hasil);	//Output variable hasil
		

		}else if(menu==3){								//jika variable menu diinput 3
		System.out.println("KONDISI ARRAY : ");

			for(int i=0 ; i<baris ; i++){				//pengulangan yang dilakukan sebanyak baris
				for(int j=0 ; j<kolom ;j++){			//pengulangan yang dilakukan sebanyak kolom
					if(baris>=2 && array[i][j]==50){	//jika baris>=2 dan ada nilai 50 dalam array[i][j] maka
						System.out.println(isi);		//output variable isi
						break;							//dan hentikan perulangan ini
						}
					
						if(array[i][j]==50){			//jika array[i][j] bernilai 50 maka 
							System.out.println(isi);	//cetak variable isi
							break;						//dan hentikan perulangan ini
						}
					else if(array[i][j]!=50){			//jika array[i][j] tidak bernilai 50 maka 
						System.out.println(isi1);		//cetak variable isi1
						break;							//dan hentikan perulangan ini
						}
				}
			}
		}
		else{											//jika variable menu di input dg angka yang tidak ada di pilihan
			System.out.println("MENU YANG ANDA PILIH TIDAK ADA");	//cetak output tulisan ini
		}

	}
}