
package proyecto.progra.pkg17.pkg5.pkg19;
import javax.swing.JOptionPane;//importaciones de librerias 
public class MiExcepcion extends Exception{

    public MiExcepcion() {
        JOptionPane.showMessageDialog(null, "Error de ingreso de edad, deben ser 2 digitos");
        //mensaje de error
                
    }
    
}
