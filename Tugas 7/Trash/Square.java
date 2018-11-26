import java.util.Scanner;
class Square{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    System.out.print("Masukan nilai N : ");
    int n=sc.nextInt();
        for(int iOuter=1; iOuter<=n; iOuter++){
            for(int a=n; a>=iOuter;a--){
                System.out.print(" ");
            }
            for(int i=1;i<=iOuter;i++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}