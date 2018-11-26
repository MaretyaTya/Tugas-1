import java.util.Scanner;
    class OddDigit{
        public static void main(String[] args){     //main class
            Scanner sc=new Scanner(System.in);      //deklarasi scanner

            boolean perulangan=true;                //variable
            int digit;                              //variable
            int jumlah=0;                           //variable

            System.out.print("Masukkan Bilangan : ");
            int bilangan=sc.nextInt();              //deklarasi variable bilangan dan menyimpan inputan ke variable tersebut

                while(perulangan==true){            
                    digit = bilangan%10;            //modulus var bilangan dengan angka 10, utk mengurangi satu digit 
                    if(digit%2 != 0){               //jika digit di modulus 2 tdk sama dengan 0, maka dianggap ganjil
                        jumlah++;                   //jika syarat diatas terpenuhi, tambah nilai satu pada variable ini
                    }
                    bilangan /=10;                  
                    if(digit==0)break;              //jika digit sudah habis maka akhiri perulangan
                }
            System.out.println("jumlah angka ganjil dalam digit tersebut adalah : "+ jumlah);   //tampilkan variable jumlah
        }
    }