import java.awt.*;

public class Bear extends Critter {
    private Critter.Direction test;
    private String bearchar = "\\";

    public Bear(boolean direction) {
    }

    public Critter.Action getMove(CritterInfo info) {
        this.test = info.getDirection();
        if (info.frontThreat()) {
            return Action.INFECT;
        } else {
            return info.getFront() == Neighbor.EMPTY ? Action.HOP : Action.LEFT;
        }
    }

    public Color getColor() {
        if (this.test == Direction.NORTH) {
            return Color.WHITE;
        } else {
            return this.test == Direction.SOUTH ? Color.WHITE : Color.BLACK;
        }
    }

    public String toString() {
        if (this.bearchar == "/") {
            this.bearchar = "\\";
        } else if (this.bearchar == "\\") {
            this.bearchar = "/";
        }

        return this.bearchar;
    }
}

