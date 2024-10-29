import java.util.Locale;
import java.util.Scanner;

public class CodeSpace{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       System.out.println("Informe a quantidade de alturas:");

       int n = sc.nextInt();
       double [] vect = new double[n];

       for(int i = 0; i<vect.length; i++){
            vect[i] = sc.nextDouble();
       }

        double sum = 0.0; 
       for(int i = 0; i<vect.length; i++){
            sum += vect[i];
       }

       double media = sum / n;

       System.out.printf("A media é: %.2f", media);
       System.out.println();
       sc.close();
    }
}