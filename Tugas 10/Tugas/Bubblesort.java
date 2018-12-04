class Bubblesort{  
    public static void main(String[] args) {   
        int[] arr = {16, 4, 10, 90, 27, 3, 12, 28};   
        System.out.println("Hasil Pengurutan : ");   
        sorting(arr);   
        muncul(arr);  
    }  
    public static void sorting(int arr[]){   
        int n = arr.length;   
        for(int i=0; i<n; i++){    
            for(int j=1; j<(n-1); j++){     
                if(arr[j-1]>arr[j]){      
                    swap(arr,j);     
                }    
            }   
        }  
    }  
    public static int swap(int []arr, int j){   
        int temp = arr[j-1];   
        arr[j-1] = arr[j];   
        arr[j] = temp; 
    return arr[j];  
}  
public static void muncul (int [] arr){   
    int n = arr.length;   
    for(int i=0; i<n; i++){    
        System.out.println(arr[i]);   
    }  
} 
  } 