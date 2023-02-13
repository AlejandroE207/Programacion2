
package clase1;

import javax.swing.JOptionPane;

public class PrimeraClase {
    public static void main(String[] args) { //signatura de metodo
        int num;
        
        num=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: "));
        
        JOptionPane.showMessageDialog(null, num);
    }
} 
