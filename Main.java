import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        double a, b;

        Scanner inp = new Scanner(System.in);
        System.out.println("Let's calculate your BMI! ");
        System.out.print("Please enter your heigth in meters (e.g 1,72) : " );
        a = inp.nextDouble();

        System.out.print("Please enter your weight in kg (e.g 75) : " );
        b = inp.nextDouble();

        double sum = (b / a * a);
        System.out.println(sum);





    }
}
