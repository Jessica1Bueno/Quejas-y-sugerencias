package proyecto.progra.pkg17.pkg5.pkg19;
//importaciones de librerias que utilizamos en todo el código
import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
public class Baja extends javax.swing.JFrame {
    //definicion de variables
    int tipo,queja;
    String tipo_aux, queja_aux, estado="activo",estado2="inactivo",usuario="",nombre="";
    int id,tipo_movimiento=2;
    Conexion con;
    DefaultTableModel modelo = new DefaultTableModel();
    public Baja(String nombre,String usuario) {//constructor con variables mandadas
        this.nombre=nombre;//toman el valor que es mandado al constructor
        this.usuario=usuario;
        initComponents();
        this.setTitle("Baja de Registro");//titulo que aparece en la ventana
        this.setLocationRelativeTo(null);//muestra la pantalla en el centro
        this.setResizable(false);//no se mueve el tamaño del frame
        btnEliminar.setEnabled(false);//desabilita botones
        btnCambiar.setEnabled(false);
        mostrar();//llamado de un metodo
    }
    private void mostrar(){//metodo que muestra la tabla de incidencias
        modelo.setRowCount(0);//limpia la tabla
        con=new Conexion();//crea conexion con BD
        Connection reg=con.getConnection();    
        //selecciona siempre y cuando acate las condiciones
        ResultSet rs = Conexion.getTabla("select * from incidencias where estado='"+estado+"'");
        //nombre a los encabezados
        modelo.setColumnIdentifiers(new Object[]{"Id", "Tipo","Nombre cliente","Dirección cliente","Edad cliente","Teléfono cliente","Descripción","Nombre gestor","Queja","Estado","Fecha"});
        try {
            while (rs.next()) {
                tipo=rs.getInt("id_tipo_incidencia");//toma valor en variable
                if(tipo==1){//evalua
                   tipo_aux="Queja";//toma el valor segun lo evaluado 
                }else if(tipo==2){
                   tipo_aux="Sugerencia"; 
                }
                queja=rs.getInt("id_tipo_estado");//toma el valor
                if(queja==1){
                   queja_aux="En espera"; 
                }else if(queja==2){
                   queja_aux="Urgencia"; 
                }
                // añade los resultado a al modelo de tabla
                modelo.addRow(new Object[]{rs.getInt("id_incidencia"), tipo_aux, rs.getString("nombre_cliente"), rs.getString("direccion_cliente"), rs.getInt("edad_cliente"), rs.getString("telefono_cliente"), rs.getString("descripcion_cliente"),rs.getString("id_gestor"),queja_aux,rs.getString("estado"),rs.getTimestamp("fecha")});
            }            
            // asigna el modelo a la tabla
            tabla.setModel(modelo);//muestra la tabla
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No hay conexión a la base de datos "+e);
        }
        con.desconectar();//desconecta con BD
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSeleccionar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtIncidencia = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtGestor = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        btnCambiar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtEst = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Baja queja o sugerencia");

        jLabel2.setText("Selecciona en la tabla el registro a eliminar da clic en Seleccionar, después se mostraran los datos para verificar");

        jLabel3.setText("que sea el que se quiere eliminar, posteriormente se da clic en el botón de Eliminar.");

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jLabel4.setText("ID");

        jLabel5.setText("Tipo");

        jLabel6.setText("Nombre");

        jLabel7.setText("Dirección");

        jLabel8.setText("Edad");

        jLabel9.setText("Teléfono");

        jLabel10.setText("Descripción");

        jLabel11.setText("Gestor");

        jLabel12.setText("Queja");

        jLabel13.setText("Estado");

        txtIncidencia.setEditable(false);

        txtTipo.setEditable(false);

        txtDireccion.setEditable(false);

        txtNombre.setEditable(false);

        txtEdad.setEditable(false);

        txtTelefono.setEditable(false);

        txtDescripcion.setEditable(false);
        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        txtGestor.setEditable(false);

        txtEstado.setEditable(false);

        txtFecha.setEditable(false);

        btnCambiar.setText("Cambiar");
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });

        jLabel14.setText("Fecha");

        txtEst.setEditable(false);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(btnSeleccionar)
                                .addGap(30, 30, 30)
                                .addComponent(btnEliminar)
                                .addGap(42, 42, 42)
                                .addComponent(btnCambiar)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalir))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addGap(27, 27, 27)
                                                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(38, 38, 38)
                                                    .addComponent(jLabel9))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                            .addComponent(jLabel4)
                                                            .addGap(30, 30, 30)
                                                            .addComponent(txtIncidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(jLabel6)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGap(38, 38, 38)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel8)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(jLabel10)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                            .addGap(25, 25, 25)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel12)
                                                        .addComponent(jLabel11)
                                                        .addComponent(jLabel13))
                                                    .addGap(38, 38, 38)
                                                    .addComponent(txtGestor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(3, 3, 3)
                                                    .addComponent(jLabel14))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtEstado)
                                        .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                        .addComponent(txtEst)))))
                        .addGap(0, 31, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(txtIncidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGestor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel10)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(txtEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnSeleccionar)
                    .addComponent(btnCambiar)
                    .addComponent(btnSalir))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        int fila=tabla.getSelectedRow();//toma el numero de fila que se selecciono
        if(fila>=0){
            //toma los valores en variables
            txtIncidencia.setText(tabla.getValueAt(fila, 0).toString());
            txtTipo.setText(tabla.getValueAt(fila, 1).toString());
            txtNombre.setText(tabla.getValueAt(fila, 2).toString());
            txtDireccion.setText(tabla.getValueAt(fila, 3).toString());
            txtEdad.setText(tabla.getValueAt(fila, 4).toString());
            txtTelefono.setText(tabla.getValueAt(fila, 5).toString());
            txtDescripcion.setText(tabla.getValueAt(fila, 6).toString());
            txtGestor.setText(tabla.getValueAt(fila, 7).toString());
            txtEstado.setText(tabla.getValueAt(fila, 8).toString());
            txtEst.setText(tabla.getValueAt(fila, 9).toString());
            txtFecha.setText(tabla.getValueAt(fila, 10).toString());
        }else{
            JOptionPane.showMessageDialog(null, "Fila no encontrada...");
        }
        btnEliminar.setEnabled(true);//habilita botones
        btnSeleccionar.setEnabled(false);//deshabiluta botones
        btnCambiar.setEnabled(true);
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //cuando se oprime el boton hace lo siguiente:
        con=new Conexion();//crea la conexion con BD
        com.mysql.jdbc.Connection reg=con.getConnection();
        //encabezados de tabla
        modelo.setColumnIdentifiers(new Object[]{"Id", "Tipo","Nombre cliente","Dirección cliente","Edad cliente","Teléfono cliente","Descripción","Nombre gestor","Queja","Estado","Fecha"});
        try {
            //String Query = ("DELETE  FROM incidencias WHERE id_incidencia='"+txtIncidencia.getText()+"'");
            //solamente cambia el valor de estado para saber si se "borro" la incidencia
            String Query = ("UPDATE incidencias SET estado='"+estado2+"' WHERE id_incidencia='"+txtIncidencia.getText()+"'");

            Statement st = (Statement) reg.createStatement();
            st.executeUpdate(Query);//lo sube a la bd
            JOptionPane.showMessageDialog(null, "Datos Eliminados de forma exitosa");  
            mostrar();
            ////////////////////////////////// registro de movimiento
            String movimiento= ("INSERT INTO movimiento_gestor (id_tipo_movimiento, id_gestor) "
                     + "VALUES ('" + tipo_movimiento + "','" + usuario + "')");
            Statement stt = (Statement) reg.createStatement();
            stt.executeUpdate(movimiento);
            System.out.println("Registro de movimiento ");
            //////////////////////////////////////////////////////////
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No hay conexión a la base de datos "+e);
        }finally{
            //limpia los campos
            txtIncidencia.setText("");
            txtTipo.setText("");
            txtNombre.setText("");
            txtDireccion.setText("");
            txtEdad.setText("");
            txtTelefono.setText("");
            txtDescripcion.setText("");
            txtGestor.setText("");
            txtEstado.setText("");
            txtFecha.setText("");
            txtEst.setText("");
            btnSeleccionar.setEnabled(true);//habilita botones
            btnEliminar.setEnabled(false);
            btnCambiar.setEnabled(false);//deshabilita botones
        }
        con.desconectar();//desconecta con BD
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        //cuando se oprime el boton hace lo siguiente:
        //limpia los campos y habilita y deshabilita los botones necesarios
        txtIncidencia.setText("");
            txtTipo.setText("");
            txtNombre.setText("");
            txtDireccion.setText("");
            txtEdad.setText("");
            txtTelefono.setText("");
            txtDescripcion.setText("");
            txtGestor.setText("");
            txtEstado.setText("");
            txtFecha.setText("");
            txtEst.setText("");
            btnSeleccionar.setEnabled(true);
            btnEliminar.setEnabled(false);
    }//GEN-LAST:event_btnCambiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //cuando se oprime el boton hace lo siguiente:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGestor(nombre,usuario).setVisible(true);//llamado a otra clase
            }
        });
        this.setVisible(false);//deshabilita ventana
    }//GEN-LAST:event_btnSalirActionPerformed
    public static void main(String args[]) {
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Baja().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEst;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtGestor;
    private javax.swing.JTextField txtIncidencia;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
