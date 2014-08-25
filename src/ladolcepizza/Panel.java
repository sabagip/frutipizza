/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ladolcepizza;

import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Logger;
import javax.swing.JPanel;



/**
 *
 * @author SABAGIP
 */
public class Panel extends JPanel {
    private Image img;

    public Panel(Image img) {
        this.img = img;
        Dimension dimension = new Dimension(img.getWidth(null), img.getWidth(null));
        
        this.setPreferredSize(dimension);
        this.setMaximumSize(dimension);
        this.setSize(dimension);
        this.setLayout(null);
        
        
        
    }
   
    @Override
    protected void paintComponent(Graphics g){
        g.drawImage(img, 0, 0, null);
    }
    
    
    
}
