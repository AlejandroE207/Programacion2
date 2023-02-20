
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        solucion();
    }
    public static void solucion(){
        Scanner sc = new Scanner(System.in);
        int numCars, modelo, min=1;
        System.out.print("Digite la cantidad de carros que va a ingresar: ");
        numCars=sc.nextInt();
        while(numCars<1 || numCars>30){
            System.out.println("DIGITE POR FAVOR UN NUMERO ENTRE EL 1 Y EL 30!\n");
            System.out.print("Digite la cantidad de carros que va a ingresar: ");
            numCars=sc.nextInt();
        }
        for(int i=0;i<numCars;i++){
            System.out.print("Digite el modelo del carro #"+(i+1)+": ");
            modelo=sc.nextInt();
            if(modelo<1900 || modelo>2023){
                System.out.println("DIGITE POR FAVOR UN MODELO ENTRE 1900 Y 2023!");
                i--;
            }else{
               if(i==0)min=modelo;
            if(modelo<min) min=modelo; 
            }
            
        }
        System.out.println("El modelo mas antiguo que se ingreso es: "+min);
    }
}
