class max3{
    public static int Max3(int bil1, int bil2, int bil3){
        int terbesar;
        if (bil1>bil2 && bil2>bil3){    
            terbesar = bil1;
        }
        else if(bil1<bil2&& bil2>bil3){
            terbesar = bil2;
        }
        else{    
            terbesar = bil3;   
        }
        return terbesar;  
    }
    public static void main(String[] args) {
        int max = Max3(90,100,999);   
        System.out.print("Bilangan Terbesar Adalah = "+ max); 
    } 
} 