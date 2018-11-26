import java.util.Scanner;                          //meng import fungsi scanner dari library java
    class GajiPegawai{                             //nama class yg kita buat
        public static void main(String[] args) {   //fungsi utama dari class kita
            Scanner sc=new Scanner(System.in);     //membuat object scanner bernama "sc"
            int gaji_pokok, uang_makan, uang_transportasi, gaji_kotor;      //variable
            double total_gaji, pajak=0.05, jumlah_pajak;                    //variable

            System.out.print("masukan jumlah Gaji Pokok = ");             //perintah utk menampilkan tulisan "masukan jumlah gaji pokok"
            gaji_pokok=sc.nextInt();                                      //memanggil object sc utk menerima inputan dan menyimpan pada variable "gaji_pokok"
            System.out.print("masukan jumlah Uang Makan = ");             
            uang_makan=sc.nextInt();
            System.out.print("masukan jumlah Uang Transportasi = ");
            uang_transportasi=sc.nextInt();
            
            gaji_kotor=gaji_pokok+uang_makan+uang_transportasi;           //memberi variable "gaji_kotor" fungsi utk menghitung 3 variable sebelumnya
            

            if (gaji_kotor >= 1500000){                                   //kondisi yg harus terpenuhi agar statement berjalan
                jumlah_pajak=gaji_kotor*pajak;                            //memberi fungsi pada variable
                total_gaji=gaji_kotor-jumlah_pajak;                       //memberi fungsi pada variable
                System.out.print("Gaji Bersih Pegawai = " + total_gaji);  //menampilkan tulisan dan memanggil variable "total gaji"
            }

            else {                                                        //fungsi yg akan berjalan ketika kondisi if tdk terpenuhi
                System.out.println("Gaji Bersih Pegawai = " + gaji_kotor);
            }
        }
    }