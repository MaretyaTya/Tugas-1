import java.util.Scanner;
    class SumGenap{
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n;
        int k;
        int x=0;

        System.out.print("Masukan bilangan bilat : ");
        n = sc.nextInt();
        for(k=0; k!=n; k++){
            x+=2*k;
        }
        System.out.println("jadi hasilnya adalah %d," + x);
    }
}