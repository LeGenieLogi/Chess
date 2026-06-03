public class Queen extends Piece {
    boolean isValidMove(Position newPosition) {
        if (!super.isValidMove(newPosition)) {
            return false;
        }

        boolean isVerticalOrHorizontal = newPosition.column == this.column || newPosition.row == this.row;
        boolean isDiagonal = Math.abs(newPosition.column - this.column) == Math.abs(newPosition.row - this.row);
        return isVerticalOrHorizontal || isDiagonal;
    }
}
