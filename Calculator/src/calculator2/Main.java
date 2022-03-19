
package calculator2;

/**
 *
 * @author Adolfo Juárez 
 */
public class Main {
    public static void main (String[] Args){
        debugMessage dg = new debugMessage();
        
        dg.msg("Inicializando programa...\n",1);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dg.msg("Cargando interfaz...",2);
                new UI().setVisible(true);
            }
        });
    }
}
