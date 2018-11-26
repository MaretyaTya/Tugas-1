import java.util.Scanner;
    class Perulangan_DoWhile{
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int angka,fac,i;
        System.out.println("Menghitung nilai Faktorial");
        System.out.print("Masukan angka : ");
        angka=sc.nextInt();
        fac=1;
        i=1;
        do{
            fac=fac*i;
            i++;
        }while(i<=angka);
        System.out.printf("Nilai faktorial angka tersebut adalah: %d", fac);
    }
}