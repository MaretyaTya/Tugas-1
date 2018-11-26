import java.util.Scanner;
    class Kalkulator
    {public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            double angka1,angka2,hasil;
            char operator;

            System.out.print("Masukan angka pertama = ");
            angka1=sc.nextDouble();
            System.out.print("Masukan angka Kedua = ");
            angka2=sc.nextDouble();
            System.out.print("Masukan Operator (+ - * / %) = ");
            operator=sc.next().charAt(0);

            switch(operator)
            {
                case '+':
                hasil=angka1+angka2;
                System.out.println(angka1 + "+" + angka2 + " = " + hasil);
                break;

                case '-':
                hasil=angka1-angka2;
                System.out.println(angka1 + "-" + angka2 + " = " + hasil);
                break;

                case '*':
                hasil=angka1*angka2;
                System.out.println(angka1 + "*" + angka2 + " = " + hasil);
                break;

                case '/':
                hasil=angka1/angka2;
                System.out.println(angka1 + "/" + angka2 + " = " + hasil);
                break;

                case '%':
                hasil=angka1%angka2;
                System.out.println(angka1 + "%" + angka2 + " = " + hasil);
                break;

                default:
                System.out.println("Operator yang anda masukan salah");
            }

        }

    }