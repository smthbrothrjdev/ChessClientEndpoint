public class Square {
    char rank;
    int file;
    Piece occupiedPiece;

    public Square(){

    }
// adding a few constructors to handle future calls
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

    //checks to see if square is empty
    public boolean isEmpty(){
        return (occupiedPiece == null);
    }
}
