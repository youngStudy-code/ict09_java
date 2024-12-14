package ch05;

// p222 2차원 배열
public class _04_ArrayEx {
	public static void main(String args[]) {
		int [][] arr =  {{1,2,3}, // 0행
						{4,5,6}}; // 1행
		
		for (int i=0; i<2; i++) { //i가 행의 길이 = 2바퀴 (0,1)
			for(int j=0; j<3; j++) { //j는 열의 길이 = 3바퀴 (0,1,2)
				System.out.println(arr[i][j]); // i(행)가0일때, j(열)가3바퀴
				// [0][0] [0][1] [0][2]
				// [1][0] [1][1] [1][2]
			}
		} 
		
		System.out.println();
		System.out.println("------------------");
		
		for (int i=0; i<arr.length; i++) { 
			for(int j=0; j<arr[i].length; j++) { 
				System.out.print(arr[i][j] + " ");
				// [0][0] [0][1] [0][2]
				// [1][0] [1][1] [1][2]
			}
			System.out.println();
		} 
		
		
		System.out.println("------------------");
		
		String[][] str = 	{{"A","B","C"}, // 0행
							{"D","E","F"}, // 1행
							{"G","H","I"}}; // 2행
		
		for (int k=0; k<str.length; k++) { //3바퀴 (0,1,2)
			for(int h=0; h<str[k].length; h++) { //3바퀴 (0,1,2)
				System.out.print(str[k][h] + " "); 	
			}
			System.out.println();
		}
	}
}
