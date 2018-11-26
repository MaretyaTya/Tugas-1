import java.util.Scanner;
class Bilangan{
	public static void main(String[] args){		//deklarasi methode//
		Scanner sc = new Scanner(System.in);

		System.out.println("Membandingkan 3 angka dan menampilkan angka terbesar");
		System.out.print("Masukkan angka 1\t : ");////////////////////////////////////////////////////////////////////////////////////////////////
		int angka1 = sc.nextInt();							//																					//
		System.out.print("Masukkan angka 2\t : ");			//	  mendeklarasikan variable sekaligus memasukan input pada variable tersebut		//
		int angka2 = sc.nextInt();							//																					//	
		System.out.print("Masukkan angka 3\t : ");////////////////////////////////////////////////////////////////////////////////////////////////
		int angka3 = sc.nextInt();

		if(angka1 > angka2){					  //kondisi jika angka 1 melebihi angka 2//
			if(angka2 > angka3){				  //kondisi jika angka 1 melebihi 2 dan angka 2 melebihi 3//
				System.out.println("terbesar = " + angka1);//statement yang dilakukan apabila kondisi diatas terpenuhi//
				System.out.println("terkecil = " + angka3);
			}
			else{								  
				System.out.println("terbesar = " + angka1);//statement yang dilakukan apabila kondisi sebelumnya tidak terpenuhi//
				System.out.println("terkecil = " + angka2);
			}
		}
		else if(angka2 > angka3){				  //kondisi jika angka 2 melebihi angka 3//
			if(angka3 > angka1){				  //kondisi jika angka 2 melebihi 3 dan angka 3 melebihi 1//
				System.out.println("terbesar = " + angka2);//statement yang dilakukan apabila kondisi diatas terpenuhi//
				System.out.println("terkecil = " + angka1);
			}
			else{
				System.out.println("terbesar = " + angka2);//statement yang dilakukan apabila kondisi sebelumnya tidak terpenuhi//
				System.out.println("terkecil = " + angka3);
			}
		}
		else if(angka3 > angka1){				  //kondisi jika angka 3 melebihi angka 1//
			if(angka1 > angka2){				  //kondisi jika angka 3 melebihi 1 dan angka 1 melebihi 2//
				System.out.println("terbesar = " + angka3);//statement yang dilakukan apabila kondisi diatas terpenuhi//
				System.out.println("terkecil = " + angka2);
			}
			else{
				System.out.println("terbesar = " + angka3);//statement yang dilakukan apabila kondisi sebelumnya tidak terpenuhi//
				System.out.println("terkecil = " + angka1);
			}
		}
		else{											   //statement yang dilakukan apabila semua kondisi yang ada di atas tidak terpenuhi//
			System.out.println("Jangan Masukan Angka yang Sama!! = ");	
		}
		}
	}