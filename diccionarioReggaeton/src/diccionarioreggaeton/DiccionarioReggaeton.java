
package diccionarioreggaeton;

import javax.swing.JOptionPane;

public class DiccionarioReggaeton {

    public static void main(String[] args) {
        String palabra;
        palabra=JOptionPane.showInputDialog(null,"""
                                                 DIGITE UNA PALABRA PARA SU SIGNIFICADO:
                                                 - Garate
                                                 - Corillo
                                                 - Pichaera
                                                 - Josear
                                                 - Maquinea
                                                 - Guayar
                                                 - Tukuntazo
                                                 - Blin blin
                                                 - Janguear
                                                 - Rebuleo
                                                 """);
        palabra=palabra.toLowerCase();
        switch (palabra) {
            case "garate":
                JOptionPane.showMessageDialog(null, "Para manifestar desagrado, enfado o rechazo",palabra,0);
                break;
            case "corillo":
                JOptionPane.showMessageDialog(null, "El corillo es la ganga, los amigos, el jangueo... es tu grupo de colegas",palabra,0);
                break;
            case "pichaera":
                JOptionPane.showMessageDialog(null, "En la jerga del género urbano  se refiere a cuando tratas de hablar con alguien y la otra persona te ignora, te evita y ni siquiera te presta atención o te cambia de tema.",palabra,0);
                break;
            case "josear":
                JOptionPane.showMessageDialog(null, "tú estás trabajando muy duro para conseguir mucho dinero, significa buscarse la vida",palabra,0);
                break;
            case "maquinea":
                JOptionPane.showMessageDialog(null, "Urdir, tramar algo oculta y artificiosamente.",palabra,0);
                break;
            case "guayar":
                JOptionPane.showMessageDialog(null, "Cuando tienes que rallar algo con el rallador, pero también a bailar muy pegados",palabra,0);
                break;
            case "tukuntazo":
                JOptionPane.showMessageDialog(null, "Es la buena energía, lo que tú sientas en el momento con mucho gozo, ya sea teniendo sexo o pasándolo bien con los amigos; todo depende del significado que tú le quieras dar.",palabra,0);
                break;
            case "blin blin":
                JOptionPane.showMessageDialog(null, "Es el collar o la cadena de oro que lleva su flow de diamantes y que brilla mucho. Sería el cadenón",palabra,0);
                break;
            case "janguear":
                JOptionPane.showMessageDialog(null, "Significa divertirse, el jangueo es diversión, salir con los amigos a pasarlo bien",palabra,0);
                break;
            case "rebuleo":
                JOptionPane.showMessageDialog(null, "Es el alboroto de gente, cuando se juntan muchos en actividad y en actitud",palabra,0);
                break;
            default:
                throw new AssertionError();
        }
        
    }
    
}
