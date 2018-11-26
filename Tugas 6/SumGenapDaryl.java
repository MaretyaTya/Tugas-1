import java.util.Scanner;
class SumGenapDaryl
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int angka;
        int n = 0;
        int genap = 0;
        int repeat = 0;
       
        System.out.print("masukkan angka : ");
        angka = sc.nextInt();
        if(angka>0)
        {
            while(repeat<angka)
            {
                System.out.println(genap);
                n = n + genap;
                genap = genap + 2;
                repeat++;
            }
            System.out.print(n);
        }
        else
        System.out.print("TIDAK BOLEH NEGATIF");
    }
}