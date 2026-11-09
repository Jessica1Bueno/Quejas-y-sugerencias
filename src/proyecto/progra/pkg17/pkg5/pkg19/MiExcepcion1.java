
package proyecto.progra.pkg17.pkg5.pkg19;
////importaciones de librerias 
import javax.swing.JOptionPane;
public class MiExcepcion1 extends Exception{

    public MiExcepcion1() {
         //mensaje de error
        JOptionPane.showMessageDialog(null, "Error de ingreso de teléfono, deben ser 6 digitos");
    }
    
    
}
