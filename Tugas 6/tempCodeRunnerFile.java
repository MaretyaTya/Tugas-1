import java.util.Scanner;
    class SumKuadratErika{
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int nilai;
        int jumlah=0;
        int pangkat;
        System.out.print("Masukan bilangan : ");
        int n=sc.nextInt();

        for(int i=1; i<=n; i++){
            pangkat =i*i;
            jumlah = jumlah+pangkat;
            System.out.print(pangkat);
            if(i==n){
                System.out.print("=" + jumlah);
            }else{
                System.out.print("+");
            }
        }
    }
}