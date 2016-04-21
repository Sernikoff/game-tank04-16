package tanks;

import interfaces.Direction;
import launchMain.ActionField;
import launchMain.BattleField;

import java.awt.*;


public class Tiger extends AbstractTank{
    private int armor;


    public Tiger(ActionField af, BattleField bf){
        this(af, bf, 128, 64, Direction.UP);

    }

    public Tiger(ActionField af, BattleField bf, int x, int y, Direction direction){
        super(af, bf, x, y, direction);
        tankColor = new Color(255, 0, 0);
        towerColor = new Color(0, 255, 0);
        armor=1;
        speed=10;
    }

    public int getArmor() {
        return armor;
    }

    public void destroy() throws Exception{
        if (armor==0){
            this.x = -100;
            this.y = -100;
            af.repaint();}
        else{
            armor--;
        }
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
