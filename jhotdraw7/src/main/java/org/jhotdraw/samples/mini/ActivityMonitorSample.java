/*
 * @(#)ActivityMonitorSample.java
 * 
 * Copyright (c) 2011 The authors and contributors of JHotDraw.
 * 
 * You may not use, copy or modify this file, except in compliance with the  
 * license agreement you entered into with the copyright holders. For details
 * see accompanying license terms.
 */
package org.jhotdraw.samples.mini;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.jhotdraw.gui.DefaultActivityModel;
import org.jhotdraw.gui.JActivityWindow;
import org.jhotdraw.gui.ActivityModel;

/**
 * This example program shows how to monitor background tasks using  
 * {@link org.jhotdraw.gui.ActivityModel}, {@link org.jhotdraw.gui.JActivityIndicator} 
 * and {@link org.jhotdraw.gui.JActivityWindow}.
 *
 * @author Werner Randelshofer
 * @version 1.0 2011-09-08 Created.
 */
public class ActivityMonitorSample extends javax.swing.JFrame {
    private final static long serialVersionUID = 1L;

    private ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
private int count;
    /** Creates new form ActivityMonitorSample */
    public ActivityMonitorSample() {
        initComponents();
        ownerARadio.setActionCommand("A");
        ownerBRadio.setActionCommand("B");
        ownerCRadio.setActionCommand("C");

        indicatorA.setActivityOwner("A");
        indicatorB.setActivityOwner("B");
        indicatorC.setActivityOwner("C");
        
        
        // Ensures that the activity window is running
        JActivityWindow.getInstance();

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ownerGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ownerARadio = new javax.swing.JRadioButton();
        ownerBRadio = new javax.swing.JRadioButton();
        ownerCRadio = new javax.swing.JRadioButton();
        durationLabel = new javax.swing.JLabel();
        durationSpinner = new javax.swing.JSpinner();
        durationUnitsLabel = new javax.swing.JLabel();
        cancelableCheckBox = new javax.swing.JCheckBox();
        startButton = new javax.swing.JButton();
        warningCheckBox = new javax.swing.JCheckBox();
        errorCheckBox = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        indicatorAll = new org.jhotdraw.gui.JActivityIndicator();
        jLabel3 = new javax.swing.JLabel();
        indicatorA = new org.jhotdraw.gui.JActivityIndicator();
        jLabel4 = new javax.swing.JLabel();
        indicatorB = new org.jhotdraw.gui.JActivityIndicator();
        jLabel5 = new javax.swing.JLabel();
        indicatorC = new org.jhotdraw.gui.JActivityIndicator();
        jLabel6 = new javax.swing.JLabel();

        FormListener formListener = new FormListener();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Activity Monitoring Demo");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Start New Activity"));

        jLabel1.setText("Activity Group:");

        ownerGroup.add(ownerARadio);
        ownerARadio.setSelected(true);
        ownerARadio.setText("A");

        ownerGroup.add(ownerBRadio);
        ownerBRadio.setText("B");

        ownerGroup.add(ownerCRadio);
        ownerCRadio.setText("C");

        durationLabel.setText("Duration:");

        durationSpinner.setModel(new javax.swing.SpinnerNumberModel(10, 1, 60, 5));

        durationUnitsLabel.setText("seconds");

        cancelableCheckBox.setSelected(true);
        cancelableCheckBox.setText("The activity can be canceled");

        startButton.setText("Start");
        startButton.addActionListener(formListener);

        warningCheckBox.setText("The activity will issue a warning");

        errorCheckBox.setText("The activity will issue an error");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(errorCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(startButton))
                    .addComponent(cancelableCheckBox)
                    .addComponent(warningCheckBox)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(durationLabel))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(durationSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(durationUnitsLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ownerARadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ownerBRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ownerCRadio))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ownerARadio)
                    .addComponent(ownerBRadio)
                    .addComponent(ownerCRadio))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(durationSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(durationUnitsLabel)
                    .addComponent(durationLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelableCheckBox)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(warningCheckBox)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(errorCheckBox)
                        .addComponent(startButton)))
                .addGap(33, 33, 33))
        );

        jLabel2.setText("Indicator for all activities:");

        indicatorAll.addMouseListener(formListener);

        jLabel3.setText("Indicator for activities in A:");

        indicatorA.addMouseListener(formListener);

        jLabel4.setText("Indicator for activities in B:");

        indicatorB.addMouseListener(formListener);

        jLabel5.setText("Indicator for activities in C:");

        indicatorC.addMouseListener(formListener);

        jLabel6.setText("Click on one of the indicators to open the activity window.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(indicatorAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(indicatorA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(indicatorB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(indicatorC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(indicatorAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(indicatorA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(indicatorB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(indicatorC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener, java.awt.event.MouseListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == startButton) {
                ActivityMonitorSample.this.startPerformed(evt);
            }
        }

        public void mouseClicked(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == indicatorAll) {
                ActivityMonitorSample.this.indicatorClicked(evt);
            }
            else if (evt.getSource() == indicatorA) {
                ActivityMonitorSample.this.indicatorClicked(evt);
            }
            else if (evt.getSource() == indicatorB) {
                ActivityMonitorSample.this.indicatorClicked(evt);
            }
            else if (evt.getSource() == indicatorC) {
                ActivityMonitorSample.this.indicatorClicked(evt);
            }
        }

        public void mouseEntered(java.awt.event.MouseEvent evt) {
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
        }

        public void mousePressed(java.awt.event.MouseEvent evt) {
        }

        public void mouseReleased(java.awt.event.MouseEvent evt) {
        }
    }// </editor-fold>//GEN-END:initComponents

