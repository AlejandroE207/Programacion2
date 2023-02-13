
import java.util.Scanner;


public class PesoAstronauta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pesoAst, masaAst;
        int planet;
        
        System.out.println("Digite su peso en la tierra astronauta en Kg: ");
        pesoAst=sc.nextDouble();
        masaAst=pesoAst/9.8;
        System.out.println("""
                           Digite el numero del planeta que desea saber su peso:
                           1. Mercurio
                           2. Venus
                           3. Tierra
                           4. Marte
                           5. Jupiter
                           6. Saturno
                           7. Urano
                           8. Neptuno""");
        planet=sc.nextInt();
        switch (planet) {
            case 1:
                pesoAst=masaAst*3.7;
                System.out.println("Su peso en Mercurio seria de: "+pesoAst);
                break;
            case 2:
                pesoAst=masaAst*8.87;
                System.out.println("Su peso en Venus seria de: "+pesoAst);
                break;
            case 3:
                pesoAst=masaAst*9.8;
                System.out.println("Su peso en la Tierra seria de: "+pesoAst);
                break;
            case 4:
                pesoAst=masaAst*3.721;
                System.out.println("Su peso en Marte seria de: "+pesoAst);
                break;
            case 5:
                pesoAst=masaAst*24.79;
                System.out.println("Su peso en Jupiter seria de: "+pesoAst);
                break;
            case 6:
                pesoAst=masaAst*10.44;
                System.out.println("Su peso en Saturno seria de: "+pesoAst);
                break;
            case 7:
                pesoAst=masaAst*8.87;
                System.out.println("Su peso en Urano seria de: "+pesoAst);
                break;
            case 8:
                pesoAst=masaAst*11.15;
                System.out.println("Su peso en Neptuno seria de: "+pesoAst);
                break;
            default:
                System.out.println("Ingrese un valor valido POR FAVOR");
        }
    }
}
