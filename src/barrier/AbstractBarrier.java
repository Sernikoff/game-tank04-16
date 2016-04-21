package barrier;


import interfaces.Drowable;

import java.awt.*;

public class AbstractBarrier implements Drowable {
    protected int x;
    protected int y;
    protected Color barrierColor;

    AbstractBarrier(){

    }

    public void draw(Graphics g){
        g.setColor(barrierColor);
        g.fillRect(x, y, 64, 64);
    }
}
