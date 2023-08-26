import java.awt.*;

public class NinjaCat extends Critter {
    public NinjaCat() {
    }

    public Critter.Action getMove(CritterInfo info) {
        if (info.getFront() != Neighbor.OTHER && info.getRight() != Neighbor.OTHER && info.getBack() != Neighbor.OTHER && info.getLeft() != Neighbor.OTHER) {
            if (!info.frontThreat() && !info.backThreat() && !info.leftThreat() && !info.rightThreat()) {
                if (info.getFront() == Neighbor.WALL) {
                    return Action.LEFT;
                } else if (info.getRight() == Neighbor.WALL) {
                    return Action.LEFT;
                } else if (info.getFront() == Neighbor.SAME) {
                    return Action.RIGHT;
                } else {
                    return info.getFront() == Neighbor.EMPTY ? Action.HOP : Action.HOP;
                }
            } else {
                return Action.INFECT;
            }
        } else {
            return Action.INFECT;
        }
    }

    public Color getColor() {
        return Color.YELLOW;
    }

    public String toString() {
        return "*";
    }
}
