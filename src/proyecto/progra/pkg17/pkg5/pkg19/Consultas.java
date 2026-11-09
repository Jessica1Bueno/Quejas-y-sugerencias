package proyecto.progra.pkg17.pkg5.pkg19;
//importaciones de librerias que utilizamos en todo el código
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Consultas extends javax.swing.JFrame {
    //definicion de variables
    Conexion con;
    int id,tipo,edad,estado,queja;
    String nombre, direccion,telefono,gestor,fecha,tipo_aux,estado_aux,queja_aux,usuario="",nombre1="";
    DefaultTableModel modelo = new DefaultTableModel();
    String  [] arreglo;
    String est="activo";
    int aux=0,cont=0,tgestor=2,tipo_movimiento=4;
    public Consultas(String nombre1,String usuario) {//constructor con variables mandadas
        this.nombre1=nombre1;//toma los valores de las variables mandadas
        this.usuario=usuario;
        con=new Conexion();//crea conexion
        com.mysql.jdbc.Connection reg=con.getConnection();
        try{    
            //selecciona segun lo que se pide
            ResultSet rsu= Conexion.getTabla("select * FROM usuarios where id_tipo_usuario='"+tgestor+"'");
            while (rsu.next()) {
                aux++;//aumenta el contador auxiliar
            }
            //System.out.println(aux);
            arreglo = new String[aux];//definicion de tamaño de arreglo
            //toma valores de BD
            ResultSet rs = Conexion.getTabla("select * FROM usuarios where id_tipo_usuario='"+tgestor+"'");
            while (rs.next()) {
                        // añade los resultado a al modelo de tabla
                arreglo[cont]=rs.getString("id_usuario");//se guarda daos en arreglo de BD
                cont++;//aumenta contador
            }
        //errores posibles
        }catch(ArrayIndexOutOfBoundsException e){
        }catch(SQLException ex){}
        con.desconectar();//desconecta
        initComponents();
        this.setTitle("Consulta de registro");//titulo
        this.setLocationRelativeTo(null);//muestra la pantalla en el centro
        this.setResizable(false);//no se mueve el tamaño del frame
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        ID = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarId = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tid = new javax.swing.JTable();
        txtId = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        Tipo = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        ComboTipo = new javax.swing.JComboBox<>();
        btnBuscarTipo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Ttipo = new javax.swing.JTable();
        btnSalir1 = new javax.swing.JButton();
        Nombre = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnBuscarNombre = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tnombre = new javax.swing.JTable();
        txtNombre = new javax.swing.JTextField();
        btnSalir2 = new javax.swing.JButton();
        Direccion = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnBuscarDireccion = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tdireccion = new javax.swing.JTable();
        txtDireccion = new javax.swing.JTextField();
        btnSalir3 = new javax.swing.JButton();
        Edad = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnBuscarEdad = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        Tedad = new javax.swing.JTable();
        txtEdad = new javax.swing.JTextField();
        btnSalir4 = new javax.swing.JButton();
        Telefono = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnBuscarTelefono = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        Ttelefono = new javax.swing.JTable();
        txtTelefono = new javax.swing.JTextField();
        btnSalir5 = new javax.swing.JButton();
        Gestor = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnBuscarGestor = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        Tgestor = new javax.swing.JTable();
        jcGestor = new javax.swing.JComboBox<>();
        btnSalir6 = new javax.swing.JButton();
        Estado = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        ComboEstado = new javax.swing.JComboBox<>();
        btnBuscarEstado = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        Testado = new javax.swing.JTable();
        btnSalir7 = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jLabel1.setText("Ingresa el ID a buscar:");

        btnBuscarId.setText("Buscar");
        btnBuscarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIdActionPerformed(evt);
            }
        });

        Tid.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Tid);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IDLayout = new javax.swing.GroupLayout(ID);
        ID.setLayout(IDLayout);
        IDLayout.setHorizontalGroup(
            IDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(IDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                    .addGroup(IDLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnBuscarId)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(IDLayout.createSequentialGroup()
                .addGap(372, 372, 372)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        IDLayout.setVerticalGroup(
            IDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IDLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(IDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBuscarId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ID", ID);

        jLabel7.setText("Selecciona el tipo de incidencia:");

        ComboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sugerencia", "Queja"}));

        btnBuscarTipo.setText("Buscar");
        btnBuscarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTipoActionPerformed(evt);
            }
        });

        Ttipo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(Ttipo);

        btnSalir1.setText("Salir");
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TipoLayout = new javax.swing.GroupLayout(Tipo);
        Tipo.setLayout(TipoLayout);
        TipoLayout.setHorizontalGroup(
            TipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TipoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                    .addGroup(TipoLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(ComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnBuscarTipo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(TipoLayout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(btnSalir1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TipoLayout.setVerticalGroup(
            TipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TipoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(TipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarTipo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tipo Incidencia", Tipo);

        jLabel2.setText("Ingresa el nombre a buscar:");

        btnBuscarNombre.setText("Buscar");
        btnBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarNombreActionPerformed(evt);
            }
        });

        Tnombre.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(Tnombre);

        btnSalir2.setText("Salir");
        btnSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NombreLayout = new javax.swing.GroupLayout(Nombre);
        Nombre.setLayout(NombreLayout);
        NombreLayout.setHorizontalGroup(
            NombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NombreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                    .addGroup(NombreLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarNombre)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(NombreLayout.createSequentialGroup()
                .addGap(403, 403, 403)
                .addComponent(btnSalir2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NombreLayout.setVerticalGroup(
            NombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NombreLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(NombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnBuscarNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnSalir2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Nombre", Nombre);

        jLabel3.setText("Ingresa la Dirección a buscar:");

        btnBuscarDireccion.setText("Buscar");
        btnBuscarDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDireccionActionPerformed(evt);
            }
        });

        Tdireccion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(Tdireccion);

        btnSalir3.setText("Salir");
        btnSalir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DireccionLayout = new javax.swing.GroupLayout(Direccion);
        Direccion.setLayout(DireccionLayout);
        DireccionLayout.setHorizontalGroup(
            DireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DireccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                    .addGroup(DireccionLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarDireccion)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(DireccionLayout.createSequentialGroup()
                .addGap(398, 398, 398)
                .addComponent(btnSalir3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DireccionLayout.setVerticalGroup(
            DireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DireccionLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(DireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnBuscarDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir3)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dirección", Direccion);

        jLabel4.setText("Ingresa la Edad a buscar:");

        btnBuscarEdad.setText("Buscar");
        btnBuscarEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEdadActionPerformed(evt);
            }
        });

        Tedad.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(Tedad);

        btnSalir4.setText("Salir");
        btnSalir4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EdadLayout = new javax.swing.GroupLayout(Edad);
        Edad.setLayout(EdadLayout);
        EdadLayout.setHorizontalGroup(
            EdadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EdadLayout.createSequentialGroup()
                .addGroup(EdadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
                    .addGroup(EdadLayout.createSequentialGroup()
                        .addGroup(EdadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EdadLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarEdad))
                            .addGroup(EdadLayout.createSequentialGroup()
                                .addGap(364, 364, 364)
                                .addComponent(btnSalir4)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        EdadLayout.setVerticalGroup(
            EdadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EdadLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(EdadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnBuscarEdad)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir4)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Edad", Edad);

        jLabel5.setText("Ingresa el Teléfono a buscar:");

        btnBuscarTelefono.setText("Buscar");
        btnBuscarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTelefonoActionPerformed(evt);
            }
        });

        Ttelefono.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(Ttelefono);

        btnSalir5.setText("Salir");
        btnSalir5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TelefonoLayout = new javax.swing.GroupLayout(Telefono);
        Telefono.setLayout(TelefonoLayout);
        TelefonoLayout.setHorizontalGroup(
            TelefonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelefonoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelefonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                    .addGroup(TelefonoLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarTelefono)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(TelefonoLayout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addComponent(btnSalir5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TelefonoLayout.setVerticalGroup(
            TelefonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelefonoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(TelefonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btnBuscarTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir5)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Teléfono", Telefono);

        jLabel6.setText("Ingrese el gestor a buscar:");

        btnBuscarGestor.setText("Buscar");
        btnBuscarGestor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarGestorActionPerformed(evt);
            }
        });

        Tgestor.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(Tgestor);

        jcGestor.setModel(new javax.swing.DefaultComboBoxModel(arreglo));

        btnSalir6.setText("Salir");
        btnSalir6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GestorLayout = new javax.swing.GroupLayout(Gestor);
        Gestor.setLayout(GestorLayout);
        GestorLayout.setHorizontalGroup(
            GestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GestorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                    .addGroup(GestorLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(37, 37, 37)
                        .addComponent(jcGestor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(btnBuscarGestor)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(GestorLayout.createSequentialGroup()
                .addGap(385, 385, 385)
                .addComponent(btnSalir6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        GestorLayout.setVerticalGroup(
            GestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GestorLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(GestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnBuscarGestor)
                    .addComponent(jcGestor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir6)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Gestor", Gestor);

        jLabel8.setText("Selecciona el estado a buscar:");

        ComboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Urgencia", "En espera"}));

        btnBuscarEstado.setText("Buscar");
        btnBuscarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEstadoActionPerformed(evt);
            }
        });

        Testado.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane8.setViewportView(Testado);

        btnSalir7.setText("Salir");
        btnSalir7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EstadoLayout = new javax.swing.GroupLayout(Estado);
        Estado.setLayout(EstadoLayout);
        EstadoLayout.setHorizontalGroup(
            EstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                    .addGroup(EstadoLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(ComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarEstado)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(EstadoLayout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addComponent(btnSalir7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EstadoLayout.setVerticalGroup(
            EstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstadoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(EstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir7)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Estado", Estado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIdActionPerformed
        //cuando se oprime el boton hace lo siguiente:
        try{
            modelo.setRowCount(0);//limpia la tabla
            con=new Conexion();//crea conexion
            Connection reg=con.getConnection();
            id=Integer.parseInt(txtId.getText());//toma valor en una variable
            //toma valores de tabla de bd
            ResultSet rs = Conexion.getTabla("select * from incidencias where id_incidencia='"+id+"' AND estado='"+est+"'");
            modelo.setColumnIdentifiers(new Object[]{"Id", "Tipo","Nombre cliente","Dirección cliente","Edad cliente","Teléfono cliente","Descripción","Nombre gestor","Queja","Estado","Fecha"});
            try {
                while (rs.next()) {
                tipo=rs.getInt("id_tipo_incidencia");
                if(tipo==1){//evalua
                   tipo_aux="Queja"; 
                }else if(tipo==2){
                   tipo_aux="Sugerencia"; //toma valor segun lo evaluado
                }
                queja=rs.getInt("id_tipo_estado");
                if(queja==1){
                   queja_aux="En espera"; 
                }else if(queja==2){
                   queja_aux="Urgencia"; 
                }
                // añade los resultado a al modelo de tabla
                modelo.addRow(new Object[]{rs.getInt("id_incidencia"), tipo_aux, rs.getString("nombre_cliente"), rs.getString("direccion_cliente"), rs.getInt("edad_cliente"), rs.getString("telefono_cliente"), rs.getString("descripcion_cliente"),rs.getString("id_gestor"),queja_aux,rs.getString("estado"),rs.getTimestamp("fecha")});
                }            
                // asigna el modelo a la tabla
                Tid.setModel(modelo);
                ////////////////////////////////// registro de movimiento
                String movimiento= ("INSERT INTO movimiento_gestor (id_tipo_movimiento, id_gestor) "
                         + "VALUES ('" + tipo_movimiento + "','" + usuario + "')");
                Statement stt = (Statement) reg.createStatement();
                stt.executeUpdate(movimiento);
                System.out.println("Registro de movimiento ");
                //////////////////////////////////////////////////////////
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No hay conexión a la base de datos "+e);
            }
            txtId.setText(""); //limpia el campo
        }catch(NumberFormatException err){
            System.out.print("Erro: "+err);//imprime el error en consola
            txtId.setText("");//limpia el campo
        }
        con.desconectar();
    }//GEN-LAST:event_btnBuscarIdActionPerformed

    private void btnBuscarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTipoActionPerformed
        modelo.setRowCount(0);//limpia la tabla
        con=new Conexion();//crea conxion
        Connection reg=con.getConnection();
        tipo_aux=(String)ComboTipo.getSelectedItem();
        if(tipo_aux.equals("Sugerencia")){
            tipo=2;
        }else if(tipo_aux.equals("Queja")){
            tipo=1;
        }
        //JOptionPane.showMessageDialog(null, tipo);
        ResultSet rs = Conexion.getTabla("select * from incidencias where id_tipo_incidencia='"+tipo+"' AND estado='"+est+"'");
        modelo.setColumnIdentifiers(new Object[]{"Id", "Tipo","Nombre cliente","Dirección cliente","Edad cliente","Teléfono cliente","Descripción","Nombre gestor","Queja","Estado","Fecha"});
        try {
            while (rs.next()) {
                tipo=rs.getInt("id_tipo_incidencia");
                if(tipo==1){//evalua una variable
                   tipo_aux="Queja"; 
                }else if(tipo==2){
                   tipo_aux="Sugerencia"; 
                }
                queja=rs.getInt("id_tipo_estado");
                if(queja==1){//evalua una variable
                   queja_aux="En espera"; 
                }else if(queja==2){
                   queja_aux="Urgencia"; 
                }
                // añade los resultado a al modelo de tabla
                modelo.addRow(new Object[]{rs.getInt("id_incidencia"), tipo_aux, rs.getString("nombre_cliente"), rs.getString("direccion_cliente"), rs.getInt("edad_cliente"), rs.getString("telefono_cliente"), rs.getString("descripcion_cliente"),rs.getString("id_gestor"),queja_aux,rs.getString("estado"),rs.getTimestamp("fecha")});
            }            
            // asigna el modelo a la tabla
            Ttipo.setModel(modelo);
            ////////////////////////////////// registro de movimiento
            String movimiento= ("INSERT INTO movimiento_gestor (id_tipo_movimiento, id_gestor) "
                     + "VALUES ('" + tipo_movimiento + "','" + usuario + "')");
            Statement stt = (Statement) reg.createStatement();
            stt.executeUpdate(movimiento);
            System.out.println("Registro de movimiento ");
            //////////////////////////////////////////////////////////
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No hay conexión a la base de datos "+e);
        }
        con.desconectar();
    }//GEN-LAST:event_btnBuscarTipoActionPerformed

    private void btnBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarNombreActionPerformed
        try{
            modelo.setRowCount(0);
            con=new Conexion();//crea conxion
            Connection reg=con.getConnection();
            nombre=txtNombre.getText();
            //JOptionPane.showMessageDialog(null, tipo);
            ResultSet rs = Conexion.getTabla("select * from incidencias where nombre_cliente='"+nombre+"' AND estado='"+est+"'");
            modelo.setColumnIdentifiers(new Object[]{"Id", "Tipo","Nombre cliente","Dirección cliente","Edad cliente","Teléfono cliente","Descripción","Nombre gestor","Queja","Estado","Fecha"});
            try {
                while (rs.next()) {
                    tipo=rs.getInt("id_tipo_incidencia");
                if(tipo==1){
                   tipo_aux="Queja"; 
                }else if(tipo==2){//evalua una variable
                   tipo_aux="Sugerencia"; 
                }
                queja=rs.getInt("id_tipo_estado");
                if(queja==1){//evalua una variable
                   queja_aux="En espera"; 
                }else if(queja==2){
                   queja_aux="Urgencia"; 
                }
                // añade los resultado a al modelo de tabla
                modelo.addRow(new Object[]{rs.getInt("id_incidencia"), tipo_aux, rs.getString("nombre_cliente"), rs.getString("direccion_cliente"), rs.getInt("edad_cliente"), rs.getString("telefono_cliente"), rs.getString("descripcion_cliente"),rs.getString("id_gestor"),queja_aux,rs.getString("estado"),rs.getTimestamp("fecha")});
                }            
                // asigna el modelo a la tabla
                Tnombre.setModel(modelo);
                ////////////////////////////////// registro de movimiento
                String movimiento= ("INSERT INTO movimiento_gestor (id_tipo_movimiento, id_gestor) "
                         + "VALUES ('" + tipo_movimiento + "','" + usuario + "')");
                Statement stt = (Statement) reg.createStatement();
                stt.executeUpdate(movimiento);
                System.out.println("Registro de movimiento ");
                //////////////////////////////////////////////////////////
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No hay conexión a la base de datos "+e);
            }
            txtNombre.setText("");//limpia campo
        }catch(NumberFormatException err){
            System.out.println("Erro: "+err);
        }
        con.desconectar();//desconecta bd
    }//GEN-LAST:event_btnBuscarNombreActionPerformed

    private void btnBuscarDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDireccionActionPerformed
        modelo.setRowCount(0);//limpia la tabla
        con=new Conexion();//crea conxion
        Connection reg=con.getConnection();
        direccion=txtDireccion.getText();
        //JOptionPane.showMessageDialog(null, tipo);
        ResultSet rs = Conexion.getTabla("select * from incidencias where direccion_cliente='"+direccion+"' AND estado='"+est+"'");
        modelo.setColumnIdentifiers(new Object[]{"Id", "Tipo","Nombre cliente","Dirección cliente","Edad cliente","Teléfono cliente","Descripción","Nombre gestor","Queja","Estado","Fecha"});
        try {
            while (rs.next()) {
                tipo=rs.getInt("id_tipo_incidencia");
                if(tipo==1){
                   tipo_aux="Queja"; 
                }else if(tipo==2){
                   tipo_aux="Sugerencia"; //toma varibale
                }
                queja=rs.getInt("id_tipo_estado");
                if(queja==1){
                   queja_aux="En espera"; 
                }else if(queja==2){//evalua una variable
                   queja_aux="Urgencia"; 
                }
                // añade los resultado a al modelo de tabla
                modelo.addRow(new Object[]{rs.getInt("id_incidencia"), tipo_aux, rs.getString("nombre_cliente"), rs.getString("direccion_cliente"), rs.getInt("edad_cliente"), rs.getString("telefono_cliente"), rs.getString("descripcion_cliente"),rs.getString("id_gestor"),queja_aux,rs.getString("estado"),rs.getTimestamp("fecha")});
            }            
            // asigna el modelo a la tabla
            Tdireccion.setModel(modelo); 
            ////////////////////////////////// registro de movimiento
            String movimiento= ("INSERT INTO movimiento_gestor (id_tipo_movimiento, id_gestor) "
                     + "VALUES ('" + tipo_movimiento + "','" + usuario + "')");
            Statement stt = (Statement) reg.createStatement();
            stt.executeUpdate(movimiento);
            System.out.println("Registro de movimiento ");
            //////////////////////////////////////////////////////////
        } catch (SQLException e) {//mensaje de error
            JOptionPane.showMessageDialog(null, "No hay conexión a la base de datos "+e);
        }
        txtDireccion.setText("");
        con.desconectar();//desconecta de bd
    }//GEN-LAST:event_btnBuscarDireccionActionPerformed

    private void btnBuscarEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEdadActionPerformed
        try{
            modelo.setRowCount(0);
            con=new Conexion();//crea conxion
            Connection reg=con.getConnection();
            edad=Integer.parseInt(txtEdad.getText());//caste, cambio de int a string
            //JOptionPane.showMessageDialog(null, tipo);
            ResultSet rs = Conexion.getTabla("select * from incidencias where edad_cliente='"+edad+"' AND estado='"+est+"'");
            modelo.setColumnIdentifiers(new Object[]{"Id", "Tipo","Nombre cliente","Dirección cliente","Edad cliente","Teléfono cliente","Descripción","Nombre gestor","Queja","Estado","Fecha"});
            try {
                llamada(edad);//evalua variable en el metodo llamado
                while (rs.next()) {
                    tipo=rs.getInt("id_tipo_incidencia");
                if(tipo==1){
                   tipo_aux="Queja"; //toma valor
                }else if(tipo==2){//evalua una variable
                   tipo_aux="Sugerencia"; 
                }
                queja=rs.getInt("id_tipo_estado");
                if(queja==1){//evalua una variable
                   queja_aux="En espera"; 
                }else if(queja==2){
                   queja_aux="Urgencia"; //toma valor
                }
                // añade los resultado a al modelo de tabla
                modelo.addRow(new Object[]{rs.getInt("id_incidencia"), tipo_aux, rs.getString("nombre_cliente"), rs.getString("direccion_cliente"), rs.getInt("edad_cliente"), rs.getString("telefono_cliente"), rs.getString("descripcion_cliente"),rs.getString("id_gestor"),queja_aux,rs.getString("estado"),rs.getTimestamp("fecha")});
                }            
                // asigna el modelo a la tabla
                Tedad.setModel(modelo);
                ////////////////////////////////// registro de movimiento
                String movimiento= ("INSERT INTO movimiento_gestor (id_tipo_movimiento, id_gestor) "
                         + "VALUES ('" + tipo_movimiento + "','" + usuario + "')");
                Statement stt = (Statement) reg.createStatement();
                stt.executeUpdate(movimiento);
                System.out.println("Registro de movimiento ");
                //////////////////////////////////////////////////////////
            }catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "No hay conexión a la base de datos "+e);
            }catch(MiExcepcion e1){  
            }
        }catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null, "Error de ingreso");//mensaje de error
        }finally{
            txtEdad.setText("");//limpia campo
        }
        
        con.desconectar();

    }//GEN-LAST:event_btnBuscarEdadActionPerformed
    //evalua los campos necesarios
    private void llamada(int edad) throws MiExcepcion{
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
        txtEdad.setText("");//limpia el campo
    }
    private void btnBuscarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTelefonoActionPerformed
     try{
            modelo.setRowCount(0);
            con=new Conexion();//crea conxion
            Connection reg=con.getConnection();
            telefono=txtTelefono.getText();
            //JOptionPane.showMessageDialog(null, tipo);
            ResultSet rs = Conexion.getTabla("select * from incidencias where telefono_cliente='"+telefono+"' AND estado='"+est+"'");
            modelo.setColumnIdentifiers(new Object[]{"Id", "Tipo","Nombre cliente","Dirección cliente","Edad cliente","Teléfono cliente","Descripción","Nombre gestor","Queja","Estado","Fecha"});
            try {
                llamada1(telefono);//llama a un metodo y lleva variable a evaluar
                while (rs.next()) {
                    tipo=rs.getInt("id_tipo_incidencia");
                if(tipo==1){//evalua una variable
                   tipo_aux="Queja"; 
                }else if(tipo==2){
                   tipo_aux="Sugerencia"; //toma valor segun lo evaluado
                }
                queja=rs.getInt("id_tipo_estado");
                if(queja==1){
                   queja_aux="En espera"; 
                }else if(queja==2){//evalua una variable
                   queja_aux="Urgencia"; 
                }
                // añade los resultado a al modelo de tabla
                modelo.addRow(new Object[]{rs.getInt("id_incidencia"), tipo_aux, rs.getString("nombre_cliente"), rs.getString("direccion_cliente"), rs.getInt("edad_cliente"), rs.getString("telefono_cliente"), rs.getString("descripcion_cliente"),rs.getString("id_gestor"),queja_aux,rs.getString("estado"),rs.getTimestamp("fecha")});
                }            
                // asigna el modelo a la tabla
                Ttelefono.setModel(modelo); 
                ////////////////////////////////// registro de movimiento
                String movimiento= ("INSERT INTO movimiento_gestor (id_tipo_movimiento, id_gestor) "
                         + "VALUES ('" + tipo_movimiento + "','" + usuario + "')");
                Statement stt = (Statement) reg.createStatement();
                stt.executeUpdate(movimiento);
                System.out.println("Registro de movimiento ");
                //////////////////////////////////////////////////////////
            }catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "No hay conexión a la base de datos "+e);
            }catch(MiExcepcion1 e1){  
            }
        }finally{
            txtTelefono.setText("");//limpia campo
        }
    }//GEN-LAST:event_btnBuscarTelefonoActionPerformed
    private void llamada1(String telefono) throws MiExcepcion1{
        //definicion de variables
        int cont=0;
        String aux_telefono;
        aux_telefono=telefono;
        char[] arrayChar = aux_telefono.toCharArray();//convierte a arreglos de caracteres
	for(int i=0; i<arrayChar.length; i++){
            cont++;	
        }
        if(cont!=6){
            throw new MiExcepcion1();
        }
        txtTelefono.setText("");//limpia campo
        con.desconectar();
    }
    private void btnBuscarGestorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarGestorActionPerformed
        modelo.setRowCount(0);//limpia la tabla
        con=new Conexion();//crea conxion
        Connection reg=con.getConnection();
        gestor=(String)jcGestor.getSelectedItem();//variable toma el valor
        //JOptionPane.showMessageDialog(null, tipo);
        ResultSet rs = Conexion.getTabla("select * from incidencias where id_gestor='"+gestor+"' AND estado='"+est+"'");
        modelo.setColumnIdentifiers(new Object[]{"Id", "Tipo","Nombre cliente","Dirección cliente","Edad cliente","Teléfono cliente","Descripción","Nombre gestor","Queja","Estado","Fecha"});
        try {
            while (rs.next()) {
                tipo=rs.getInt("id_tipo_incidencia");
                if(tipo==1){///evalua una variable
                   tipo_aux="Queja"; 
                }else if(tipo==2){
                   tipo_aux="Sugerencia"; 
                }
                queja=rs.getInt("id_tipo_estado");
                if(queja==1){
                   queja_aux="En espera"; 
                }else if(queja==2){//evalua una variable
                   queja_aux="Urgencia"; 
                }
                // añade los resultado a al modelo de tabla
                modelo.addRow(new Object[]{rs.getInt("id_incidencia"), tipo_aux, rs.getString("nombre_cliente"), rs.getString("direccion_cliente"), rs.getInt("edad_cliente"), rs.getString("telefono_cliente"), rs.getString("descripcion_cliente"),rs.getString("id_gestor"),queja_aux,rs.getString("estado"),rs.getTimestamp("fecha")});
            }            
            // asigna el modelo a la tabla
            Tgestor.setModel(modelo);  
            ////////////////////////////////// registro de movimiento
            String movimiento= ("INSERT INTO movimiento_gestor (id_tipo_movimiento, id_gestor) "
                    + "VALUES ('" + tipo_movimiento + "','" + usuario + "')");
            Statement stt = (Statement) reg.createStatement();
            stt.executeUpdate(movimiento);
            System.out.println("Registro de movimiento ");
            //////////////////////////////////////////////////////////
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No hay conexión a la base de datos "+e);
        }
        con.desconectar();
    }//GEN-LAST:event_btnBuscarGestorActionPerformed

    private void btnBuscarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEstadoActionPerformed
        modelo.setRowCount(0);//limpia la tabla
        con=new Conexion();
        Connection reg=con.getConnection();//crea conxion
        estado_aux=(String)ComboEstado.getSelectedItem();
        if(estado_aux.equals("Urgente")){
            estado=2;//toma el valor segun lo evaluado
        }else if(estado_aux.equals("En espera")){
            estado=1;
        }
        //JOptionPane.showMessageDialog(null, tipo);
        ResultSet rs = Conexion.getTabla("select * from incidencias where id_tipo_estado='"+estado+"' AND estado='"+est+"'");
        modelo.setColumnIdentifiers(new Object[]{"Id", "Tipo","Nombre cliente","Dirección cliente","Edad cliente","Teléfono cliente","Descripción","Nombre gestor","Queja","Estado","Fecha"});
        try {
            while (rs.next()) {
                tipo=rs.getInt("id_tipo_incidencia");
                if(tipo==1){
                   tipo_aux="Queja"; 
                }else if(tipo==2){
                   tipo_aux="Sugerencia"; //toma el valor segun lo evaluado
                }
                queja = rs.getInt("id_tipo_estado");
                if(queja==1){
                   queja_aux="En espera"; 
                }else if(queja==2){
                   queja_aux="Urgencia"; 
                }
                // añade los resultado a al modelo de tabla
                modelo.addRow(new Object[]{rs.getInt("id_incidencia"), tipo_aux, rs.getString("nombre_cliente"), rs.getString("direccion_cliente"), rs.getInt("edad_cliente"), rs.getString("telefono_cliente"), rs.getString("descripcion_cliente"),rs.getString("id_gestor"),queja_aux,rs.getString("estado"),rs.getTimestamp("fecha")});
            }            
            // asigna el modelo a la tabla
            Testado.setModel(modelo); 
            ////////////////////////////////// registro de movimiento
            String movimiento= ("INSERT INTO movimiento_gestor (id_tipo_movimiento, id_gestor) "
                    + "VALUES ('" + tipo_movimiento + "','" + usuario + "')");
            Statement stt = (Statement) reg.createStatement();
            stt.executeUpdate(movimiento);
            System.out.println("Registro de movimiento ");
            //////////////////////////////////////////////////////////
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No hay conexión a la base de datos "+e);
        }
        con.desconectar();
    }//GEN-LAST:event_btnBuscarEstadoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       //boton de salida
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGestor(nombre1,usuario).setVisible(true);//llama a otro frame
            }
        });
        this.setVisible(false);//deshabilita esta ventana
        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        //boton de salida
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGestor(nombre1,usuario).setVisible(true);
            }
        });
        this.setVisible(false);//deshabilita la ventana
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void btnSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir2ActionPerformed
        //boton de salida
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGestor(nombre1,usuario).setVisible(true);
            }
        });
        this.setVisible(false);//deshabilita la ventana
    }//GEN-LAST:event_btnSalir2ActionPerformed

    private void btnSalir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir3ActionPerformed
        //boton de salida
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGestor(nombre1,usuario).setVisible(true);
            }
        });
        this.setVisible(false);//deshabilita la ventana
    }//GEN-LAST:event_btnSalir3ActionPerformed

    private void btnSalir4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir4ActionPerformed
        //boton de salida
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGestor(nombre1,usuario).setVisible(true);
            }
        });
        this.setVisible(false);//deshabilita la ventana
    }//GEN-LAST:event_btnSalir4ActionPerformed

    private void btnSalir5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir5ActionPerformed
        //boton de salida
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGestor(nombre1,usuario).setVisible(true);
            }
        });
        this.setVisible(false);//deshabilita la ventana
    }//GEN-LAST:event_btnSalir5ActionPerformed

    private void btnSalir6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir6ActionPerformed
        //boton de salida
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGestor(nombre1,usuario).setVisible(true);
            }
        });
        this.setVisible(false);//deshabilita la ventana
    }//GEN-LAST:event_btnSalir6ActionPerformed

    private void btnSalir7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir7ActionPerformed
        //boton de salida
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGestor(nombre1,usuario).setVisible(true);
            }
        });
        this.setVisible(false);//deshabilita la ventana
    }//GEN-LAST:event_btnSalir7ActionPerformed

    public static void main(String args[]) {
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Baja().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboEstado;
    private javax.swing.JComboBox<String> ComboTipo;
    private javax.swing.JPanel Direccion;
    private javax.swing.JPanel Edad;
    private javax.swing.JPanel Estado;
    private javax.swing.JPanel Gestor;
    private javax.swing.JPanel ID;
    private javax.swing.JPanel Nombre;
    private javax.swing.JTable Tdireccion;
    private javax.swing.JTable Tedad;
    private javax.swing.JPanel Telefono;
    private javax.swing.JTable Testado;
    private javax.swing.JTable Tgestor;
    private javax.swing.JTable Tid;
    private javax.swing.JPanel Tipo;
    private javax.swing.JTable Tnombre;
    private javax.swing.JTable Ttelefono;
    private javax.swing.JTable Ttipo;
    private javax.swing.JButton btnBuscarDireccion;
    private javax.swing.JButton btnBuscarEdad;
    private javax.swing.JButton btnBuscarEstado;
    private javax.swing.JButton btnBuscarGestor;
    private javax.swing.JButton btnBuscarId;
    private javax.swing.JButton btnBuscarNombre;
    private javax.swing.JButton btnBuscarTelefono;
    private javax.swing.JButton btnBuscarTipo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JButton btnSalir2;
    private javax.swing.JButton btnSalir3;
    private javax.swing.JButton btnSalir4;
    private javax.swing.JButton btnSalir5;
    private javax.swing.JButton btnSalir6;
    private javax.swing.JButton btnSalir7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> jcGestor;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
