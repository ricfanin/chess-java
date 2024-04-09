package game.pieces;

public abstract class Piece {

    public String id;
    public String color;
    public int x, y;

    public Piece(String _color, int _x, int _y)
    {
        color = _color;
        x = _x;
        y = _y;
    }

    public abstract void move();
}
