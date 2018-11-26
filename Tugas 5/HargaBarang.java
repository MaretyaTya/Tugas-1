import java.util.Scanner;
    class HargaBarang{

    public static void menghitung_harga_diskon(){ //methode utk menghitung total belanjaan khusus member//
        Scanner sc=new Scanner(System.in);
        double diskon1=0.15;                      //Pendeklarasian Variable diskon//
        double diskon2=0.30;
            System.out.println("Anda adalah Member");
            System.out.println("Dapatkan Diskon di Setiap Pembelian Minimal 11 barang");
            System.out.print("Masukan Jumlah Belanjaan : ");
            int Jumlah_Belanjaan=sc.nextInt();     //pendeklarasian variable sekaligus menyimpan inputan kedalam variable//
            System.out.print("Masukan Total Harga : ");
            int Total_Harga=sc.nextInt();          //pendeklarasian variable sekaligus menyimpan inputan kedalam variable//
                if(Jumlah_Belanjaan>=11 && Jumlah_Belanjaan<=30){ //kondisi jika jumlah belanjaan lebih dari sama dengan 11 dan kurang dari 11//
                    System.out.println("Harga Belanjaan = " + Total_Harga);
                    double jumlah_diskon=Total_Harga*diskon1;     //pendeklarasian variable sekaligus menyimpan inputan kedalam variable//
                    System.out.println("Anda mendapat Diskon 15% = " + jumlah_diskon);
                    double Harga_Akhir=Total_Harga-jumlah_diskon; //pendeklarasian variable sekaligus menyimpan inputan kedalam variable//
                    System.out.println("Total Harga Belanjaan Anda = " + Harga_Akhir);
                }
                else if(Jumlah_Belanjaan>=31){     //kondisi jika jumlah belanjaan lebih dari sama dengan 31//
                    System.out.println("Harga Belanjaan = " + Total_Harga);
                    double jumlah_diskon=Total_Harga*diskon2;
                    System.out.println("Anda mendapat Diskon 30% = " + jumlah_diskon);
                    double Harga_Akhir=Total_Harga-jumlah_diskon;
                    System.out.println("Total Harga Belanjaan Anda = " + Harga_Akhir);
                }
                else{                              //kondisi jika semua kondisi diatas tidak terpenuhi//
                    System.out.println("Anda tidak mendapat diskon, Total Belanjaan anda : " + Total_Harga); //statement dari kondisi diatas//
                }
    }

    public static void menghitung_harga(){         //methode utk menghitung total belanjaan pelanggan yang bukan member//
        Scanner sc=new Scanner(System.in);         //membuat object scannner dengan nama sc//
            System.out.println("Anda Bukan Member");
            System.out.println("Jadilah Member dan Dapatkan Diskon di Setiap Pembelian Minimal 11 barang");
            System.out.println("Masukan Total Belanjaan : ");
            int Total_Harga=sc.nextInt();           //pendeklarasian variable sekaligus menyimpan inputan kedalam variable//
            System.out.println("Total Belanjaan : " + Total_Harga);   
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Masukan nomor Member : ");
        int no_member=sc.nextInt();                 //pendeklarasian variable sekaligus menyimpan inputan kedalam variable//
            if(no_member>=1 && no_member<=50){      //kondisi jika nomer member masuk kedalam list member yaitu no 1-50//
            menghitung_harga_diskon();              //statement untuk memanggil methode menghitung_harga_diskon//
            }
            else{                               
            menghitung_harga();                     //statement untuk memanggil methode menghitung_harga_diskon//
            }
    }
}