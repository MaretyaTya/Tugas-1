import java.util.Scanner; 
class lingkaran{
    static int luasLingkaran(int jari){   
        int luas = (int)(3.14*jari*jari);   
        return luas;  
    }  
    static int kelilingLingkaran(int jari)
    {
    int keliling = (int)(2*3.14*jari);   
    return keliling;  
}
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);   
    System.out.print("Masukkan Jari-Jari : ");   
    int r = sc.nextInt();   
    int l = luasLingkaran(r);   
    int k = kelilingLingkaran(r);   
    System.out.println("Luas Lingkarannya Adalah = "+ l);
    System.out.println("Keliling Lingkarannya Adalah = "+ k);  } 
} 