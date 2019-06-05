import java.util.stream.IntStream;

public class Demp {
	public static void main(String[] args) {
	//	nlines(3);
		h(3);
	}

	public static void nlines(int n) {
        if (n < 2) {
            System.out.println(n);
        } else {
            IntStream.concat(IntStream.of(n), IntStream.rangeClosed(1, n))
                    .mapToObj(i ->
                            String.format(
                                    "%" + n/2 + "s" +
                                    "%0" + Integer.toString(n).length() + "d" +
                                    "%" + n/2 + "s",
                                    "", i, "")
                            .replace(" ", Integer.toString(n))
                    )
                    .forEach(System.out::println);
        }
    }
	
	public static void h(int n) {
		int row = 0;
		int column = 0;
		
		if(n%2 == 0) {
			row = n+1;
			column = n+1;
		}
		else {
			row = n+1;
			column = n;
		}
		
		int[][] matrix = new int[row][column];
		
		int count=1;
		int half = n/2;
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				if((i > 0 && i<row) && j == half) {
					matrix[i][j] = count;
					count++;
				}
				else {
					matrix[i][j] = n;
				}
			}
		}
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
	
		public static void rotate(int[][] matrix, int n) {
			    for (int layer = 0; layer < n / 2; ++layer) {
			     int first = layer;
			     int last = n - 1 - layer;
			     for(int i = first; i < last; ++i) {
			      int offset = i - first;
			      int top = matrix[first][i]; // save top
		     // left -> top
		      matrix[first][i] = matrix[last-offset][first];   
			
			      // bottom -> left
			      matrix[last-offset][first] = matrix[last][last - offset];
			
			      // right -> bottom
			      matrix[last][last - offset] = matrix[i][last];
			
			      // top -> right
			      matrix[i][last] = top; // right <- saved top
			     }
			    }
			  }
}
