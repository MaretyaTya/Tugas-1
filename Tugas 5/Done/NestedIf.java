import java.util.Scanner;
    class NestedIf{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int nilai;
            System.out.print("Masukan Nilai = ");
            nilai=sc.nextInt();
            if (nilai>=0 && nilai <=100){
                if(nilai>=90 && nilai<=100){
                    System.out.println("Nilai Ujian = A");
                }
                else if(nilai>=80 && nilai<=89){
                    System.out.println("Nilai Ujian = B");
                }
                else if(nilai>=60 && nilai<=79){
                    System.out.println("Nilai Ujian = C");
                }
                else if(nilai>=50 && nilai<=59){
                    System.out.println("Nilai Ujian = D");
                }
                else{
                    System.out.println("Nilai Ujian = E");
                }
            }
            else{
                System.out.println("Inputan tidak Valid");
            }
        }
    }