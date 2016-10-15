//The Question for this solution can be found at https://www.hackerrank.com/challenges/saveprincess

import java.util.Scanner;

public class BotSavesPrincess {
static void displayPathtoPrincess(int n, String [] grid){
	
	int row = 0, column = 0;
    
    String[][] board = new String[n][n];
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            char x = grid[i].charAt(j);
            board[i][j] = String.valueOf(x);
            if(x == 'm'){
            	row = i;
            	column = j;
            }
        }
    }

    int positionOfQueen = 0;
    if(board[0][0].charAt(0) == 'p'){
    	positionOfQueen = 0;
    }
    if(board[0][n-1].charAt(0) == 'p'){
    	positionOfQueen = 1;
    }
    if(board[n-1][0].charAt(0) == 'p'){
    	positionOfQueen = 2;
    }
    if(board[n-1][n-1].charAt(0) == 'p'){
    	positionOfQueen = 3;
    }
    
    if(positionOfQueen == 0 || positionOfQueen == 1){
    	if(positionOfQueen == 0){
    			while(row != 0){
    				System.out.println("UP");
    				row--;
    			}
    			while(column != 0){
    				System.out.println("LEFT");
    				column--;
    			}
    	}else{
    		while(row != 0){
				System.out.println("UP");
				row--;
			}
			while(column != n-1){
				System.out.println("RIGHT");
				column++;
			}
    	}
    }else{
    	if(positionOfQueen == 2){
    		while(row != n-1){
				System.out.println("DOWN");
				row++;
			}
			while(column != 0){
				System.out.println("LEFT");
				column--;
			}
    	}else{
    		while(row != n-1){
				System.out.println("DOWN");
				row++;
			}
			while(column != n-1){
				System.out.println("RIGHT");
				column++;
			}
    	}
    }  
  }
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m;
        m = in.nextInt();
        String grid[] = new String[m];
        for(int i = 0; i < m; i++) {
            grid[i] = in.next();
        }

    displayPathtoPrincess(m,grid);
    in.close();
    }
}