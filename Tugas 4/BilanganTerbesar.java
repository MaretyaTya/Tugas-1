import java.util.Scanner; //untuk memasukan u
    class BilanganTerbesar{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int angka1,angka2;

            System.out.print("masukan bilangan Pertama = ");
            angka1=sc.nextInt();
            System.out.print("masukan bilangan Kedua = ");
            angka2=sc.nextInt();

            if (angka1 > angka2){
                System.out.println("Bilangan terbesar adalah = " + angka1);
            }

            else {
                System.out.println("Bilangan terbesar adalah = " + angka2);
            }
        }
    }