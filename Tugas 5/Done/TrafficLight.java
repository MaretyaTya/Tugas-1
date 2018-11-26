import java.util.Scanner;
    class TrafficLight{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            String Lampu;

            System.out.print("Input warna Lampu = ");
            Lampu=sc.nextLine();

            if("Hijau".equals(Lampu)){
                System.out.println("Silahkan Jalan!");
            }
            else if("Kuning".equals(Lampu)){
                System.out.println("Hari-Hati..");
            }
            else if("Merah".equals(Lampu)){
                System.out.println("Berhenti");
            }
            else{
                System.out.println("inputan salah");
            }
        }
    }