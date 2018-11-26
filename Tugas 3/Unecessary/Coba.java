import java.util.Scanner;
class Coba{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int jumlah_item, harga=100000, total_harga;
        float discount=0.25f, jumlah_discount, total_harga_discount;
        
        System.out.print("masukan jumlah item = ");
        jumlah_item=sc.nextInt();

        if (jumlah_item >= 3){
            jumlah_discount=harga*jumlah_item*discount;
            System.out.println("selamat, anda mendapatkan diskon 25%");
            System.out.print("Total Harga = " );
            total_harga_discount=jumlah_item*harga-jumlah_discount;
            System.out.println(total_harga_discount);

        }
        else if (jumlah_item < 3){
            total_harga=jumlah_item*harga;
            System.out.println("Total = " + total_harga);
        }
    }
}