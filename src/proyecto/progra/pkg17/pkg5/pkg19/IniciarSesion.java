
package proyecto.progra.pkg17.pkg5.pkg19;
//importaciones de librerias que utilizamos en todo el código
import static java.awt.SystemColor.menu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
//
import javax.swing.*;
import javax.swing.UIManager.*;



public class IniciarSesion extends javax.swing.JFrame {
    //variables
    Conexion con;
    private String nombre="",nombre1="",idUsuario="";
    int tipo,aux=1;
    public IniciarSesion() {//constructor
        //diseño de la ventana
        try{
            UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
        }catch(Exception ex){}
        initComponents();
        this.setTitle("Inicio de Sesión");//titulo
        this.setLocationRelativeTo(null);//pantalla en el centro
        this.setResizable(false);//no se mueve el tamaño del frame
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        btnIniciarSesion = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        jLabel1.setText("Usuario");

        jLabel2.setText("Contraseña");

        btnIniciarSesion.setText("Iniciar sesión");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(txtContrasena))
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btnRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIniciarSesion)
                .addGap(77, 77, 77))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciarSesion)
                    .addComponent(btnRegresar))
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed

    try {
        //crea la conexion a bd
        con=new Conexion();
        Connection reg=con.getConnection();
        //toma valore en variables
        String usuario=txtUsuario.getText();
        String contra=txtContrasena.getText();
        
        vacio_espacios();//llamado de metodo
         //toma valores de bd
        ResultSet resultado = con.consultar("SELECT id_usuario, nombre, id_tipo_usuario FROM usuarios WHERE id_usuario = '" + usuario + "' and contrasena = '" + contra+ "'" );
         resultado.last();
         if (resultado.getRow() > 0){
             nombre=resultado.getString("nombre");
             idUsuario=resultado.getString("id_usuario");
             tipo=resultado.getInt("id_tipo_usuario");
             JOptionPane.showMessageDialog(null, getNombre()+"\nHa ingresado exitosamente al sistema");
             //evalua si es gestor
             if(tipo==2){
                 //JOptionPane.showMessageDialog(null, "Gestor: "+getNombre()+"\n"+tipo);
                 nombre1=nombre;
                 aux=2;       
             }else{
                 JOptionPane.showMessageDialog(null, "Administrador");
                 aux=1;
             }
            
        }else{
             
             JOptionPane.showMessageDialog(null, "Id o contraseña incorrecta","Error", JOptionPane.WARNING_MESSAGE);
         }
    //errores que se pueden generar
    } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error en el inicio de sesión, favor de informar al encargado del area sobre el siguiente mensaje de error: \n"+ex, "Error", JOptionPane.WARNING_MESSAGE);  
            
    }catch(ExcepcionRegistro ex3){
          //campos vacios
    }finally{
        txtUsuario.setText("");//limpia campos
        txtContrasena.setText("");
    }
      
    if(aux==2){//evalua el valor de aux
        System.out.println(nombre1);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGestor(nombre1,idUsuario).setVisible(true);//llama a otro frame
            }
        });
        this.setVisible(false);//deshabilita la ventana
    }
       
       
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);//llama otro frame
            }
        });
        this.setVisible(false);//deshabilita la ventana
    }//GEN-LAST:event_btnRegresarActionPerformed

   //metodo que evalua
    private void vacio_espacios() throws ExcepcionRegistro{
        boolean bandera=false;
        //que no este vacio
        if (txtContrasena.getText().isEmpty()){
            throw new ExcepcionRegistro(1);
        }else if (txtUsuario.getText().isEmpty()){
            throw new ExcepcionRegistro(1);
        }
        
        bandera=false;
        //que no tenga solo espacios
        for(int i=0; i<txtUsuario.getText().length();i++){
            if(txtUsuario.getText().charAt(i)==' '){
                bandera=true;
            }else{
                bandera=false;
                break;
            }
        }
        if(bandera==true){
            throw new ExcepcionRegistro(1);
        }
        
        bandera=false;
        //que no tenga espacios
        for(int i=0; i<txtContrasena.getText().length();i++){
            if(txtContrasena.getText().charAt(i)==' '){
                bandera=true;
            }else{
                bandera=false;
                break;
            }
        }
        if(bandera==true){
            throw new ExcepcionRegistro(1);
        }
        
        
        
        
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    public String getNombre() {
        return nombre;
    }
}
