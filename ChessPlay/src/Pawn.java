public class Pawn extends Piece {
    public Pawn(int x, int y, Side side, Board board) {
        super(x,y,side,board);
    }

    @Override
    public boolean canMove(int destX, int destY) {


        int prow = getSide() == Side.WHITE ? 6 : 1;

        //uppon frist move
        if (y==prow) {
                if(getSide()==Side.WHITE) {

                    if (destX == x && (destY == y - 1 || destY == y - 2)){
                        return true;
                    }
                    if(x-1>=0&&y-1>=0){
                    if (board.get(x - 1, y - 1) != null && (destX == x - 1 && destY == y - 1)) {
                        return true;
                    }}
                    if(x+1<=7&&y-1>=0){
                    if ((board.get(x + 1, y - 1) != null && (destX == x + 1 && destY == y - 1))) {
                        return true;
                    }
                }}
                else{
                    if ((destX == x && (destY == (y + 1) || destY == (y + 2))) ) { //
                            return true;
                        }

                    if(x-1>=0&&y+1<=7){
                    if ((board.get(x - 1, y + 1) != null && (destX == x - 1 && destY == y + 1))){
                        return true;
                    }}
                    if(x+1<=7&&y+1<=7){
                    if ((board.get(x + 1, y + 1) != null && (destX == x + 1 && destY == y + 1))) {
                        return true;
                    }}
                }}

        else if(y!=prow){
            if(getSide()==Side.WHITE) {
                if(y-1>=0){
                    if (destX == x && (destY == y - 1 )){
                        return true;
                    }}
                if(x-1>=0&&y-1>=0){
                    if (board.get(x - 1, y - 1) != null && (destX == x - 1 && destY == y - 1)) {
                        return true;
                    }}
                if(x+1<=7&&y-1>=0){
                    if ((board.get(x + 1, y - 1) != null && (destX == x + 1 && destY == y - 1))) {
                        return true;
                    }
                }}
                else if(getSide()==Side.BLACK) {

                    if(y+1<=7) {
                        if (destX == x && destY == (y + 1) )  { //
                            return true;
                        }
                    }
                    if(x-1>=0&&y+1<=7){
                        if (board.get(x - 1, y + 1) != null && (destX == x - 1 && destY == y + 1)){
                            return true;
                        }}
                    if(x+1<=7&&y+1<=7){
                        if (board.get(x + 1, y + 1) != null && (destX == x + 1 && destY == y + 1)) {
                            return true;
                        }}
                }}


            return false;//other situation except above
    }
    @Override
    public String getSymbol() {
        return this.getSide() == Side.BLACK ? "♟" : "♙";
    }
}
