public class Queen extends Piece {

    // Vérifie si le déplacement de la reine est valide
    boolean isValidMove(Position newPosition) {

        if (!super.isValidMove(newPosition)) {
            return false;
        }

        // Déplacement vertical ou horizontal
        boolean isVerticalOrHorizontal =
                newPosition.column == this.column ||
                        newPosition.row == this.row;

        // Déplacement en diagonale
        boolean isDiagonal =
                Math.abs(newPosition.column - this.column) ==
                        Math.abs(newPosition.row - this.row);

        // La reine peut se déplacer en ligne droite ou en diagonale
        return isVerticalOrHorizontal || isDiagonal;
    }
}
