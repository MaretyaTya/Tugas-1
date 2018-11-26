import java.util.Scanner;
    class OddDigitYoga{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            int bilangan;
            boolean perulangan=true;
            int digit;
            int jumlah=0;

            System.out.print("Masukkan Bilangan : ");
            bilangan=sc.nextInt();

                while(perulangan==true){
                    digit = bilangan%10;
                    if(digit%2 != 0){
                        jumlah++;
                    }
                    bilangan /=10;
                    if(digit==0)break;
                }
            System.out.println("jumlah angka ganjil dalam digit tersebut adalah : "+ jumlah);
        }
    }