import java.util.Scanner;
    class Penjualan{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            int hargaJual, hargaBeli;
            String status;

            System.out.println("Masukan harga Beli Barang = ");
            hargaBeli=sc.nextInt();
            System.out.println("Masukan harga Jual Barang = ");
            hargaJual=sc.nextInt();
            
            if (hargaBeli > hargaJual)
            {
                status="Rugi";
            }

            else
            {
                status="untung";
            }

            System.out.println("Anda " + status);
        }
    }