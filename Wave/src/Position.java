public class Position {
   int pos1, pos2;

    public Position (int pos1, int pos2) {
        this.pos1 = pos1;
        this.pos2 = pos2;
    }

    public int getpos1() {
        return pos1;
    }

    public int getpos2() {
        return pos2;
    }

    @Override
    public String toString() {
        return String.format("pos1: %d  pos2: %d", pos1, pos2);
    }


}
