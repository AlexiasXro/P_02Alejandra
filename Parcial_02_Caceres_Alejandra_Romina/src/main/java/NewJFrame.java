


import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;




/**
 *
 * @author Romin
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Listar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jButton1)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jButton1)
                .addContainerGap(215, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                //==ArrayList de profesionales
        ArrayList<Profesional> listProfesionales = new ArrayList<Profesional>();
        
        //==Creo los profesionales
        Profesional p1 = new Profesional(0, "CACERES", "RAMIRO", new Date(),
                        1000221, new TreeMap<Integer,Especialidad>());
        
        Profesional p2 = new Profesional( 191, "BARRIOS", "NICOLAS", new Date(),
                        30100221, new TreeMap<Integer,Especialidad>());
        
        
        //==Agrego Turno a p1 Pediatra
        Paciente paciente1 = new Paciente(505, "GOMEZ", "ROCIO", new Date(),
            32092833, "BARRIO 104 VIVIENDAS", "CEL:15xxxxxx");
        
        Turno t1 = new Turno();
        t1.setFechaTurno(new Date());
        t1.setPaciente(paciente1);
        
        Especialidad esp1 = new Especialidad();
        esp1.setId(1);
        esp1.setNombre("Pediatría");
        
        
        p1.agendarTurno(esp1, t1);
        
        
        //==Agrego Turno a p2 Radiologia
        Paciente paciente2 = new Paciente(8001, "GONZALES", "lUCILA", new Date(),
            33542213, "BARRIO CENTRO", "TEL:451xxxxxx");
        
        Turno t2 = new Turno();
        t2.setFechaTurno(new Date());
        t2.setPaciente(paciente2);
        
        Especialidad esp2 = new Especialidad();
        esp2.setId(2);
        esp2.setNombre("Radiología");
        
        
        p2.agendarTurno(esp2, t2);
        
        
        Paciente paciente3 = new Paciente(7001, "GARCIAS", "MARCELO", new Date(),
            1577883, "BARRIO 1 DE MAYO", "CAL:51xxxxxx");
        
        Turno t3 = new Turno();
        t3.setFechaTurno(new Date());
        t3.setPaciente(paciente3);
        
        p2.agendarTurno(esp2, t3);
        
        
        Paciente paciente4 = new Paciente(8401, "SEGOVIA", "MARIA", new Date(), 
                43909973, "BARRIO KIRCHNER", "CEL:15xxxxxx");
        
        Turno t4 = new Turno();
        t4.setFechaTurno(new Date());
        t4.setPaciente(paciente4);
        
        Especialidad esp3 = new Especialidad();
        esp3.setId(2);
        esp3.setNombre("Radiología");
        
        p1.agendarTurno(esp3, t4);
        
        listProfesionales.add(p1);
        listProfesionales.add(p2);
        
        for(int indexp=0;indexp<listProfesionales.size();indexp++){
            Profesional prof = listProfesionales.get(indexp);
            prof.listarTurnosPorEspecialidad();
        }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
