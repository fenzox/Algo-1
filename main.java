package glint1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		
 
        String unit;
        char[][] allUnits = null;
        int row = 0;
        int col = 0;
        String [] temp = null;
        try {
            File file = new File("C:\\Users\\jinyi\\Desktop\\Java Workspace\\glint\\src\\glint1\\untitled.txt");
            Scanner fileReader = new Scanner(file);
            while(fileReader.hasNextLine()) {
                temp = fileReader.next().split("");
                row++;
            }
            col = temp.length;
            System.out.println(row + " row / col" + col);
            allUnits  = new char [row][col];
            fileReader.close();
            fileReader = new Scanner(file);
            int i = 0;
            while(fileReader.hasNextLine()) {
                unit = fileReader.nextLine();
                for (int j = 0; j < col; j++) {
                    allUnits[i][j] = unit.charAt(j);
                }
                i++;
            }

            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }

		for ( int i = 0; i < allUnits.length ; i++) {
			for ( int j = 0; j < allUnits[i].length; j++) {
			System.out.print(allUnits[i][j] + "");

			}
			System.out.println();
		}
		
		 int cluster = 0;
	        boolean[][] visited = new boolean[row][col];
	        // Traverse the 2D array with depth first search
	        for ( int i = 0; i < row; i++) {
	            for ( int j = 0; j < col; j++) {
	            	// If node is + and not visited
	            	if(allUnits[i][j] == '+'  && !visited[i][j]) {
	                    int count =0;    
	                   count = dfs(allUnits, visited, i, j, row-1, col-1);
	                    if(count > 1)
	                        cluster++;
	                }
	            }
	        }
	        System.out.println("Number of clusters: " + cluster);

	    }
		
		// visits the 8 neighbors
	    public static int dfs(char[][] allUnits, boolean[][] visited, int i, int j, int row, int col) {
	        // 
	    	int count = 0;
	        // Check if node is visited, out of bounds and not a +
	        if(i < 0 || i > row || j < 0 || j > col || !(allUnits[i][j] == '+') || visited[i][j]) {
	            return count;
	        }
	        // Else, update count value
	        else {
	        visited[i][j] = true;
	        count++;
	        count += dfs(allUnits, visited, i-1, j-1, row, col);
	        count += dfs(allUnits, visited, i-1, j, row, col);
	        count += dfs(allUnits, visited, i-1, j+1, row, col);
	        count += dfs(allUnits, visited, i, j-1, row, col);
	        count += dfs(allUnits, visited, i, j+1, row, col);
	        count += dfs(allUnits, visited, i+1, j-1, row, col);
	        count += dfs(allUnits, visited, i+1, j, row, col);
	        count += dfs(allUnits, visited, i+1, j+1, row, col);
	        return count;
	        }
	    }

	}
