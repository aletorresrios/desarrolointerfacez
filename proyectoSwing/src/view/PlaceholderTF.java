/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JTextField;

/**
 *
 * @author Windows
 */
public class PlaceholderTF extends JTextField{
    private String placeholder;

    public PlaceholderTF(String placeholder) {
        this.placeholder = placeholder;
    }
    @Override
    protected void paintComponent (Graphics g){
        super.paintComponent(g);
        if (getText().isEmpty()) {
            g.setColor(Color.GRAY);
            g.drawString(placeholder, getInsets().left, g.getFontMetrics().getAscent() + getInsets().top);
        }
    }
}
