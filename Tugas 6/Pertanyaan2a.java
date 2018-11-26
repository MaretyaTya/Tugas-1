import java.util.Scanner;
    class Pertanyaan2a{
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=1;
        int i=1;

        System.out.print("masukan angka yg ingin di pangkatkan : ");
        int angka=sc.nextInt();
        System.out.print("masukan pangkat : ");
        int pangkat=sc.nextInt();
        System.out.println("");
        System.out.println(angka + " pangkat " + pangkat);
        while(i<=pangkat){
            r=r*angka;
            i++;
        }
        System.out.print(r);
    }
}