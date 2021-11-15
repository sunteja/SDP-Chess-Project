package Pieces;

import java.util.ArrayList;

public final class Knight extends Piece {
	public Knight(final Color color, final int life, final int isMoved) {
		super(PieceType.KNIGHT, color, life, isMoved);
	}

	@Override
	public ArrayList<Cell> legalMoves(Game game, Cell startCell) {
		final ArrayList<Cell> highlightCells = new ArrayList<>();
		final Piece startPiece = startCell.getPiece();
		final Color startPieceColor = startPiece.getColor();

		final Position position = startCell.getPosition();
		final int x = position.getXCoordinate();
		final int y = position.getYCoordinate();

		final Board board = game.getBoard();
		final ArrayList<Cell> cells = board.getCells();

		int posx[] = {x + 1, x + 1, x + 2, x + 2, x - 1, x - 1, x - 2, x - 2};
		int posy[] = {y - 2, y + 2, y - 1, y + 1, y - 2, y + 2, y - 1, y + 1};
		int i;
		for (i = 0; i < 8; i++) {
			// Boundary check i.e checking if it is within bounds of the board.
			if (posx[i] >= 0 && posx[i] < 8 && posy[i] >= 0 && posy[i] < 8) {
				// If the resulting cell or the final cell has no piece or if it has a piece of the opposite color then, add it to the possible legalMoves.
				final Cell destination = board.getCellByCoordinates(posx[i], posy[i]);
				final Piece destinationPiece = destination.getPiece();
				final Color destinationPieceColor = destinationPiece.getColor();
				if (destinationPiece == NULL || destinationPieceColor != startPieceColor) {
					// You might have to change this
					highlightCells.add(Cell(posx[i], posy[i]));
				}
			}
		}
		return highlightCells;
	}
}