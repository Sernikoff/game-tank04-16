package barrier;


import java.awt.*;

public class Brick extends AbstractBarrier{
    public Brick(int x, int y){
        this.x = x;
        this.y = y;
        barrierColor = new Color(70 , 0, 0);
    }
}
