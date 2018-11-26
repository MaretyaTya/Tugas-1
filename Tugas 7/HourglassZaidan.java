import java.util.Scanner;
class HourglassZaidan{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    System.out.print("Masukan nilai N : ");
    int n=sc.nextInt();

        if(n>=2){
            for(int Container=1; Container<=n; Container++){
                for(int inner1=1; inner1<Container;inner1++){
                    System.out.print(" ");
                }
                for(int inner2=n+4; inner2>=Container*2;inner2--){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int Container2=1; Container2<n; Container2++){
                for(int inner3=n-1; inner3>Container2;inner3--){
                    System.out.print(" ");
                }
                for(int inner4=0; inner4<=Container2*2;inner4++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("jumlah N harus lebih dari 2");
        }
    }
}