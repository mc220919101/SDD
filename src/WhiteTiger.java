//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.*;

public class WhiteTiger extends Critter {
    private boolean test;

    public WhiteTiger() {
    }

    public Critter.Action getMove(CritterInfo info) {
        if (info.frontThreat()) {
            this.test = info.frontThreat();
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
        return Color.WHITE;
    }

    public String toString() {
        return this.test ? "TGR" : "tgr";
    }
}
