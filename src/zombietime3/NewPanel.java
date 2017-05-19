/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombietime3;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;

/**
 *
 * @author NataliaPabon
 */
public class NewPanel extends JPanel implements ActionListener {

    private int x;
    private Timer timer;
    private int delay = 30; //cantidad de msg en las que cambia de pos.
    private Color color;
    private int secuencia;
    
    public NewPanel() {
        timer = new Timer(delay, this);
        timer.start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image fondo = loadImage("Charming-space_1920x1080.jpg");
        g.drawImage(fondo, 0, 0, 850, 479, null);
        Image nave = loadImage("Nave_Espacial_icono.png");      
        g.drawImage(nave, 435, x+105 ,50,50, this);
        Image zombie = loadImage("");
        
        
        g.fillOval(435, x+105, 30, 30);
        g.fillRect(435, 305, 50, 50);
        g.fillRect(410, 350, 100, 100);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        x += 2; //Cantidad de pixeles que se mueve
        if (this.secuencia == 2) {
            this.secuencia = 0;
        } else {
            this.secuencia++;
        }
        repaint();
    }

    public Rectangle bordeNaves() {
        Rectangle z = (null);
        Rectangle[] borde = new Rectangle[2];
        borde[0] = new Rectangle(x + 435, 305, 50, 50);
        borde[1] = new Rectangle(x + 410, 350, 100, 100);
        for (int i = 0; i < borde.length; i++) {
            z = borde[i];
        }
        return z;
    }

    public Image loadImage(String imageName) { //Cargar una imagen
        ImageIcon im = new ImageIcon(imageName);
        Image image = im.getImage();
        return image;
    }
}
