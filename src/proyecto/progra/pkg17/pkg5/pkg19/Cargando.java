
package proyecto.progra.pkg17.pkg5.pkg19;
//importaciones de librerias que utilizamos en todo el código
import javax.swing.*;
import javax.swing.UIManager.*;

public class Cargando extends javax.swing.JFrame implements Runnable{
    //definicion de variables
    private final Thread hilo;
    private boolean sigue=true;
    private int num=0;
    public Cargando() {//constructor
        try{
            UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");//llama un .jar que da diseño a las ventanas
        }catch(Exception ex){}
        hilo=new Thread(this,"Hilo Barra1");//definicion del Hilo, como se llama
        initComponents();
        lbFoto.setIcon(new javax.swing.ImageIcon("imagenes\\company3.jpg"));//en un label imprime una foto
        this.setTitle("Quejas y Sugerencias");//titulo
        this.setLocationRelativeTo(null);//abre en el centro la ventana
        this.setResizable(false);//no se mueve el tamaño del frame
        hilo.start();//comienza el hilo
    }
    public void run(){
        while(sigue){//mientras no llege al 100 lo va a repetir
            try{
                //if(Thread.currentThread().getName().equals("Hilo Barra1")){
                    Barra.setValue(num);//barra de progreso se va llenando
                    hilo.sleep(500);//tiempo de espera
                    if(num==100){//evalua
                        sigue=false;//cambia el valor de la bandera
                    }else{
                        Barra.setValue(num);
                        num+=10;//aumenta el valor de variable
                    }
                //}
            }catch(InterruptedException e){   
            }
        }
        if(!sigue){//evalua
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Inicio().setVisible(true);//llama a otro frame
                }
            });
            this.setVisible(false);//deshabilita esta ventana
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbFoto = new javax.swing.JLabel();
        Barra = new javax.swing.JProgressBar();

        Barra.setForeground(new java.awt.Color(51, 51, 255));
        Barra.setStringPainted(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(357, Short.MAX_VALUE)
                .addComponent(Barra, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(287, 287, 287))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Barra, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cargando().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Barra;
    private javax.swing.JLabel lbFoto;
    // End of variables declaration//GEN-END:variables
}
