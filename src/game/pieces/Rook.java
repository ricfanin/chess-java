package game.pieces;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

import java.util.Objects;

public class Rook extends Piece{

    public Rook(Color _color, int _x, int _y) {
        super("r", "rook",_color, _x, _y);
    }

    @Override
    public void move(int x, int y) {

    }

}
