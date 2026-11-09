package proyecto.progra.pkg17.pkg5.pkg19;
//importaciones de librerias que utilizamos en todo el código
import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class Alta extends javax.swing.JFrame {
    //definicion de variables
    private int edad,id_tipo,id_queja;
    private String nombre, direccion, descripcion, nombreRegistro,tipo,queja, telefono, estado, usuario="",nombre1="";
    Conexion con;
    String [] arreglo;
    DefaultTableModel modelo = new DefaultTableModel();
    int cont=0,tgestor=2,aux=0, tipo_movimiento=1;
    
    public Alta(String nombre1, String usuario) {//constructor con dos varibles
        this.nombre1=nombre1;
        this.usuario=usuario;//toman el valor que es mandado al constructor
        initComponents();
        this.setTitle("Alta de Registro");//titulo que aparece en la ventana
        this.setLocationRelativeTo(null);//muestra la pantalla en el centro
        this.setResizable(false);//no se mueve el tamaño del frame
        txtGes.setText(usuario);//imprime el valor de una variable
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        comboQueja = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnRegistrar = new javax.swing.JButton();
        comboTipo = new javax.swing.JComboBox<>();
        txtGes = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sugerencia", "Queja"}));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Dar de Alta queja o sugerencia ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Tipo de incidencia:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Información del cliente");

        jLabel5.setText("Nombre:");

        jLabel6.setText("Dirección:");

        jLabel7.setText("Edad:");

        jLabel8.setText("Teléfono:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Queja:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Descripción:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Registro la incidencia:");

        comboQueja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-","Urgencia", "En espera" }));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane5.setViewportView(txtDescripcion);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-","Sugerencia", "Queja" }));

        txtGes.setEditable(false);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(btnSalir))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(25, 25, 25)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel8)))
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel3)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(comboQueja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtGes, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                                .addComponent(txtEdad, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnRegistrar)
                                        .addGap(122, 122, 122))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(comboQueja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtGes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnSalir))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        //cuando se oprime el boton hace lo siguiente:
        try{
            con=new Conexion();//crea la conexion con la base de datos
            Connection reg=con.getConnection();
            nombre=txtNombre.getText();//toma el valor que ingreso el usuario y lo guarda en la variable
            llamada2(nombre);//lo evalua para que no se ingresen datos erroneos
            direccion=txtDireccion.getText();
            llamada3(direccion);
            edad=Integer.parseInt(txtEdad.getText());//toma el valor que ingreso el usuario y lo guarda en la variable
            llamada(edad);//lo evalua para que no se ingresen datos erroneos
            telefono=txtTelefono.getText();//toma el valor que ingreso el usuario y lo guarda en la variable
            llamada1(telefono);
            descripcion=txtDescripcion.getText();
            //nombreRegistro=txtRegistro.getText();
            nombreRegistro=txtGes.getText();
            if(comboTipo.getSelectedItem().equals("-Seleccionar-")){//evalua
                JOptionPane.showMessageDialog(null, "No ha seleccionado Tipo de queja");
            }else{
                tipo=(String)comboTipo.getSelectedItem();//toma los valore de un combo
            }
            if(comboQueja.getSelectedItem().equals("-Seleccionar-")){//evalua
                JOptionPane.showMessageDialog(null, "No ha seleccionado el estado de la queja");
            }else{
                queja=(String)comboQueja.getSelectedItem();//toma los valore de un combo
            }
            if(tipo.equals("Sugerencia")){//evalua
                id_tipo=2;
            }else if(tipo.equals("Queja")){
                id_tipo=1;//toma el dato segun la condicion
            }
            if(queja.equals("Urgencia")){
                id_queja=2;
                //System.out.println(id_queja);
            }else if(queja.equals("En espera")){
                id_queja=1;//toma el dato segun la condicion
                //System.out.println(id_queja);
            }
            estado="activo";//variable con asignacion de valor
            //inserta datos en cierta tabla de la base de datos
            //toma los valore
            String Query = ("INSERT INTO incidencias (id_tipo_incidencia,nombre_cliente, direccion_cliente,edad_cliente,telefono_cliente,descripcion_cliente,id_gestor,id_tipo_estado,estado) "
                    + "VALUES ('" + id_tipo + "','" + nombre + "','" + direccion + "','" + edad + "','" + telefono + "','" + descripcion + "','" + nombreRegistro + "','" + id_queja + "','" + estado + "')");

            Statement st = (Statement) reg.createStatement();
            st.executeUpdate(Query);//los inserta
            JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");//cuadro de mensaje
            //limpia los campos
            txtNombre.setText("");
            txtDireccion.setText("");
            txtEdad.setText("");
            txtTelefono.setText("");
            txtDescripcion.setText("");
            comboTipo.setSelectedItem("-Seleccionar-");
            comboQueja.setSelectedItem("-Seleccionar-");
            ////////////////////////////////// registro de movimiento
            String movimiento= ("INSERT INTO movimiento_gestor (id_tipo_movimiento, id_gestor) "
                     + "VALUES ('" + tipo_movimiento + "','" + usuario + "')");
            Statement stt = (Statement) reg.createStatement();
            stt.executeUpdate(movimiento);//inserta los valores recopilados
            System.out.println("Registro de movimiento ");
            //////////////////////////////////////////////////////////
        //excepciones: errores que el ususario puede cometer como dejar un campo vacio
        }catch(NumberFormatException err){
            System.out.print("Error: "+err);
            JOptionPane.showMessageDialog(null, "Se registro algun dato erroneo");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos \n"+ex);
        }catch(MiExcepcion mexc){
            txtEdad.setText("");
        }catch(MiExcepcion1 mexc1){
            txtTelefono.setText("");
        }catch(MiExcepcion2 mexc2){
        }catch(MiExcepcion3 mexc3){
        }catch(NullPointerException e){
        }catch(ExcepcionRegistro ex3){
        }finally{
            con.desconectar();//desconecta a la base de datos
        }  

        //JOptionPane.showMessageDialog(null, "Se registro con exito");
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //cuando se oprime el boton hace lo siguiente:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGestor(nombre1,usuario).setVisible(true);//llama al frame
            }
        });
        this.setVisible(false);//hace "invisible una ventana
    }//GEN-LAST:event_btnSalirActionPerformed
    //evaluar los datos mandados
    private void llamada1(String telefono) throws MiExcepcion1,ExcepcionRegistro{
        int cont=0;
        String aux_telefono;
        aux_telefono=telefono;
        char[] arrayChar = aux_telefono.toCharArray();
	for(int i=0; i<arrayChar.length; i++){
            cont++;	
        }
        if(cont!=6){//detectar que sean 6 numeros
            throw new MiExcepcion1();
        }
        
    }
    private void llamada(int edad) throws MiExcepcion,ExcepcionRegistro{
        String edad_aux;
        int cont=0;
        edad_aux=Integer.toString(edad);
        char[] arrayChar = edad_aux.toCharArray();
	for(int i=0; i<arrayChar.length; i++){
            cont++;
        }
        if((cont<=1)||(cont>=3)){//que tenga dos digitos
            throw new MiExcepcion();
        }
        if(edad_aux.startsWith("-")){//que no sea una edad negativa
            throw new MiExcepcion();
        }

        //txtEdad.setText("");
    }
    private void llamada2(String nombre) throws MiExcepcion2,ExcepcionRegistro{
        boolean bandera=false;
        if(nombre.equals("")){
            throw new MiExcepcion2();
        }
        for(int i=0; i<nombre.length();i++){
            if(nombre.charAt(i)==' '){//que no tenga espacios solamente
                bandera=true;
            }else{
                bandera=false;
                break;
            }
        }
        if(bandera==true){
            throw new ExcepcionRegistro(1);
        }
        if(!nombre.matches("^[A-Za-z\\s]*$")){//sean solo letras
             throw new ExcepcionRegistro(2);
         }
    }
    private void llamada3(String direccion) throws MiExcepcion3,ExcepcionRegistro{
        boolean bandera=false;
        if(direccion.equals("")){
            throw new MiExcepcion3();
        }
        for(int i=0; i<direccion.length();i++){
            if(direccion.charAt(i)==' '){
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

        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alta().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboQueja;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtGes;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
