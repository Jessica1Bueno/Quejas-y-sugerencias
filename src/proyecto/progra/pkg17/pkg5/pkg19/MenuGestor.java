package proyecto.progra.pkg17.pkg5.pkg19;
import javax.swing.*;//importaciones de librerias 
import javax.swing.UIManager.*;

public class MenuGestor extends javax.swing.JFrame {
    String nombre="",usuario="";//varibales
    public MenuGestor(String nombre,String usuario) {//constructor
        this.nombre=nombre;//toma los valores que vienen en el constructor
        this.usuario=usuario;
        try{//diseño de las ventanas
            UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
        }catch(Exception ex){}
        initComponents();
        
        this.setTitle("Menú Gestor");//titulo
        this.setLocationRelativeTo(null);//centrado de la ventana
        this.setResizable(false);//no se mueve el tamaño del frame
        //imprime lo necesario en los campos necesarios
        Foto.setIcon(new javax.swing.ImageIcon("imagenes\\user.png"));
        lbUsuario.setText("Usuario: "+nombre);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCerrar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnBaja = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnAlta = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        Foto = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();

        btnCerrar.setText("Cerrar sesión");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnBaja.setText("Baja");
        btnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Menú de Gestor");

        btnAlta.setText("Alta");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        lbUsuario.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAlta, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBaja)
                            .addComponent(btnConsultar))
                        .addGap(83, 83, 83))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnCerrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lbUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlta)
                    .addComponent(btnBaja))
                .addGap(18, 18, 18)
                .addComponent(btnCerrar)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnEditar))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        new Alta(nombre,usuario).setVisible(true);//llama a otro frame
        this.setVisible(false);//deshabilita esta ventana
    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformed
        new Baja(nombre,usuario).setVisible(true);//llama a otro frame
        this.setVisible(false);//deshabilita esta ventana
    }//GEN-LAST:event_btnBajaActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
         new Editar(nombre, usuario).setVisible(true);//llama a otro frame
         this.setVisible(false);//deshabilita esta ventana
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        new Consultas(nombre, usuario).setVisible(true);//llama a otro frame
        this.setVisible(false);//deshabilita esta ventana
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        //System.exit(0);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);//llama a otro frame
            }
        });
        this.setVisible(false);//deshabilita esta ventana
    }//GEN-LAST:event_btnCerrarActionPerformed

    public static void main(String args[]) {

        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGestor().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Foto;
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbUsuario;
    // End of variables declaration//GEN-END:variables
}
