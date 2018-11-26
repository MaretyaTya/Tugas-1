import java.util.Scanner; //Scanner berfungsi sebagai penerima input dari keyboard//
    class Biodata { //mendefinisikan class//
    
    public static void main(String[] args) { //Main Methode, tubuh utama//
    Scanner scInt = new Scanner(System.in); //Scanner, untuk menangkap inputan//
    Scanner scString = new Scanner(System.in);

    String nama, noHP; //variable//
    int usia, tinggiBadan;

    System.out.println("\t \t Biodata"); // "\t" adalah escape sequence utk memberi tab space//
    
    System.out.print("masukan nama :"); //menambahkan inputan ke variable "nama"//
    nama = scString.nextLine(); //inputan disimpan di sini//
    System.out.print("masukan no HP :");
    noHP = scString.nextLine();

    System.out.print("masukan usia :");
    usia = scInt.nextInt();
    System.out.print("masukan tinggi badan :");
    tinggiBadan = scInt.nextInt();
    
    System.out.println("Nama: " + nama); //menampilkan variable "nama"//
    System.out.println("No. HP: " + noHP);
    System.out.println("Usia: " + usia);
    System.out.println("Tinggi badan: " + tinggiBadan);
    
    }
}