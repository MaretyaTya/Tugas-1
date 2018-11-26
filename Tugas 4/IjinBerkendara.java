import java.util.Scanner;                                       //meng import fungsi scanner dari library java
    class IjinBerkendara{                                       //nama class yg kita buat
        public static void main(String[] args) {                //fungsi utama dari class kita
            Scanner sc=new Scanner(System.in);                  //membuat object scanner bernama "sc"
            int umur;                                           //variable

            System.out.print("masukan bilangan Pertama = ");    //menampilkan tulisan "masukan bilangan pertama = "
            umur=sc.nextInt();                                  //memanggil object sc dan menyimpan inputan ke variable umur
            

            if (umur >= 17){                                    //kondisi yg harus terpenuhi agar statement berjalan
                System.out.println("Boleh Berkendara");         //statement
            }

            else {                                              //fungsi yg akan berjalan ketika kondisi if tdk terpenuhi
                System.out.println("Tidak Boleh Berkendara");   //statement
            }
        }
    }