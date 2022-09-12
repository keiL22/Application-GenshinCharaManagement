
package GenshinManagementSystem.View;

public class Form extends javax.swing.JPanel {

    public Form() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        statsCard2 = new GenshinManagementSystem.Swing.StatsCard();
        statsCard1 = new GenshinManagementSystem.Swing.StatsCard();
        comparisonCard1 = new GenshinManagementSystem.Swing.ComparisonCard();

        setBackground(new java.awt.Color(248, 248, 248));

        jLayeredPane1.setLayout(new java.awt.GridLayout(1, 0, 15, 0));
        jLayeredPane1.add(statsCard2);
        jLayeredPane1.add(statsCard1);
        jLayeredPane1.add(comparisonCard1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1554, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GenshinManagementSystem.Swing.ComparisonCard comparisonCard1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private GenshinManagementSystem.Swing.StatsCard statsCard1;
    private GenshinManagementSystem.Swing.StatsCard statsCard2;
    // End of variables declaration//GEN-END:variables
}
