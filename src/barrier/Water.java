package barrier;

import java.awt.*;

/**
 * Created by Сергей on 14.04.2016.
 */
public class Water extends AbstractBarrier{
    public	Water(int x, int y){
        this.x = x;
        this.y = y;
        barrierColor = new Color(0 , 0, 230);
    }
}
