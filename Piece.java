public class Piece {
    boolean color; // TRUE = white False = black
    Type type;
    Square location;

    public Piece(){}

    public Piece (Type t, Square l, boolean c){
        this.color = c;
        this.type = t;
        this.location = l;

    }

}

