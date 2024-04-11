package game.pieces;

import game.pieces.Piece;
import javafx.scene.paint.Color;

public class King extends Piece{

    public King(Color _color, int _x, int _y) {
        super("k", "king",_color, _x, _y);
    }

    @Override
    public void move(int x, int y) {

    }

}
