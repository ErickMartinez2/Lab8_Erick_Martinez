/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_erick_martinez;

import javax.swing.JLabel;

/**
 *
 * @author usuario
 */
public class Hilo extends Thread {
    private JLabel label;
    private boolean a;

    public Hilo(JLabel label) {
        this.label = label;
        a = true;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public boolean isA() {
        return a;
    }

    public void setA(boolean a) {
        this.a = a;
    }
    
    @Override
    public void run(){
        int hora = 0, min = 0, sec = 0;
        while(a){
            sec++;
            if (sec==60) {
                min++;
                sec=0;
            }
            if (min==60) {
                hora++;
                min = 0;
            }
            label.setText(hora + ":" + min + ":" + sec);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
