package proyecto.progra.pkg17.pkg5.pkg19;
//importaciones de librerias 
import javax.swing.JOptionPane;

public class MiExcepcion3 extends Exception{
    public MiExcepcion3() {
         //mensaje de error
        JOptionPane.showMessageDialog(null, "Error de ingreso de Dirección");
    }  
}
