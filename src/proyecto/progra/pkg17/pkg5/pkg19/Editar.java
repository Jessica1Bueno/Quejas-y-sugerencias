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

public class Editar extends javax.swing.JFrame {
    //definicion de variables
    int id,edad;
    String tipo, nombre, direccion,telefono,descripcion,estado,fecha,gestor,est="activo",esta,usuario="", nombre1="";
    int tipo1,queja1;
    String tipo_aux, queja_aux;
    Conexion con;
    String [] arreglo;
    int aux=0,cont=0,tgestor=1,tipo_movimiento=3;
    DefaultTableModel modelo = new DefaultTableModel();
    public Editar(String nombre1,String usuario) {//constructor con variables mandadas
        this.nombre1=nombre1;
        this.usuario=usuario;//toman el valor que es mandado al constructor
        initComponents();
        this.setTitle("Editar registro");//titulo que aparece en la ventana
        this.setLocationRelativeTo(null);//muestra la pantalla en el centro
        this.setResizable(false);//no se mueve el tamaño del frame
        btnGuardar.setEnabled(false);//deshabilita un boton
        mostrar();//llamada de metodo
    }
    private void mostrar(){
        modelo.setRowCount(0);//limpia la tabla
        con=new Conexion();
        Connection reg=con.getConnection();            
        //selecciona de la taba todos los registros
        ResultSet rs = Conexion.getTabla("select * from incidencias");
        //encabezados
        modelo.setColumnIdentifiers(new Object[]{"Id", "Tipo","Nombre cliente","Dirección cliente","Edad cliente","Teléfono cliente","Descripción","Nombre gestor","Queja","Estado","Fecha"});
            
        try {
            while (rs.next()) {
                tipo1=rs.getInt("id_tipo_incidencia");//toma el valor de la bd
                if(tipo1==1){//evalua
                   tipo_aux="Queja"; 
                }else if(tipo1==2){
                   tipo_aux="Sugerencia"; 
                }
                queja1=rs.getInt("id_tipo_estado");
                if(queja1==1){
                   queja_aux="En espera"; //toma el valor segun lo evaluado
                }else if(queja1==2){
                   queja_aux="Urgencia"; 
                }
                // añade los resultado a al modelo de tabla
                modelo.addRow(new Object[]{rs.getInt("id_incidencia"), tipo_aux, rs.getString("nombre_cliente"), rs.getString("direccion_cliente"), rs.getInt("edad_cliente"), rs.getString("telefono_cliente"), rs.getString("descripcion_cliente"),rs.getString("id_gestor"),queja_aux,rs.getString("estado"),rs.getTimestamp("fecha")});
            }            
            // asigna el modelo a la tabla
            tabla.setModel(modelo);            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No hay conexión a la base de datos "+e);
        }
        con.desconectar();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtIncidencia = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtGestor = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnMostrar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtEst = new javax.swing.JTextField();
        comboEstado = new javax.swing.JComboBox<>();
        comboTipo = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Editar queja o sugerencia");

        jLabel2.setText("ID incidencia");

        jLabel3.setText("Tipo de incidencia");

        jLabel4.setText("Nombre");

        jLabel5.setText("Dirección");

        jLabel6.setText("Edad");

        jLabel7.setText("Teléfono");

        jLabel8.setText("Descripción");

        jLabel9.setText("Gestor");

        jLabel10.setText("Queja");

        jLabel11.setText("Estado");

        txtIncidencia.setEditable(false);

        txtGestor.setEditable(false);

        txtFecha.setEditable(false);

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel12.setText("Selecciona de la tabla el dato que quieras modificar y da clic en el botón");

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        jLabel13.setText("Fecha");

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "En espera", "Urgencia" }));

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Queja", "Sugerencia" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(28, 28, 28)
                        .addComponent(btnMostrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGestor, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar))
                        .addGap(80, 80, 80))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtIncidencia)
                                .addComponent(txtNombre)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                            .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEst, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(76, 76, 76))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(txtIncidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGestor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(btnMostrar)
                    .addComponent(btnGuardar)))
        );

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
        jScrollPane3.setViewportView(tabla);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(btnSalir)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        //cuando se oprime el boton hace lo siguiente:
        String aux="",aux2="";//variables
        int fila=tabla.getSelectedRow();//toma en que fila se selecciono
        if(fila>=0){
            //toman los valores de la ffila y se imprimen en campos de texto
            txtIncidencia.setText(tabla.getValueAt(fila, 0).toString());
            aux2=tabla.getValueAt(fila, 1).toString();
            comboTipo.setSelectedItem(aux2);
            txtNombre.setText(tabla.getValueAt(fila, 2).toString());
            txtDireccion.setText(tabla.getValueAt(fila, 3).toString());
            txtEdad.setText(tabla.getValueAt(fila, 4).toString());
            txtTelefono.setText(tabla.getValueAt(fila, 5).toString());
            txtDescripcion.setText(tabla.getValueAt(fila, 6).toString());
            txtGestor.setText(tabla.getValueAt(fila, 7).toString());
            aux=tabla.getValueAt(fila, 8).toString();
            comboEstado.setSelectedItem(aux);
            txtEst.setText(tabla.getValueAt(fila, 9).toString());
            txtFecha.setText(tabla.getValueAt(fila, 10).toString());
        }else{
            JOptionPane.showMessageDialog(null, "Fila no encontrada...");
        }
        btnGuardar.setEnabled(true);//habilita botones
        btnMostrar.setEnabled(false);
        
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        con=new Conexion();//crea conexion
        com.mysql.jdbc.Connection reg=con.getConnection();
        //titulos de la tabla
        modelo.setColumnIdentifiers(new Object[]{"Id", "Tipo","Nombre cliente","Dirección cliente","Edad cliente","Teléfono cliente","Descripción","Nombre gestor","Queja","Estado","Fecha"});
        try {
            id=Integer.parseInt(txtIncidencia.getText());
            tipo=(String)comboTipo.getSelectedItem();
            if(tipo.equals("Queja")){
                tipo1=1; 
            }else if(tipo.equals("Sugerencia")){
                tipo1=2; 
            }
            nombre=txtNombre.getText();//toma el valor de nombres de la bd
            llamada2(nombre);
            direccion=txtDireccion.getText();
            llamada3(direccion);//evalua que lo ingresado sea correcto
            edad=Integer.parseInt(txtEdad.getText());
            llamada(edad);
            telefono=txtTelefono.getText();
            llamada1(telefono);
            descripcion=txtDescripcion.getText();
            gestor=txtGestor.getText();
            estado=(String)comboEstado.getSelectedItem();
            esta=txtEst.getText();
            llamada2(esta);//evalua lo ingresado
            if(estado.equals("En espera")){
                queja1=1; //toma valores segun lo evaluado
            }else if(estado.equals("Urgencia")){
                queja1=2; 
            }
            
            fecha=txtFecha.getText();//toma valores
            //hace cambios en el dato que se debe cambiar
            String Query = ("UPDATE incidencias SET id_tipo_incidencia='"+tipo1+"'"
                    + ",nombre_cliente='"+nombre+"',direccion_cliente='"+direccion+"'"
                    + ",edad_cliente='"+edad+"',telefono_cliente='"+telefono+"'"
                    + ",descripcion_cliente='"+descripcion+"',id_gestor='"+gestor+"'"
                    + ",id_tipo_estado='"+queja1+"',estado='"+est+"',fecha='"+fecha+"' where id_incidencia='"+id+"'");

            Statement st = (Statement) reg.createStatement();
            st.executeUpdate(Query);//sube el cambio
            JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");  
            mostrar();
            ////////////////////////////////// registro de movimiento
            String movimiento= ("INSERT INTO movimiento_gestor (id_tipo_movimiento, id_gestor) "
                    + "VALUES ('" + tipo_movimiento + "','" + usuario + "')");
            Statement stt = (Statement) reg.createStatement();
            stt.executeUpdate(movimiento);
            System.out.println("Registro de movimiento ");
            //////////////////////////////////////////////////////////
        //errores que se pueden cometer
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No hay conexión a la base de datos "+e);
        }catch(MiExcepcion e){
            JOptionPane.showMessageDialog(null, "Error de ingreso");
        }catch(MiExcepcion1 e1){
            JOptionPane.showMessageDialog(null, "Error de ingreso");
        }catch(MiExcepcion2 e2){
            JOptionPane.showMessageDialog(null, "Error de ingreso");
        }catch(MiExcepcion3 e3){
            JOptionPane.showMessageDialog(null, "Error de ingreso");
        }catch(ExcepcionRegistro ex3){
        }finally{
            //limpia campos
            txtIncidencia.setText("");
            comboTipo.setSelectedItem("Queja");//toma valor el combo
            txtNombre.setText("");
            txtDireccion.setText("");
            txtEdad.setText("");
            txtTelefono.setText("");
            txtDescripcion.setText("");
            txtGestor.setText("");
            comboEstado.setSelectedItem("En espera");
            txtFecha.setText("");
            btnMostrar.setEnabled(true);
            btnGuardar.setEnabled(false);
        }
        con.desconectar();//desconecta la bd
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //boton de salida
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGestor(nombre1,usuario).setVisible(true);//llama a otro frame
            }
        });
        this.setVisible(false);//deshabilita la ventana
    }//GEN-LAST:event_btnSalirActionPerformed
    private void llamada1(String telefono) throws MiExcepcion1,ExcepcionRegistro{
        //evalua los datos ingresados
        //variables
        boolean bandera=false;
        int cont=0;
        String aux_telefono;
        aux_telefono=telefono;
        char[] arrayChar = aux_telefono.toCharArray();
	for(int i=0; i<arrayChar.length; i++){
            cont++;	
        }
        if(cont!=6){//evalua condicion
            throw new MiExcepcion1();
        }
        for(int i=0; i<nombre.length();i++){
            if(nombre.charAt(i)==' '){
                bandera=true;
            }else{
                bandera=false;
                break;
            }
        }
        if(bandera==true){
            throw new ExcepcionRegistro(1);
        }
        txtTelefono.setText("");//limpia campo
    }
    private void llamada(int edad) throws MiExcepcion, ExcepcionRegistro{
        String edad_aux;
        int cont=0;
        edad_aux=Integer.toString(edad);
        char[] arrayChar = edad_aux.toCharArray();
	for(int i=0; i<arrayChar.length; i++){
            cont++;	
        }
        if((cont<=1)||(cont>=3)){
            throw new MiExcepcion();//llama a la excepcion
        }
        if(edad<=0){
            throw new MiExcepcion();
        }
        txtEdad.setText("");//limpia campo 
    }
    private void llamada2(String nombre) throws MiExcepcion2,ExcepcionRegistro{
        boolean bandera=false;
        if(nombre.equals("")){
            throw new MiExcepcion2();
        }
        for(int i=0; i<nombre.length();i++){
            if(nombre.charAt(i)==' '){
                bandera=true;
            }else{
                bandera=false;
                break;
            }
        }
        if(bandera==true){
            throw new ExcepcionRegistro(1);
        }
        if(!nombre.matches("^[A-Za-z\\s]*$")){//si no son solo letras las ingresadas
             throw new ExcepcionRegistro(2);//llama excepcion
         }
    }
    private void llamada3(String direccion) throws MiExcepcion3,ExcepcionRegistro{
        boolean bandera=false;
        if(direccion.equals("")){
            throw new MiExcepcion3();
        }
         for(int i=0; i<nombre.length();i++){
            if(nombre.charAt(i)==' '){//evalua que no sena solo espacios
                bandera=true;
            }else{
                bandera=false;
                break;
            }
        }
        if(bandera==true){
            throw new ExcepcionRegistro(1);
        }
        
    }    public static void main(String args[]) {
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editar().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabla;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEst;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtGestor;
    private javax.swing.JTextField txtIncidencia;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
