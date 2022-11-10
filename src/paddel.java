public class paddel {
    private int x;
    private int y;
    private int width = 10;

    public paddel(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveupp(){
        y = y - 10;
    }

    public void movedown(){
        y = y + 10;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}