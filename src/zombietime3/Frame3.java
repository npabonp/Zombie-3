/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombietime3;

import javax.swing.JFrame;

/**
 *
 * @author NataliaPabon
 */
public class Frame3 extends JFrame {

    private static Frame3 instance3 = null;

    private Frame3() {
        add(Nivel3.getInstance3());
    }

    public static Frame3 getInstance() {
        if (instance3 == null) {
            instance3 = new Frame3();
        }
        return instance3;
    }

}
