
package src;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author alvaro
 */
public class GUI extends javax.swing.JFrame {


    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        BotonEnviar = new javax.swing.JButton();
        CampoTexto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonEnviar.setText("Enviar");
        BotonEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonEnviarMouseClicked(evt);
            }
        });

        jLabel1.setText("Introducir valores:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CampoTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonEnviar)
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonEnviar))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static final String preguntarRutaFichero() {
        // Solicitar nombre del documento en el que guardar los datos
        JFileChooser jfilechoser = new JFileChooser();
        int resultado = jfilechoser.showOpenDialog(null);
        // Si se seleccionó un fichero
        String fichero = null;
        if (resultado == JFileChooser.APPROVE_OPTION) {
            // recogemos el nombre del archivo
            fichero = jfilechoser.getSelectedFile().getPath();
            // En caso de producirse en error en el cuadro de selección de fichero lo mostramos
        }
        return fichero;
    }

    private void BotonEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEnviarMouseClicked

        String fichero = preguntarRutaFichero();
        if (fichero != null) {
            boolean guardadoCorrecto = Main.onClickSave(CampoTexto.getText(), fichero);
            if (guardadoCorrecto) {
                JOptionPane.showMessageDialog(null, "Los datos se han guardado", "Aplicación", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrió un error durante el guardado en el archivo", "Aplicación", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_BotonEnviarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEnviar;
    private javax.swing.JTextField CampoTexto;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
