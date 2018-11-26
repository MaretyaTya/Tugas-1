import java.util.Scanner;
class ArrayMax{
	public static void main(String args[]){		//main methode
		Scanner sc=new Scanner(System.in);		//deklarasi scanner sc
		System.out.print("Masukan jumlah Elemen : ");
		int n=sc.nextInt();						//menyimpan inputan pada variable n
			int[] arr = new int[n];				//membuat array dengan elemen sebanyak n
		for(int i=0; i<n; i++){					//melakukan perulangan sebanyak n kali
			System.out.print("Masukan Array ke-" + i + " : ");
			arr[i]=sc.nextInt();			   
		}
		int max = arr[0];						//deklarasi nilai awal variable max sebagai wadah nilai terbesar dari array
		for(int i = 1; i < n; i++){
			if(arr[i] > max){					//jika arr[i] lebih besar drpd variable max maka variable ini dinyatakan sebagai variable max
				max = arr[i];
			}
		}
		System.out.println("Bilangan Terbesar : " + max);
	}
}