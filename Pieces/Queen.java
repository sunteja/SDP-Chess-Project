public class Queen extends Piece{
	
	public Queen(final Color color, final int life, final int isMoved) {
		super(PieceType.Queen, color, life, isMoved);
	}
	
	@Override
	public ArrayList<Cell> move(Cell state[][],int x,int y)
	{
		legalMoves.clear();
		
		//Checking possible moves in vertical direction
		int tempx=x-1;
		while(tempx >= 0)
		{
			if(state[tempx][y].getpiece()==null)
				legalMoves.add(state[tempx][y]);
			else if(state[tempx][y].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				legalMoves.add(state[tempx][y]);
				break;
			}
			tempx--;
		}
		
		tempx=x+1;
		while(tempx < 8)
		{
			if(state[tempx][y].getpiece()==null)
				legalMoves.add(state[tempx][y]);
			else if(state[tempx][y].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				legalMoves.add(state[tempx][y]);
				break;
			}
			tempx++;
		}
		
		
		//Checking possible moves in horizontal Direction
		int tempy=y-1;
		while(tempy >= 0)
		{
			if(state[x][tempy].getpiece()==null)
				legalMoves.add(state[x][tempy]);
			else if(state[x][tempy].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				legalMoves.add(state[x][tempy]);
				break;
			}
			tempy--;
		}
		tempy=y+1;
		while(tempy < 8)
		{
			if(state[x][tempy].getpiece()==null)
				legalMoves.add(state[x][tempy]);
			else if(state[x][tempy].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				legalMoves.add(state[x][tempy]);
				break;
			}
			tempy++;
		}
		
		//Checking for possible moves in diagonal direction
		tempx=x+1;
        tempy=y-1;
		while(tempx<8 && tempy>=0)
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