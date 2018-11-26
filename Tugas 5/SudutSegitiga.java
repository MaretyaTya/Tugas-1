import java.util.Scanner;
    class SudutSegitiga{
        public static void main(String[] args) { //main methode//
            Scanner sc=new Scanner(System.in);  

            System.out.print("Masukan sudut 1 : "); ////////////////////////////////////////////////////////////////////////////
            int sudut1=sc.nextInt();                //                                                                        //
            System.out.print("Masukan sudut 2 : "); // mendeklarasikan variable dan menyimpan input kedalam variable tersebut //
            int sudut2=sc.nextInt();                //                                                                        //
            System.out.print("Masukan sudut 3 : "); ////////////////////////////////////////////////////////////////////////////
            int sudut3=sc.nextInt();                
            int totalsudut=sudut1+sudut2+sudut3;    //mendeklarasikan variable sekaligus memberinya rumus//

            if(totalsudut==180 && sudut1 >0 && sudut2 >0 && sudut3 >0 && sudut1 <180 && sudut2 <180 && sudut3 <180){ //kondisi utk memenuhi segitiga siku2//
                if(sudut1+sudut2==90 || sudut2+sudut3==90 || sudut3+sudut1==90){ //kondisi agar 2 sudut dari 3 inputan sudut jika dijumlah bernilai 90//
                    System.out.print("Segitiga Siku-Siku");
                }
                else{
                    System.out.print("Bukan Segitiga Siku-Siku");
                }
            }
            else{                                     //kondisi yg terpilih jika semua kondisi diatasnya tidak terpenuhi//
                System.out.println("Sudut Harus Bernilai total 180 derajat"); 
                System.out.println("Dan Nilai per Sudut Tidak boleh Lebih dari 180 Derajat");
            }
        }
    }