package by.makedon.snake.domain;

import by.makedon.snake.runner.SnakeGameMain;

public class snake
{
	public int length = 2;
	public int direction = 1;
	
	public int sX[] = new int[SnakeGameMain.WIDTH*SnakeGameMain.HEIGTH];
	public int sY[] = new int[SnakeGameMain.WIDTH*SnakeGameMain.HEIGTH];
	
	public snake(int x1, int y1, int x2, int y2)
	{
		sX[0]=x1;
		sX[1]=x2;
		sY[0]=y1;
		sY[1]=y2;
	}
	
	public void move()
	{
		for(int l=length;l>0;l--)
		{
			sX[l]=sX[l-1];
			sY[l]=sY[l-1];
		}
		
		//up
		if (direction==0) sY[0]--;
		//down
		if (direction==1) sY[0]++;
		//left
		if (direction==2) sX[0]--;
		//right
		if (direction==3) sX[0]++;
		
		if (sY[0]>SnakeGameMain.HEIGTH-1) sY[0]=0;
		if (sY[0]<0) sY[0]=SnakeGameMain.HEIGTH-1;
		if (sX[0]>SnakeGameMain.WIDTH-1) sX[0]=0;
		if (sX[0]<0) sX[0]=SnakeGameMain.WIDTH-1;
	}
}