import java.util.Scanner;
    class Break_While{
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int angka,b;
        System.out.println("Loop dengan Break");
        b=0;

        while(true){
            System.out.print("Masukkan angka : ");
            angka=sc.nextInt();
            b +=angka;
            if (b>50) break;
        }
        System.out.printf("Angka berhenti pada jumlah angka: %d", b);
    }
}