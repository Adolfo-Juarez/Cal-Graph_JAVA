
package calculator2;

/**
 *
 * @author Adolfo Juárez 
 */
public class debugMessage{
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    /**
    *@param mg Mensaje aquí
    *@param mode Define el color de tu mensaje: 1-Green 2-: Yellow 0-:Blanco
    */
    public void msg(String mg, int mode){
        switch(mode){
            case 1:
                System.out.println(ANSI_GREEN+mg+ANSI_RESET);
                break;
            case 2:
                System.out.println(ANSI_YELLOW+mg+ANSI_RESET);
                break;
            case 0:
                System.out.println(ANSI_RESET+mg+ANSI_RESET);
                break;
            default:
                System.out.println(ANSI_RESET+mg+ANSI_RESET);
                break;
        }
    }
    public void msg(String mg){
       System.out.println(ANSI_RESET+mg+ANSI_RESET);
    }
}
