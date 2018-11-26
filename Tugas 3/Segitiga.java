import java.util.Scanner; //Scanner berfungsi sebagai penerima input dari keyboard//
    class Segitiga { //mendefinisikan class//
    
    public static void main(String[] args) { //Main Methode, tubuh utama//
    Scanner sc = new Scanner(System.in); //untuk menyimpan inputan//

    int alas,tinggi; //variable//
    float luas;

    System.out.println("Menghitung Luas Segitiga = "); //menampilkan tulisan Menghitung Luas Segitiga//

    System.out.print("masukan alas :"); //input alas//
    alas = sc.nextInt(); //inputan alas disimpan disini//
    System.out.print("masukan tinggi :"); //input tinggi//
    tinggi = sc.nextInt(); //inputan tinggi disimpan disini//
    
    luas = alas*tinggi/2; //statement, rumus luas segitiga//
    System.out.println("isi variable angka :" + luas); //menampilkan hasil dari "luas"//
    
    }
}