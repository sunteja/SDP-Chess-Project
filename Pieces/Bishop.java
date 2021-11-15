public class Bishop extends Piece{
	
	public Bishop(final Color color, final int life, final int isMoved) {
		super(PieceType.Bishop, color, life, isMoved);
	}
	
	@Override
	public ArrayList<Cell> move(Cell state[][],int x,int y)
	{
		//Bishop can Move diagonally in all 4 direction (NW,NE,SW,SE)
		
		legalMoves.clear();
		int tempx=x+1, tempy=y-1;
		while(tempx<8 && tempy>=0)
		{
			if(state[tempx][tempy].getpiece()==null)
			{
				legalMoves.add(state[tempx][tempy]);
			}
			else if(state[tempx][tempy].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				legalMoves.add(state[tempx][tempy]);
				break;
			}
			tempx++;
			tempy--;
		}

		tempx=x-1;
        tempy=y+1;
		while(tempx>=0 && tempy<8)
		{
			if(state[tempx][tempy].getpiece()==null)
				legalMoves.add(state[tempx][tempy]);
			else if(state[tempx][tempy].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				legalMoves.add(state[tempx][tempy]);
				break;
			}
			tempx--;
			tempy++;
		}

		tempx=x-1;
        tempy=y-1;
		while(tempx>=0 && tempy>=0)
		{
			if(state[tempx][tempy].getpiece()==null)
				legalMoves.add(state[tempx][tempy]);
			else if(state[tempx][tempy].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				legalMoves.add(state[tempx][tempy]);
				break;
			}
			tempx--;
			tempy--;
		}

		tempx=x+1;
        tempy=y+1;
		while(tempx<8 && tempy<8)
		{
			if(state[tempx][tempy].getpiece()==null)
				legalMoves.add(state[tempx][tempy]);
			else if(state[tempx][tempy].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				legalMoves.add(state[tempx][tempy]);
				break;
			}
			tempx++;
			tempy++;
		}
		return legalMoves;
	}
}