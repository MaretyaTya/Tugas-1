import java.util.Scanner;                       //meng import fungsi scanner dari library java
class Bilangan{                                 //nama class yg kita buat
    public static void main(String[] args) {    //fungsi utama dari class kita
        Scanner sc=new Scanner(System.in);      //membuat object scanner bernama "sc"
        int angka;                              //variable
        
        System.out.print("Masukan angka = "); //perintah utk menampilkan tulisan "masukan angka"
        angka=sc.nextInt();                     //memanggil object scanner utk menerima inputan dan menyimpan nya pada variable "angka"

        if (angka % 2 == 0)                     //kondisi yg harus terpenuhi agar statement berjalan
        {
            System.out.println("Angka" + angka + " adalah bilangan genap");     //statement yg berjalan ketika kondisi if terpenuhi
        }
        else                                                                    //fungsi yg akan berjalan ketika kondisi if tdk terpenuhi
        {
            System.out.println("Angka " + angka + " adalah bilangan ganjil");   //statement dari else
        }

    }
}