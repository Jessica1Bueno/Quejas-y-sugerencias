
package proyecto.progra.pkg17.pkg5.pkg19;
//importaciones de librerias que utilizamos en todo el código
import javax.swing.JOptionPane;

public class ExcepcionRegistro extends Exception {
    public ExcepcionRegistro(int num){
        //JOptionPane.showMessageDialog(null, "Campo vacio");
        switch(num){//swtich que evalua lo que se le manda
            case 1: campo_vacio();
                    break;
            case 2: cadena_incorrecta();//llama metodo
                    break;
            default:System.out.println("error");//imprime mensaje
                    break;
                
            
        }
    }
    //metodos
    public void campo_vacio(){
        JOptionPane.showMessageDialog(null, "Campo vacio","Error",JOptionPane.WARNING_MESSAGE);
    }
    
    public void cadena_incorrecta(){
        //imprime mensaje de error
        JOptionPane.showMessageDialog(null, "Caracteres no válidos","Error",JOptionPane.WARNING_MESSAGE);
    }
    
}
