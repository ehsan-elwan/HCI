/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex6_7_8;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author ehsan
 */
public class trafficLight extends javax.swing.JPanel {

    private Color redlight = Color.BLACK;
    private Color yellowlight = Color.BLACK;
    private Color greenlight = Color.BLACK;

    /**
     * Creates new form trafficLight
     */
    public trafficLight() {
        initComponents();
    }

    public void DrawCircle(int x, int y, int width, int height, Graphics g, Color c) {
        setVisible(true);
        g.setColor(c);
        g.fillOval(x, y, width, height);

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        DrawCircle(100, 100, 50, 50, g, redlight);
        DrawCircle(100, 250, 50, 50, g, yellowlight);
        DrawCircle(100, 400, 50, 50, g, greenlight);
        //this.paintComponent(g);
    }

    public void setRedlight(Color redlight) {
        this.redlight = redlight;
    }

    public void setYellowlight(Color yellowlight) {
        this.yellowlight = yellowlight;
    }

    public void setGreenlight(Color greenlight) {
        this.greenlight = greenlight;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}