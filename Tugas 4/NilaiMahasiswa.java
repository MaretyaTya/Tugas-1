import java.util.Scanner;                               //meng import fungsi scanner dari library java
    class NilaiMahasiswa{                               //nama class yg kita buat
        public static void main(String[] args) {        //fungsi utama dari class kita
            Scanner sc=new Scanner(System.in);          //membuat object scanner bernama "sc"
            int uts,uas;                                //variable
            

            System.out.print("masukan Nilai UTS = ");   //menampilkan tulisan "masukan nilai uts ="
            uts=sc.nextInt();                           //memanggil object sc utk menerima inputan dan menyimpan pada variable "uts"
            System.out.print("masukan Nilai UAS = ");
            uas=sc.nextInt();
            

            if (uts > 90 || uas == 100){                    //kondisi yg harus terpenuhi agar statement berjalan
                System.out.println("Anda Masuk Kelas A");   //statement utk menampilkan tulisan Anda masuk kelas A 
            }

            else {                                          //fungsi yg akan berjalan ketika kondisi if tdk terpenuhi
                System.out.println("Anda Masuk Kelas B");   //statement utk menampilkan tulisan Anda masuk kelas B
            }
        }
    }