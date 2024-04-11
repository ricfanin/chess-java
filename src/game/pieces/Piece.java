package game.pieces;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.Objects;

public abstract class Piece {
    protected Image src;
    protected ImageView img;
    protected String id;
    protected Color color;
    protected int x, y;
    protected boolean selected = false;

    public Piece(String _id, String pieceType, Color _color, int _x, int _y)
    {
        this.id = _id;
        this.color = _color;
        this.x = _x;
        this.y = _y;

        if(this.color == Color.WHITE){
            this.src = new Image(Objects.requireNonNull(getClass().getResourceAsStream("img/white_".concat(pieceType) + ".png")));
        }
        else {
            this.src = new Image(Objects.requireNonNull(getClass().getResourceAsStream("img/black_".concat(pieceType) + ".png")));
        }
        this.img = new ImageView(src);

        this.img.setOnMouseClicked(mouseEvent -> {
            System.out.println(this.color +  " " + this.getX() + this.getY());
            selected = true;
        });
    }

    public boolean isSelected() {
        return selected;
    }

    public ImageView getImg()
    {
        return this.img;
    }

    public int getX()
    {
        return this.x;
    }

    public int getY()
    {
        return this.y;
    }



    public abstract void move(int x, int y);
}
