
import javax.swing.JOptionPane;


public class Punto7 {
    public static void main(String[] args) {
        int num;
        do{
            num=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero del 1 al 7 (el 0 finalizara todo): "));
            switch (num) {
                case 1:
                    JOptionPane.showMessageDialog(null, "DO","PUNTO 7",1);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "RE","PUNTO 7",1);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "MI","PUNTO 7",1);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "FA","PUNTO 7",1);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "SOL","PUNTO 7",1);
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "LA","PUNTO 7",1);
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "SI","PUNTO 7",1);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando programa...","PUNTO 7",1);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite un numero del 0 al 7 (0 para finalizar todo)","PUNTO 7",0);
            }
        }
        while(num!=0);
    }
}

//PROGRAMA CON FUNCIONES O MODULOS
//public class Punto7{
//    public static void notas(){
//         int num;
//        do{
//            num=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero del 1 al 7 (el 0 finalizara todo): "));
//            switch (num) {
//                case 1:
//                    JOptionPane.showMessageDialog(null, "DO","PUNTO 7",1);
//                    break;
//                case 2:
//                    JOptionPane.showMessageDialog(null, "RE","PUNTO 7",1);
//                    break;
//                case 3:
//                    JOptionPane.showMessageDialog(null, "MI","PUNTO 7",1);
//                    break;
//                case 4:
//                    JOptionPane.showMessageDialog(null, "FA","PUNTO 7",1);
//                    break;
//                case 5:
//                    JOptionPane.showMessageDialog(null, "SOL","PUNTO 7",1);
//                    break;
//                case 6:
//                    JOptionPane.showMessageDialog(null, "LA","PUNTO 7",1);
//                    break;
//                case 7:
//                    JOptionPane.showMessageDialog(null, "SI","PUNTO 7",1);
//                    break;
//                case 0:
//                    JOptionPane.showMessageDialog(null, "Finalizando programa...","PUNTO 7",1);
//                    break;
//                default:
//                    JOptionPane.showMessageDialog(null, "Digite un numero del 0 al 7 (0 para finalizar todo)","PUNTO 7",0);
//            }
//        }
//        while(num!=0);
//    }
//    public static void main(String[] args) {
//        notas();
//    }
//}