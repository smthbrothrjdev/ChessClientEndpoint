public class Square {
    char rank;
    int file;
    Piece occupiedPiece;

    public Square(){

    }

    public Square(char r, int f) {
        this.rank = r;
        this.file = f;
    }

    public Square( char r, int f, Piece p){
        this.rank =r;
        this.file =f;
        this.occupiedPiece = p;
    }
    //TODO add constructor for with peice and replace strin peice with object piece.

    public boolean isEmpty(){
        return (occupiedPiece == null);
    }
}
