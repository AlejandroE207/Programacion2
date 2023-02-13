
import java.util.Scanner;


public class Punto5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numFin;
        System.out.print("Digite hasta que numero se mostrara: ");
        numFin=sc.nextInt();
        for(int i=1;i<=numFin;i+=3){
            System.out.println(i);
        }
    }
}

//PROGRAMA CON FUNCIONES O MODULOS
//public class Punto5{
//    public static void mostrar(int numFin){
//        for(int i=1;i<=numFin;i+=3){
//            System.out.println(i);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int numFin;
//        System.out.print("Digite hasta que numero se mostrara: ");
//        numFin=sc.nextInt();
//        
//        mostrar(numFin);
//    }
//}
