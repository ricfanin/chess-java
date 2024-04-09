package game.pieces;

import game.pieces.Piece;

public class Pawn extends Piece {

    public Pawn(String _color, int _x, int _y) {
        super(_color, _x, _y);
    }

    @Override
    public void move() {
        if (this.color.equals("w"))
        {
            y++;
        }
    }
}
