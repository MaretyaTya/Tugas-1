import java.util.Scanner;
class HitungLuas{
	public static void main(String[] args){		  //main methode//
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Menghitung Luas : "); //////////////////////////////////////////
        System.out.println("1. Segitiga");		  //									  //
        System.out.println("2. Persegi Panjang"); //	   menampilkan pilihan luas	      //
        System.out.println("3. Jajar Genjang");   //									  //
        System.out.println("4. Lingkaran");       //////////////////////////////////////////
		System.out.print("Masukan Pilihan : ");   
        int pilihan=sc.nextInt();				  //pendeklarasian variable sekaligus menyimpan inputan pada variable tersebut// 

		if(pilihan==1){							  //kondisi jika pilihan = 1//
			System.out.println("Luas Segitiga");
            System.out.print("Masukan Alas ");
            int alas_segitiga=sc.nextInt();
            System.out.print("Masukan Tinggi ");
			int tinggi_segitiga=sc.nextInt();
			int luas_segitiga=alas_segitiga*tinggi_segitiga;	   //memberi rumus pada variable luas_segitiga//
			System.out.println("Luas Segitiga = " + luas_segitiga);
		}
		else if(pilihan==2){					  //kondisi jika pilihan = 2//
			System.out.println("Luas Persegi Panjang");
			System.out.print("Masukan panjang : ");
			int panjang_persegi_panjang=sc.nextInt();
			System.out.print("Masukan Lebar : ");
			int lebar_persegi_panjang=sc.nextInt();
			int luas_persegi_panjang=panjang_persegi_panjang*lebar_persegi_panjang; //memberi rumus pada variable luas_persegi_panjang//
			System.out.println("Luas Persegi Panjang = " + luas_persegi_panjang);
		}
		else if(pilihan==3){				      //kondisi jika pilihan = 3//
			System.out.println("Luas Jajar Genjang");
			System.out.print("Masukan Alas : ");
			int alas_jajar_genjang=sc.nextInt();
			System.out.print("Masukan Tinggi : ");
			int tinggi_jajar_genjang=sc.nextInt();
			int luas_jajar_genjang=alas_jajar_genjang*tinggi_jajar_genjang;		   //memberi rumus pada variable luas_jajar_genjang//
			System.out.println("Luas Jajar Genjang = " + luas_jajar_genjang);
		}
		else if(pilihan==4){					  //kondisi jika pilihan = 4//
			System.out.println("Luas Lingkaran");
			System.out.print("Masukan Jari-Jari : ");
			double jarijari_lingkaran=sc.nextDouble();
			double phi=3.14;
			double luas_lingkaran=phi*jarijari_lingkaran*jarijari_lingkaran;	   //memberi rumus pada variable luas_lingkaran//
			System.out.println("Luas Lingkaran = " + luas_lingkaran);
		}
		else{									  //kondisi yg dipilih jika semua kondisi diatas tidak terpenuhi//
			System.out.println("Inputan salah, masukan hanya nomer 1-4 !!!");
		}
		}
	}