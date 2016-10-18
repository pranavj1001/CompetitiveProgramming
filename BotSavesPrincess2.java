//The Question for this solution can be found at https://www.hackerrank.com/challenges/saveprincess2

import java.util.Scanner;

public class BotSavesPrincess2 {
static void nextMove(int n, int r, int c, String [] grid){
	
	int qrow = 0, qcol = 0;
    
    String[][] board = new String[n][n];
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            char x = grid[i].charAt(j);
            board[i][j] = String.valueOf(x);
            if(x == 'p'){
            	qrow = i;
            	qcol = j;
            }
        }
    }
	
    if(qrow == r){
    	
    	if(qcol > c){
    		System.out.println("RIGHT");
    	}else{
    		System.out.println("LEFT");
    	}
    	
    }else{
    	
    	if(qrow > r){
    		System.out.println("DOWN");
    	}else{
    		System.out.println("UP");
    	}
    	
    }
    
 }
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,r,c;
        n = in.nextInt();
        r = in.nextInt();
        c = in.nextInt();
        in.useDelimiter("\n");
        String grid[] = new String[n];


        for(int i = 0; i < n; i++) {
            grid[i] = in.next();
        }

        nextMove(n,r,c,grid);
        in.close();
    }
}
