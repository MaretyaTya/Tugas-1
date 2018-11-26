import java.util.Scanner;
    class Pertanyaan2b{
        public static void main(String[] args) {
        int n=8;
        boolean stop=false;

        int i=1;
        while(!stop){
            if (i>=n){
                stop=true;
            }
            else{
                if(i%2==0){
                    System.out.print(" genap ");
                }
                else{
                    System.out.print(" ganjil ");
                }
                i++;
            }
        }
    }
}