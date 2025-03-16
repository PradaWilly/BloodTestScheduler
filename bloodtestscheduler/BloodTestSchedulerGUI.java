/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bloodtestscheduler;

import java.util.ArrayList;

/**
 *
 * @author Cosmin
 */
public class BloodTestSchedulerGUI extends javax.swing.JFrame {

    private MyStack noShowStack;  //stack for no shows


    public BloodTestSchedulerGUI() {
        initComponents();

        //initialize
        noShowStack = new MyStack();



        //no shows
        noShowStack.push(new Patient("fgdg dfgsf", "2", 50, "gdfgdn", false));
        noShowStack.push(new Patient("hngfhd", "3", 35, "hfgDk", true));
        noShowStack.push(new Patient("hdfgdf", "2", 50, "jgfghf", false));
        noShowStack.push(new Patient("ngfdd", "3", 35, "jgfjhf", true));
        noShowStack.push(new Patient("bgnfdbfd", "2", 50, "jghhfg", false));
        noShowStack.push(new Patient("gfdgdf", "3", 35, "jjgghf", true));
        noShowStack.push(new Patient("gfdgdf", "2", 50, "gfdgdfs", false));
        noShowStack.push(new Patient("hfgd", "3", 35, "vdssdv", true));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dspNoShowBtn = new javax.swing.JButton();
        dspPatientList = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        noShowTA = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        patientTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dspNoShowBtn.setText("Display No-Shows");
        dspNoShowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dspNoShowBtnActionPerformed(evt);
            }
        });

        dspPatientList.setText("Display Patients");
        dspPatientList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dspPatientListActionPerformed(evt);
            }
        });

        noShowTA.setColumns(20);
        noShowTA.setRows(5);
        jScrollPane1.setViewportView(noShowTA);

        patientTA.setColumns(20);
        patientTA.setRows(5);
        jScrollPane2.setViewportView(patientTA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dspPatientList)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dspNoShowBtn))
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dspPatientList)
                    .addComponent(dspNoShowBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dspNoShowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dspNoShowBtnActionPerformed

        //clear ta
        noShowTA.setText("");

        //get the last 5 no shows
        ArrayList<Patient> lastFiveNoShows = noShowStack.getLastFiveNoShows();

        //display no shows
        for (Patient patient : lastFiveNoShows) {
            noShowTA.append("Name: " + patient.getName() + ", Priority: \"" + patient.getPriority() + "\"\n");
        }

    }//GEN-LAST:event_dspNoShowBtnActionPerformed

    private void dspPatientListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dspPatientListActionPerformed


    }//GEN-LAST:event_dspPatientListActionPerformed

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
            java.util.logging.Logger.getLogger(BloodTestSchedulerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BloodTestSchedulerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BloodTestSchedulerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BloodTestSchedulerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BloodTestSchedulerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dspNoShowBtn;
    private javax.swing.JButton dspPatientList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea noShowTA;
    private javax.swing.JTextArea patientTA;
    // End of variables declaration//GEN-END:variables
}
