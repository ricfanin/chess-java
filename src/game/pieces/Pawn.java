package game.pieces;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

import java.util.Objects;

public class Pawn extends Piece {

    public Pawn(Color _color, int _x, int _y) {
        super("p", "pawn", _color, _x, _y);
    }


    @Override
    public void move() {

    }
}
