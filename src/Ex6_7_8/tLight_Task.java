/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex6_7_8;

import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author ehsan
 */
public class tLight_Task extends TimerTask {

    private final Color r;
    private final Color g;
    private final Color y;
    private final Timer timer;
    private final trafficLight p;
    private tLight_Task ntask;
    private int t;
    private boolean stop;
    private int count;

    public tLight_Task(Color red, Color yellow, Color green, trafficLight panel) {

        r = red;
        g = green;
        y = yellow;
        p = panel;
        timer = new Timer();
        stop = false;
        count = 0;
    }

    @Override
    public void run() {
        p.setRedlight(r);
        p.setGreenlight(g);
        p.setYellowlight(y);
        p.repaint();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (!stop) {
                    ntask.run();
                    count++;
                }
            }
        }, t);
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public void setNextTask(tLight_Task ntask, int t) {
        this.t = t;
        this.ntask = ntask;
    }

    public void cancelNextTask() {
        this.stop = true;
        this.cancel();
    }

    public int getCount() {
        return count;
    }

}
