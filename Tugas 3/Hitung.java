import java.util.Scanner; //Scanner berfungsi sebagai penerima input dari keyboard//
    class Hitung {    //mendefinisikan class//
    
    public static void main(String[] args) { //Main Methode, tubuh utama//
    Scanner sc = new Scanner(System.in); //untuk menyimpan inputan//

    int angka; //variable//

    System.out.print("masukan angka = "); //untuk memasukan inputan//
    angka = sc.nextInt(); //inputan disimpan di variable ini//
    
    System.out.println("isi variable angka :" + angka); //perintah untuk menampilkan nilai variable "angka"//
    
    }
}