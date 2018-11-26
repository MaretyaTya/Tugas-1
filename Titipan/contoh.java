import java.util.Scanner;
class contoh{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int jumlahSoal;

			System.out.print("masukkan jumlah soal SBM : ");
			jumlahSoal = sc.nextInt();
			int nilaiSBMYgSalah;
			System.out.print("masukkan jumlah soal SBM yang salah : ");
			nilaiSBMYgSalah =  sc.nextInt();
	
			int totalNilaiSBM;
			totalNilaiSBM=jumlahSoal-nilaiSBMYgSalah ;

			int nilaiTKD,nilaiTPA,jumlahSoalTKD,jumlahSoalTPA;
			System.out.print("masukkan jumlah soal TPA : ");
			jumlahSoalTPA=sc.nextInt();
			System.out.print("masukkan jumlah soal TPA yang salah : ");
			int nilaiTPAYgSalah=sc.nextInt();
			nilaiTPA=jumlahSoalTPA - nilaiTPAYgSalah;

			System.out.print("masukkan jumlah soal TKD : ");
			jumlahSoalTKD=sc.nextInt();
			System.out.print("masukkan jumlah soal TKD yang salah : ");
			int nilaiTKDYgSalah=sc.nextInt();
			nilaiTKD=jumlahSoalTKD - nilaiTKDYgSalah;

		if(totalNilaiSBM>55 && totalNilaiSBM<=100 && nilaiTPA>50 && nilaiTPA<=100 && nilaiTKD>50 && nilaiTKD<=100){
				System.out.println("Selamat Anda Lolos Ujian Masuk PTN");
		}
		else{ 			
				System.out.println("Selamat Anda Tidak Lolos Ujian Masuk PTN");
				System.out.print("Sampai Jumpa Tahun depan wkwkwkwwk :v");
		}
	}
}