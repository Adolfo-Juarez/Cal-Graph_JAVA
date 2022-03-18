
package calculator2;

/**
 *
 * @author Adolfo Juárez 
 */
public class Main {
    
    public static void main (String[] Args){
        System.out.println("Inicializando");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }
}
