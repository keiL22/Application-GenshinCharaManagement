/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GenshinManagementSystem.View;

import java.awt.Color;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setBackground(new Color(0,0,0,0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homeView1 = new GenshinManagementSystem.Swing.WhitePanel();
        form1 = new GenshinManagementSystem.View.Form();
        whitePanel1 = new GenshinManagementSystem.Swing.WhitePanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        charactersTable1 = new GenshinManagementSystem.Swing.CharactersTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        homeView1.setBackground(new java.awt.Color(242, 242, 242));

        form1.setBackground(new java.awt.Color(242, 242, 242));

        whitePanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(null);

        charactersTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ɴᴀᴍᴇ", "ʟᴇᴠᴇʟ", "ғʀɪᴇɴᴅ", "ᴛᴀʟᴇɴᴛ", "ᴛᴇᴀᴘᴏᴛ", "ᴄᴏɴs", "ᴇʟᴇᴍᴇɴᴛ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(charactersTable1);
        if (charactersTable1.getColumnModel().getColumnCount() > 0) {
            charactersTable1.getColumnModel().getColumn(0).setResizable(false);
            charactersTable1.getColumnModel().getColumn(1).setResizable(false);
            charactersTable1.getColumnModel().getColumn(2).setResizable(false);
            charactersTable1.getColumnModel().getColumn(3).setResizable(false);
            charactersTable1.getColumnModel().getColumn(4).setResizable(false);
            charactersTable1.getColumnModel().getColumn(5).setResizable(false);
            charactersTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout whitePanel1Layout = new javax.swing.GroupLayout(whitePanel1);
        whitePanel1.setLayout(whitePanel1Layout);
        whitePanel1Layout.setHorizontalGroup(
            whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(whitePanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        whitePanel1Layout.setVerticalGroup(
            whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(whitePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout homeView1Layout = new javax.swing.GroupLayout(homeView1);
        homeView1.setLayout(homeView1Layout);
        homeView1Layout.setHorizontalGroup(
            homeView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeView1Layout.createSequentialGroup()
                .addGroup(homeView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homeView1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(form1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(homeView1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(whitePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homeView1Layout.setVerticalGroup(
            homeView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeView1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(form1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(whitePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(homeView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeView1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GenshinManagementSystem.Swing.CharactersTable charactersTable1;
    private GenshinManagementSystem.View.Form form1;
    private GenshinManagementSystem.Swing.WhitePanel homeView1;
    private javax.swing.JScrollPane jScrollPane1;
    private GenshinManagementSystem.Swing.WhitePanel whitePanel1;
    // End of variables declaration//GEN-END:variables
}
