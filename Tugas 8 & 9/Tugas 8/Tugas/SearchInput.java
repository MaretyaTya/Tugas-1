import java.util.Scanner;
    class SearchInput{
    public static void main(String[] args) {    //main methode
    Scanner sc=new Scanner(System.in);          //deklarasi scanner sc
        System.out.print("Masukan Jumlah Elemen yg di inginkan : ");
        int n=sc.nextInt();                     //menyimpan input pada variable n
        int[] bil=new int[n];                   //deklarasi array dengan jumlah elemen sebanyak n
            for(int i=0; i < bil.length; i++){  //pengulangan untuk input array
                System.out.print("Array ke-"+ i + " : " );
                bil[i]=sc.nextInt();
            }
        System.out.print("Masukan Key yang ingin di cari : ");
        int Search=sc.nextInt();    //angka yg ingin dicari disimpan di variable ini

        int hasil = 0;              //wadah utk angka yg dicari

       for(int i=0; i < bil.length; i++){    //perulangan yg dilakukan sampai angka yg dicari ketemu
           if(Search == bil[i]){
               hasil = i;
               break;                       //menghentikan perulangan apabilaangka sudah ketemu
           }
       }
        System.out.println("Key ada di Index Array ke : " + hasil);     //output index ke berapa angka yg dicari itu
    }
}  