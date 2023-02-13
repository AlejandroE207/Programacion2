
import java.util.Scanner;

public class Punto2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numIni, numFin,aum;
        System.out.print("Digite el numero inicial: ");
        numIni=sc.nextInt();
        System.out.print("Digite el numero final: ");
        numFin=sc.nextInt();
        System.out.print("Digite el aumento: ");
        aum=sc.nextInt();
        
        for(int i=numIni;i<=numFin;i+=aum){
            System.out.println(i);
        }
    }
}

//PROGRAMACION CON FUNCIONES O MODULOS

//public class Punto2 {
//    public static void generador(int numIni,int numFin,int aum){
//        for(int i=numIni;i<=numFin;i+=aum){
//            System.out.println(i);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int numIni, numFin,aum;
//        System.out.print("Digite el numero inicial: ");
//        numIni=sc.nextInt();
//        System.out.print("Digite el numero final: ");
//        numFin=sc.nextInt();
//        System.out.print("Digite el aumento: ");
//        aum=sc.nextInt();
//        
//        generador(numIni,numFin,aum);
//    }
//}


