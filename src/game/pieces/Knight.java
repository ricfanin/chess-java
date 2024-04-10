package game.pieces;

import game.pieces.Piece;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

import java.util.Objects;

public class Knight  extends Piece{
    public Knight(Color _color, int _x, int _y) {
        super("n", "knight", _color, _x, _y);
    }

    @Override
    public void move() {

    }

}
