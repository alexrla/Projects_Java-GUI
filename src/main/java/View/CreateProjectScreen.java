/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View;

import Controller.ProjectController;
import Model.Project;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author alexa
 */
public class CreateProjectScreen extends javax.swing.JDialog {

    ProjectController controller;

    /**
     * Creates new form CreateProjectScreen
     */
    public CreateProjectScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        controller = new ProjectController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        Toolbar = new javax.swing.JPanel();
        ToolbarTitle = new javax.swing.JLabel();
        ToolbarBtn = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        DescriptionLabel = new javax.swing.JLabel();
        ScrollDescription = new javax.swing.JScrollPane();
        DescriptionField = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(162, 151, 195));

        Toolbar.setBackground(new java.awt.Color(98, 86, 130));
        Toolbar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ToolbarTitle.setFont(new java.awt.Font("Fira Code", 1, 26)); // NOI18N
        ToolbarTitle.setForeground(new java.awt.Color(255, 255, 255));
        ToolbarTitle.setText("Projeto");

        ToolbarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add2.png"))); // NOI18N
        ToolbarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ToolbarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ToolbarBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ToolbarLayout = new javax.swing.GroupLayout(Toolbar);
        Toolbar.setLayout(ToolbarLayout);
        ToolbarLayout.setHorizontalGroup(
                ToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ToolbarLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(ToolbarTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ToolbarBtn)
                                .addGap(50, 50, 50)));
        ToolbarLayout.setVerticalGroup(
                ToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ToolbarLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(ToolbarLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ToolbarTitle, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ToolbarBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(25, Short.MAX_VALUE)));

        NameLabel.setFont(new java.awt.Font("Fira Code", 1, 20)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NameLabel.setText("Descrição:");

        NameField.setFont(new java.awt.Font("Fira Code", 1, 16)); // NOI18N

        DescriptionLabel.setFont(new java.awt.Font("Fira Code", 1, 20)); // NOI18N
        DescriptionLabel.setForeground(new java.awt.Color(255, 255, 255));
        DescriptionLabel.setText("Nome:");

        DescriptionField.setColumns(20);
        DescriptionField.setFont(new java.awt.Font("Fira Code Retina", 0, 16)); // NOI18N
        DescriptionField.setRows(5);
        ScrollDescription.setViewportView(DescriptionField);

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
                MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Toolbar, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(MainPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(DescriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 304,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 304,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NameField)
                                        .addComponent(ScrollDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 424,
                                                Short.MAX_VALUE))
                                .addContainerGap(50, Short.MAX_VALUE)));
        MainPanelLayout.setVerticalGroup(
                MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(Toolbar, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(DescriptionLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(NameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ScrollDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 249,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(30, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ToolbarBtnMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_ToolbarBtnMouseClicked
        // TODO add your handling code here:
        try {

            if (!NameField.getText().equals("") || !DescriptionField.getText().equals("")) {

                Project project = new Project();
                project.setName(NameField.getText());
                project.setDescription(DescriptionField.getText());
                controller.save(project);
                JOptionPane.showMessageDialog(rootPane, "Projeto cadastrado com sucesso!");
                this.dispose();

            } else {

                JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!");

            }

        } catch (HeadlessException ex) {

            JOptionPane.showMessageDialog(rootPane, ex.getMessage());

            this.dispose();

        }
    }// GEN-LAST:event_ToolbarBtnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateProjectScreen.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateProjectScreen.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateProjectScreen.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateProjectScreen.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CreateProjectScreen dialog = new CreateProjectScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DescriptionField;
    private javax.swing.JLabel DescriptionLabel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JScrollPane ScrollDescription;
    private javax.swing.JPanel Toolbar;
    private javax.swing.JLabel ToolbarBtn;
    private javax.swing.JLabel ToolbarTitle;
    // End of variables declaration//GEN-END:variables
}
