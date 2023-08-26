//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.*;

public class Tiger extends Critter {
    Color r;
    Color g;
    Color b;
    public Color randcolor;
    private static int count = 0;
    private static int count2 = 0;

    public Tiger() {
    }

    public Critter.Action getMove(CritterInfo info) {
        if (info.frontThreat()) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.WALL) {
            return Action.LEFT;
        } else if (info.getRight() == Neighbor.WALL) {
            return Action.LEFT;
        } else {
            return info.getFront() == Neighbor.SAME ? Action.RIGHT : Action.HOP;
        }
    }

    public Color getColor() {
        return this.randomColor();
    }

    public Color randomColor() {
        int r = (int)(Math.random() * 3.0);
        if (r == 0) {
            this.randcolor = new Color(255, 0, 0);
        }

        if (r == 1) {
            this.randcolor = new Color(0, 255, 0);
        } else if (r == 2) {
            this.randcolor = new Color(0, 0, 255);
        }

        return this.randcolor;
    }

    public String toString() {
        return "TGR";
    }
}
