
import javax.swing.JOptionPane;


public class Punto8 {
    public static void main(String[] args) {
        final int clave=123;
        int tamClav;
        String auxClav, secreta="";
        int intento;
        auxClav=Integer.toString(clave);
        tamClav=auxClav.length();
        for(int i=1;i<=tamClav;i++){
            secreta+="* ";
        }
        for(int i=3;i>=1;i--){
            intento=Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                       ADIVINE LA CONTRASEÑA
                                                                       TAMAÑO DE CONTRASEÑA: 
                                                                       """+secreta));
            if(intento == clave){
                JOptionPane.showMessageDialog(null, "***** ACCESO PERMITIDO *****","PUNTO 8",1);
                break;
            }
            else{
                JOptionPane.showMessageDialog(null, """
                                                    ***** ACCESO DENEGADO *****
                                                    
                                                    Intentos disponibles: 
                                                    """+(i-1),"PUNTO 8",0);
            }
        }
    }
}
