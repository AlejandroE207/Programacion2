
public class Figura {
    public static void main(String[] args) {
        String esp = " ";
        System.out.print("\t  //\\\\\n\t //  \\\\\n\t//    \\\\\n    ");
        
        for(int j=0; j<2;j++){
            for(int i=0;i<16;i++){
            System.out.print("=");
            }
            System.out.print("\n    ");
        }
        
        System.out.println("\t O    O");
        System.out.print("    ");
        for(int i=0; i<8;i++){
            System.out.print("\" ");
        }
        System.out.print("\n    ");
        for(int i=0; i<6;i++){
            System.out.print("'  ");
        }
        
    }
}
