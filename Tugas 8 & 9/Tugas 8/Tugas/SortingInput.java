import java.util.Scanner;
    class SortingInput{
    public static void main(String[] args) {   //main methode
    Scanner sc=new Scanner(System.in);         //deklarasi scanner sc
        int[] arr={16,4,10,90,27,3,12,28};     //deklarasi array arr sekaligus memberi isi elemen
        int n = arr.length ;                   //membuat variable n sama dengan total jumlah total index array
        int temp = 0;                          //wadah sementara untuk meng swap elemen array

       for(int i=0; i < n; i++){                //melakukan pengulangan sebanyak n kali
           for(int j = 1; j<(n-1); j++){        

               if(arr[j-1] > arr[j]){           
                   temp = arr[j-1];             //rumus utk melakukan swap urutan elemen array berdasarkan besarnya
                   arr[j-1] = arr[j];
                   arr[j] = temp;
               }
           }
        }
        System.out.println("Hasil Pengurutan : ");
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);         //mencetak array yg sdh diurutkan
        }
    }
}  