private void startPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startPerformed

    final int duration = ((Number) durationSpinner.getValue()).intValue();
    final boolean willFail = errorCheckBox.isSelected();
    final boolean willWarn = warningCheckBox.isSelected();
    String owner = ownerGroup.getSelection().getActionCommand();
    final ActivityModel pm = new DefaultActivityModel(owner, "Task #"+(++count)+", in group " + owner + (willFail ? ", will fail" : "") + (willWarn ? ", will warn" : ""));
    pm.setIndeterminate(false);
    pm.setCancelable(cancelableCheckBox.isSelected());
    pm.setNote("Waiting for processor");
    Runnable r = new Runnable() {

        @Override
        public void run() {
            try {
                pm.setNote("Working...");
                if (willWarn) {
                    pm.setWarning("A warning occured.");
                }
                long startTime = System.currentTimeMillis();
                long endTime = startTime + duration * 1000;
                pm.setMaximum(duration);
                pm.setValue(0);
                pm.setIndeterminate(false);
                for (long now = startTime; now < endTime && !pm.isCanceled(); now = System.currentTimeMillis()) {
                    pm.setValue(1 + (int) ((now - startTime) * (pm.getMaximum() - pm.getMinimum()) / (endTime - startTime)) + pm.getMinimum());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        // ignore
                    }
                    if (willFail& Math.random()<0.3) break;
                }
                if (pm.isCanceled()) {
                    pm.setNote("Canceled.");
                } else {
                    if (willFail) {
                        pm.setNote(null);
                        pm.setError("An error occured.");
                    } else {
                        pm.setNote("Done.");
                        pm.setValue(pm.getMaximum());
                    }
                }
            } finally {
                pm.close();
            }
        }
    };
    executor.execute(r);

}//GEN-LAST:event_startPerformed

private void indicatorClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_indicatorClicked
    JActivityWindow.getInstance().setVisible(true);
}//GEN-LAST:event_indicatorClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new ActivityMonitorSample().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cancelableCheckBox;
    private javax.swing.JLabel durationLabel;
    private javax.swing.JSpinner durationSpinner;
    private javax.swing.JLabel durationUnitsLabel;
    private javax.swing.JCheckBox errorCheckBox;
    private org.jhotdraw.gui.JActivityIndicator indicatorA;
    private org.jhotdraw.gui.JActivityIndicator indicatorAll;
    private org.jhotdraw.gui.JActivityIndicator indicatorB;
    private org.jhotdraw.gui.JActivityIndicator indicatorC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton ownerARadio;
    private javax.swing.JRadioButton ownerBRadio;
    private javax.swing.JRadioButton ownerCRadio;
    private javax.swing.ButtonGroup ownerGroup;
    private javax.swing.JButton startButton;
    private javax.swing.JCheckBox warningCheckBox;
    // End of variables declaration//GEN-END:variables
}