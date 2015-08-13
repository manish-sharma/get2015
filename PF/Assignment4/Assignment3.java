import java.util.*;

public class Assignment3
{	
	  
		  boolean solve(int row, int[][] board, int N)   /*Function to solve NQueen Problem*/ 
		  {
		    if(row>=N)
		    {
		    	return true;
		    }
		    
		    for(int position = 0; position < N; position++) 
		    {
		    	
		      if(isValid(board, row, position, N))
		      {
		        board[row][position] = 1;
		        
		        if(!solve(row+1, board, N))       //Recursive call to NQueen 
		        {
		            board[row][position] = 0;
		        } 
		        else
		             return true;
		      }
		    }
		    return false;
		  }

		  boolean isValid(int[][] board, int x, int y, int N)  /*Function to check column is valid or not in NQueen Problem*/ 
		  {
		    int i, j;
		    for(i = 0; i < x; i++)
		    {
		    	if(board[i][y]==1)
		    	{
		    		return false;
		    	}
			        
		    }
		      
		    i = x - 1;
		    j = y - 1;
		    while((i>=0)&&(j>=0))
		    {
		    	
		    	if(board[i--][j--]==1)
		    	{
		    		return false;
		    	}
		    }
		      
		    i = x - 1;
		    j = y + 1;
		    while((i>=0)&&(j<N))
		    {
		    	if(board[i--][j++]==1)
		    	{
		    		return false;
		    	}
		    }
		      
		    return true;
		  }
		  
		  public static void main(String args[]) 
		     {
			
			    Scanner scan = new Scanner(System.in);
			    
			    System.out.println("Enter the number of queens");
			    int N=scan.nextInt();
			    
			    int[][] board = new int[N][N];
			    
			    Assignment3 ass = new Assignment3();
			    ass.solve(0, board, N);
			    
			    for(int i = 0; i < N; i++)
			    {
			      for(int j = 0; j < N; j++)
			      {
			        if(board[i][j]==1) System.out.print("Q\t");
			        else System.out.print("*\t");
			      }
			      System.out.println();
			    }
			    scan.close();
			  }
	}
