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
    public void move(int x, int y) {
        if(this.color == Color.WHITE){
            if(this.getY() == 1)
            {
                if(y - this.getY() <= 2 && y - this.getY() >= 1 && x - this.getX() == 0)
                {
                    this.x = x;
                    this.y = y;
                }
            }
            else {
                if(y - this.getY() == 1 && x - this.getX() == 0)
                {
                    this.x = x;
                    this.y = y;
                }
            }
        }
        else
        {
            if(this.getY() == 6)
            {
                if(this.getY() - y <= 2 && this.getY() -y >= 1 && this.getX() - x == 0)
                {
                    this.x = x;
                    this.y = y;
                }
            }
            else {
                if(this.getY() - y == 1 && this.getX() - x == 0)
                {
                    this.x = x;
                    this.y = y;
                }
            }
        }

        this.selected = false;

    }
}
