package puntoDebug;


import java.util.Scanner;


public class EjecDebug {
    public static void main(String[] args) {
        siuuu();
    }
    
    public static void siuuu() {
        int N;
        double factorial;
        Scanner sc = new Scanner(System.in);
        //Leer un número entero:
        do{System.out.print("Introduce un número > 0: ");
            N = sc.nextInt();
        }while(N<0);
        for(int i = 0; i <= N ; i++){//repite para cada número desde 1 hasta N
            //se calcula elfactorialde cada número
            factorial = 1;
            for(int j = 1; j <= i; j++){
                factorial = factorial * j;
            }
            System.out.printf("%2d! = %.0f %n", i, factorial);
        }
    }
}
