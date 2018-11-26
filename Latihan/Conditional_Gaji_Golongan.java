import java.util.Scanner;
    public class Conditional_Gaji_Golongan{
        public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int Golongan;
        char ulangi;

        do{
        System.out.print("Masukan Nilai Golongan Pegawai = ");
            Golongan=scan.nextInt();
            
        if (Golongan == 1) {
            System.out.println("Golongan A\nDengan Gaji Senilai 1.500.000");
        }
             else if (Golongan == 2){
            System.out.println("Golongan B\nDengan Gaji Senilai 1.750.000");
            }
            else if (Golongan == 3){
            System.out.println("Golongan C\nDengan Gaji Senilai 2.000.000");
            }
            else if (Golongan == 4){
            System.out.println("Golongan D\nDengan Gaji Senilai 2.500.000");
            } 
            else{
                System.out.println("Golongan Salah");
            }
            System.out.print("Ulangi? (Y/N) ");
            ulangi=scan.next().charAt(0);
        
        }while (ulangi == 'Y');
    }
}