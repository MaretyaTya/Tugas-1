import java.util.Scanner;
    class Multi_Fungsi{

        public static nilai_mahasiswa(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Masukan Nilai = ");
        int nilai=scan.nextInt();
        if (nilai <= 50){
            System.out.println("Nilai anda D, anda harus mengulang");
        }
        else if (nilai >=51 && nilai<=65){
            System.out.println("Nilai anda C, Berlatihlah lebih Banyak");
        }
        else if (nilai >=66 && nilai<=85){
            System.out.println("Nilai anda B, Anda mendapat predikat Baik");
        }
        else if (nilai > 86){
            System.out.println("Nilai anda A, Nilai anda sangat memuaskan");
        }
    }

        public static menghitung_luas(String[] args) {
        System.out.println("Penghitung Luas = ");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Lingkaran");
        System.out.println("3. Luas Segitiga");
        System.out.print("Luas apa yang anda cari = ");
        Scanner sc=new Scanner(System.in);
        int pilihan=sc.nextInt();
            if(pilihan == 1){
                System.out.println("1. Persegi Panjang");
                System.out.println("2. Persegi");
                System.out.print("masukan pilihan = ");
                int pilihanPersegi=sc.nextInt();
                if()
            }
        }
}