package proyecto.progra.pkg17.pkg5.pkg19;

import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;
//import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class Grafico1 extends javax.swing.JFrame {
    Conexion con;
    int tgestor=2;
    String [] arreglo;
    String auxiliar;
    int []contador;
    int cont=0,aux=0,aux2;
    public Grafico1() {
        
        initComponents();
        obtener();
    }
    public void obtener(){
        con=new Conexion();
        Connection reg=con.getConnection();
        try{    
            ResultSet rsu= Conexion.getTabla("select * FROM usuarios where id_tipo_usuario='"+tgestor+"'");
            while (rsu.next()) {
                aux++;
            }
            System.out.println(aux);
            arreglo = new String[aux];
            ResultSet rs = Conexion.getTabla("select * FROM usuarios where id_tipo_usuario='"+tgestor+"'");
            while (rs.next()) {
                arreglo[cont]=rs.getString("id_usuario");
                cont++;
            }
            for(int i=0;i<aux;i++){
                auxiliar="";
                aux2=0;
                auxiliar=arreglo[i];
                ResultSet u= Conexion.getTabla("select * FROM usuarios where id_tipo_usuario='"+auxiliar+"'");
                while (u.next()) {
                    aux2++;
                    
                }
                System.out.println("\n"+u+"\n"+auxiliar+"\t"+aux2);
            }
            
        }catch(ArrayIndexOutOfBoundsException e){
        }catch(SQLException ex){}
        con.desconectar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafico1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
