package game.pieces;

import game.pieces.Piece;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

import java.util.Objects;


public class Queen extends Piece{

    public Queen(Color _color, int _x, int _y) {
        super("q", "queen", _color, _x, _y);
    }

    @Override
    public void move(int x, int y) {

    }

}
