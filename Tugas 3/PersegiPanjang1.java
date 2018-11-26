import java.util.Scanner;
	class Tugas2{
	public static void main(String[] args) {
	 
	Scanner sc = new Scanner(System.in);
	int gaji_kotor, gaji_pokok, uang_makan, uang_transportasi;
	double total_gaji, pajak= 0.05, jumlah_pajak;

	System.out.print("Masukkan gaji_pokok: ");
	gaji_pokok =sc.nextInt();

	System.out.print("Masukkan uang_makan: ");
	uang_makan =sc.nextInt();

	System.out.print("Masukkan uang_transportasi: ");
	uang_transportasi =sc.nextInt();

	gaji_kotor=gaji_pokok+uang_makan+uang_transportasi;

	if (gaji_kotor >= 1500000){
    jumlah_pajak= gaji_kotor*pajak;
    total_gaji= gaji_kotor-jumlah_pajak;
    System.out.println("total_gaji:" + total_gaji);
	
	}
    else{
     System.out.println("gaji_kotor:" + gaji_kotor);
    }


	       }
	    }


   
