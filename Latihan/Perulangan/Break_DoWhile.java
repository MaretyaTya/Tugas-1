import java.util.Scanner;
    class Break_DoWhile{
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int angka,b;
        System.out.println("Loop dengan Break");
        b=0;
        do{
            System.out.println("Masukkan angka : ");
            angka=sc.nextInt();
            b +=angka;
            if(b>50) break;
        }while(true);
        System.out.printf("Angka berhenti pada jumlah angka: %d", b);
    }
}