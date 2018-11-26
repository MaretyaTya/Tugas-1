import java.util.Scanner;
class NumberTriangle{
    public static void main(String[]args){  //main class
    Scanner sc=new Scanner(System.in);      //deklarasi scanner

    System.out.print("Masukan nilai N : "); //input dan menyimpan ke variable n
    int n=sc.nextInt();                     
        for(int iOuter=1; iOuter<=n; iOuter++){ //deklarasi variable iOuter=1 dan menghentikan perulangan saat iOuter<=n
            for(int a=n; a>=iOuter;a--){        //perulangan utk mencetak spasi sampai a>=iOuter
                System.out.print(" ");          
            }   
            for(int i=1;i<=iOuter;i++){         //perulangan utk mencetak variable i sampai i<=iOuter
                System.out.print(i);            
            }
            System.out.println();               //perintah untuk mencetak spasi enter setiap perulangan diatas selesai
        }
    }
}