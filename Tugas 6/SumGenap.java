import java.util.Scanner;
class SumGenap{
    public static void main(String[]args){   //Main class
        Scanner sc = new Scanner(System.in); //Pendeklarasian Scanner
        int angka;                           //Variable
        int n = 0;                           //Variable
        int genap = 0;                       //Variable
        int repeat = 0;                      //Variable
        boolean ulangi=true;                 //Variable
        System.out.print("masukkan angka : ");
        angka = sc.nextInt();                //menginput bilangan dan menyimpanya pada variable angka
        if(angka>0)                          //jika nilai angka > 0 maka lakukan perintah dibawah
        {
            while(ulangi=true){              //syarat perulangan
                if(repeat==angka){           //jika repeat sudah sama dengan angka, maka hentikan perulangan
                    break;
                }
                System.out.print(genap + " + "); //menampilkan nilai variable genap dan tanda +
                n = n + genap;                   //rumus penjumlahan bilangan genap
                genap = genap + 2;               //disetiap perulangan tambahkan angka 2 agar variable angka selalu bilangan genap
                repeat++;                        //tambahkan 1 nilai pada variable repeat disetiap perulangan
            }
            System.out.print("=" + n);           //jika perulangan diatas selesai maka tampilkan "= (variable n)"
        }
        else                                //jika nilai angka < 0 maka lakukan perintah dibawah
        System.out.print("Jangan Masukan Bilangan Negatif");
    }
}