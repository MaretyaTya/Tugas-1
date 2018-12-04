import java.util.Scanner;
    class Sandbox{
        
    public static void luas_persegi(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Sisi : ");
        int sisi=sc.nextInt();
        int luas=sisi*sisi;
        System.out.println("Luas Persegi Tersebut : " + luas);
    }       

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menghitung Luas v0.1");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Null");
        System.out.println("3. Null");
        System.out.println("4. Null");
        System.out.print("Masukan Pilihan : ");
        int pilihan=sc.nextInt();


        if(pilihan==1){
        luas_persegi();
        }
    }
}