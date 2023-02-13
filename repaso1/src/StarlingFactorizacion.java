

import javax.swing.JOptionPane;


public class StarlingFactorizacion {
    public static void main(String[] args) {
        int num, fact1=1;
        int fact2;
        
        num=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a factorizar: "));
        
        for(int i=num;i>0;i--){
            fact1*=i;
        }
        JOptionPane.showMessageDialog(null,"Resultado de factorización por multiplicacion de valores: "+ fact1);
        
        fact2=(int)Math.round((Math.pow(num, num))*((Math.sqrt(2*Math.PI*num)))*(Math.pow(Math.E, -num)));
        JOptionPane.showMessageDialog(null, "Resultado de factorización con formula de Starling: "+fact2);
    }
}
