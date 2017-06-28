package test;

import java.util.Scanner;

public class FiveChess {
	int size = 15;
	String[][] chess = new String[size][size];
	boolean isBlack = true;
	
	Scanner sc = new Scanner(System.in);
	int xPox,yPox;                     //落子坐标
	public void pan(){                 //棋盘初始化
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				chess[i][j]="+";
			}
			System.out.println();
		}
	}
	
	public void intPan(){
		for(int i=0;i<size;i++){
			System.out.printf("%2d",i);
			for(int j=0;j<size;j++){
				System.out.printf(chess[i][j]);
			}
			System.out.println();
		}
	}
	
	//落子
	public void downChess(){
		while(true){
			System.out.print("\n请"+(isBlack ? "黑方●" : "白方○")+"落子<x/y>: " );
			String inputStr = sc.next();
			String[] posArr = inputStr.split(","); //切割	
			//将String转换为int 
			xPox = Integer.parseInt(posArr[0]);
			yPox = Integer.parseInt(posArr[1]);
			if(xPox<0 || yPox>14){                      //是否超过边界
				System.out.print("\n\t\t输入的坐标无效,请重新的输入!!!\n");
				continue;
			}
			if(!chess[xPox][yPox].equals("+")){                         //下棋的点是否已经有棋子
				System.out.print("\n\t\tSorry,此处已有棋子,请重新的输入!!!\n");
				continue;
			}
			isChess();
			isWin();
			isBlack=!isBlack;
		}
	}
	
	public void isChess(){
		String currChess = isBlack ? "●" : "○";  //将棋子放入棋盘
		chess[xPox][yPox] = currChess;
		for(int i=0 ; i<15 ; i++){                  //显示棋盘
			System.out.printf("%2d",i);
			for(int j= 0 ;j<15;j++){
				System.out.print(chess[i][j]);
			}
			System.out.print("\n");
		}
	}
	
	public void isWin(){
		boolean hasNull = false;
		outer:for(int i=0;i<15;i++){
			for(int j=0;j<15;j++){
				if(chess[i][j].equals("+")){
					hasNull = true;
					break outer;
				}
			}
		}
		if(!hasNull){ //如果没有空位
			System.out.println("\n\t平局!!!");
			return;
		}
		int count=0; //计数器
		String currChess = isBlack ? "●" : "○";
		boolean isWin = false;
		for(int i=0;i<15;i++){
			if(chess[xPox][i].equals(currChess)){
				count++;
				if(count==5){
					isWin=true;
					return;
				}
			}else{
				count=0;
			}
		}
		
		for(int i=0;i<15;i++){
			if(chess[i][yPox].equals(currChess)){
				count++;
				if(count==5){
					isWin=true;
					return;
				}
			}else{
				count=0;
			}
		}
		
		for(int i=4;i>=(-4);i--){
			if(xPox+i>14 || xPox+i<0 || yPox+i>14 || yPox+i<0)
	    		continue;
			else if(chess[xPox+i][yPox+i].equals(currChess)){
		    	count++;
		    	if(count==5){
					isWin = true;
		    	    return;
		    	}
			} else{
		    	count=0;
			}
		}
		
		for(int i=4;i>=(-4);i--){
			if(xPox+i>14 || xPox+i<0 || yPox-i>14 || yPox-i<0)
	    		continue;
			else if(chess[xPox+i][yPox-i].equals(currChess)){
		    	count++;
		    	if(count==5){
					isWin=true;
		    	    return;
		    	}
			} else{
		    	count=0;
			}
		}
	}
	
	public void win(){
		System.out.println("\t恭喜"+(isBlack ? "黑方" : "白方")+"获胜");
	}
	
}
