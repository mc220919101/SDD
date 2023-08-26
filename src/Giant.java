import java.awt.*;

public class Giant<Private> extends Critter {
    private static int count = 0;
    private static int count2 = 0;

    public Giant() {
    }

    public Critter.Action getMove(CritterInfo info) {
        if (info.frontThreat()) {
            return Action.INFECT;
        } else {
            return info.getFront() == Neighbor.EMPTY ? Action.HOP : Action.RIGHT;
        }
    }

    public Color getColor() {
        return Color.GRAY;
    }

    public String toString() {
        ++count;
        count2 = count / 30;
        if (count2 == 24) {
            count = 0;
        }

        if (count2 <= 6) {
            return "fee";
        } else if (count2 <= 12) {
            return "fie";
        } else {
            return count2 <= 18 ? "foe" : "fum";
        }
    }
}
