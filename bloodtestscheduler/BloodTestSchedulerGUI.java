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

    private MyQueue patientQueue; //queue for patients
    private MyStack noShowStack;  //stack for no shows

    
    public BloodTestSchedulerGUI() {
        initComponents();
        
        //initialize 
        patientQueue = new MyQueue();
        noShowStack = new MyStack();
        
        
        //list of patients
        patientQueue.enqueue(1, new Patient("Bob Prizeman", 45, "Dr. Luis", true));
        patientQueue.enqueue(2, new Patient("John Kolarsky", 30, "Dr.Huff", false));
        patientQueue.enqueue(3, new Patient("Scott McQuaid", 25, "Dr.Anakin", true));
        patientQueue.enqueue(1, new Patient("Conor Oneil", 45, "Dr. Conor", true));
        patientQueue.enqueue(2, new Patient("Danny Bogdan", 30, "Dr. O'neil", false));
        patientQueue.enqueue(3, new Patient("Mia Macbeth", 25, "Dr. Pedro", true));
        patientQueue.enqueue(1, new Patient("Filip Hamilton", 45, "Dr. Lois", true));


        //no shows
        noShowStack.push(new Patient("John Smith", 32, "Dr. Martin", false));
        noShowStack.push(new Patient("Emily Davis", 35, "Dr. Linda", true));
        noShowStack.push(new Patient("Michael Johnson", 20, "Dr. Scott", false));
        noShowStack.push(new Patient("Sarah Wilson", 35, "Dr. Abdul", true));
        noShowStack.push(new Patient("David Brown", 50, "Dr. Tom", false));
        noShowStack.push(new Patient("Emma Taylor", 35, "Dr. Ryan", true));
        noShowStack.push(new Patient("James Anderson", 10, "Dr. Hendy", false));
        noShowStack.push(new Patient("Olivia Martinez", 35, "Dr. Tom", true));
;
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
        priorityLbl = new javax.swing.JLabel();
        noShowLbl = new javax.swing.JLabel();
        patientList = new javax.swing.JLabel();

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

        priorityLbl.setText("1 = Urgent Priority     2 = Medium Priority    3 = Low Priority");

        noShowLbl.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        noShowLbl.setText("No-Show List");

        patientList.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        patientList.setText("Patient List");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(patientList)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(noShowLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(227, 227, 227))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(dspPatientList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dspNoShowBtn)
                .addGap(283, 283, 283))
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(priorityLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(noShowLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(patientList, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dspNoShowBtn)
                    .addComponent(dspPatientList))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(priorityLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
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
            noShowTA.append("Name: " + patient.getName() + ",   Age: " + patient.getAge() + ",   GP Details: " + patient.getGpDetails() + ",   From Ward:" + patient.isFromHospital() + "\n");
        }
        
    }//GEN-LAST:event_dspNoShowBtnActionPerformed

    private void dspPatientListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dspPatientListActionPerformed
        //clear ta
        patientTA.setText("");
        
        //display patients
        ArrayList<PQElement> queueList = patientQueue.getqQueue();

        // Display the patient queue in the text area
        for (PQElement element : queueList) {
        Patient patient = (Patient) element.getElement();
        patientTA.append("Priority: " + element.getPriorityKey() + ",   Name: " + patient.getName() + ",   Age: " + patient.getAge() + ",   GP Details: " + patient.getGpDetails() + ",   From Ward:" + patient.isFromHospital() + "\n");
        }
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
    private javax.swing.JLabel noShowLbl;
    private javax.swing.JTextArea noShowTA;
    private javax.swing.JLabel patientList;
    private javax.swing.JTextArea patientTA;
    private javax.swing.JLabel priorityLbl;
    // End of variables declaration//GEN-END:variables
}
