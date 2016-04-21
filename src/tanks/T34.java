package tanks;

import interfaces.Direction;
import launchMain.ActionField;
import launchMain.BattleField;

import java.awt.*;


public class T34 extends AbstractTank{
    public T34(ActionField af, BattleField bf){
        this(af, bf, 0, 64, Direction.RIGHT);
    }

    public T34(ActionField af, BattleField bf, int x, int y, Direction direction){
        super(af, bf, x, y, direction);
        tankColor = new Color(0, 255, 0);
        towerColor = new Color(255, 0, 0);
        speed=20;
    }

    public void destroy() throws Exception{
        updateX(-100);
        updateY(-100);
        af.repaint();
    }

    @Override
    public Action setUp() {
        return Action.MOVE;
    }

    @Override
    public int getMovePath() {
        return 0;
    }
}
