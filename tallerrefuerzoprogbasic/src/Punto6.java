
import javax.swing.JOptionPane;


public class Punto6 {
    public static void main(String[] args) {
        int opcion;
        String [] serVivo={"Gato","Arbol","Champiñon","Bacterias","Amebas"};
        
        opcion= JOptionPane.showOptionDialog(null, "Selecciona un ser vivo", "PUNTO 6", JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,null, serVivo, serVivo[0]);
        switch (opcion) {
            case 0:
                JOptionPane.showMessageDialog(null,"El gato pertenece al reino ANIMAL","PUNTO 6",1);
                break;
            case 1:
                JOptionPane.showMessageDialog(null,"El arbol pertenece al reino VEGETAL","PUNTO 6",1);
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"El champiñon pertenece al reino FUNGI","PUNTO 6",1);
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Las bacterias pertenecen al reino MONERA","PUNTO 6",1);
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"Las amebas pertenecen al reino PROTISTA","PUNTO 6",1
                );
                break;
            default:
                JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna opcion","PUNTO 6",0);
        }
        
    }
    
    
}
