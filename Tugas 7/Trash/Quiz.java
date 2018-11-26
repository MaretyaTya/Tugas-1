import java.util.Scanner;
import java.util.Random;
class Quiz{
    public static void main(String[] args) {
        Random random=new Random();
        Scanner input=new Scanner(System.in); 
        char menu='y';

        do{
            int number=random.nextInt(10)+1;
            boolean success=false;
            do{
                System.out.print("Tebak angka (1-10): ");
                int answer=input.nextInt();
                input.nextLine();
                    if(answer<number){
                        System.out.println("jawaban anda lebih kecil dari jawaban yg benar");
                    }
                    else if(answer>number){
                        System.out.println("jawaban anda lebih besar dari jawaban yg benar");
                    }
                    else{
                        success=(answer==number);
                    }
            }while(!success);
            System.out.print("apakah anda ingin mengulang permainan (Y/y)?");
            menu=input.findInLine(".").charAt(0);
            input.nextLine();
        }while(menu=='y' || menu=='Y');
    }
}