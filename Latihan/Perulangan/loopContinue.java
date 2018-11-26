import java.util.Scanner;
    class loopContinue{
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int angka,b,i,count;
        double avg;
        System.out.println("Loop dengan Continue");
        b=0;
        count=0;
        for(i=0;i<4;i++){
            System.out.println("Masukkan angka : ");
            angka=sc.nextInt();
            if (angka>=40) continue;
            b += angka;
            count++;
        }
        avg = (double)b/count;
        System.out.printf("Rata-rata angka kurang dari 40: %.2f", avg);
    }
}