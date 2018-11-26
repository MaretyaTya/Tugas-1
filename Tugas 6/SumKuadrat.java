import java.util.Scanner;
    class SumKuadrat{                              
        public static void main(String[] args) {    //main class
        Scanner sc=new Scanner(System.in);          //deklarasi scanner

            int perulangan_ke;                      //variable
            int nilai;                              //variable
            int jumlah=0;                           //variable
            int pangkat;                            //variable
            System.out.print("Masukan Bilangan : ");
            int jumlah_perulangan=sc.nextInt();     //menyimpan input ke variable jumlah_perulangan dan mendeklarasikan nya

            if(jumlah_perulangan>0){                //jika jumlah_perulangan > 0 maka lakukan perintah dibawah
                for(perulangan_ke=1; perulangan_ke<=jumlah_perulangan; perulangan_ke++){    //deklarasi variable,membatasi pengulangan, counter
                    pangkat=perulangan_ke*perulangan_ke;                                    //rumus utk mengkalikan dua variable tersebut               
                    jumlah=jumlah+pangkat;                                                  
                    System.out.print(pangkat);                                        //tampilkan variable pangkat
                        if(perulangan_ke==jumlah_perulangan){                         //jika perulangan_ke == jumlah_perulangan maka lakukan perintah dibawah
                            System.out.print("=" + jumlah);                           //tampilkan "= (variable jumlah)"
                        }
                        else{                                           //jika perulangan_ke belum sama dengan jumlah_perulangan maka lakukan perintah berikut
                            System.out.print("+");                                  
                        }
                }
            }
            else{                                                       //jika jumlah_perulangan kurang dari 0 maka lakukan perintah dibawah
                System.out.println("Jangan Masukan Bilangan Negatif : ");
            }
        }
    }