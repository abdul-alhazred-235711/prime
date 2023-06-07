import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("digite um numero:");
        double number1= scan.nextDouble();
        double primo=2;
        while(number1!=1){

            if(number1%primo==0){

                System.out.print(number1+"|");
                number1=number1/primo;

                System.out.println(primo);

                if(number1==1){
                    System.out.println("1.0");
                }


                primo=2;
            }else{
                primo++;
            }


        }
    }
}