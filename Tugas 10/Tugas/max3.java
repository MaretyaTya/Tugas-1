class max3{
    public static int Max3(int bil1, int bil2, int bil3){ //membuat fungsi dengan nama Max3 dengan parameter bil1.bil2,bil3
        int terbesar;                                     //deklarasi variable terbesar
        if (bil1>bil2 && bil2>bil3){                      //syarat untuk menyatakan bil1 sebagai bilangan terbesar
            terbesar = bil1;
        }
        else if(bil1<bil2&& bil2>bil3){                   //syarat untuk menyatakan bil2 sebagai bilangan terbesar
            terbesar = bil2;
        }
        else{                                             //syarat untuk menyatakan bil3 sebagai bilangan terbesar
            terbesar = bil3;   
        }
        return terbesar;                                  //mengembalikan variable terbesar
    }
    public static void main(String[] args) {              //main method
        int max = Max3(1,5,9);                            //memberi rumus pada variable max = Max3(1,5,9)
        System.out.print("Bilangan Terbesar Adalah = "+ max);  //meng outputkan tulisan dan isi variable max
    }
} 