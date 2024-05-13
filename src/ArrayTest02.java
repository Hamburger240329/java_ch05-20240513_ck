
public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = new int[2][3];	// 0으로 초기화 된 2행 3열로 된 2차원 배열 생성
		
//		int[][] array1 = {{10,20,30},{40,50,60}}; // 보기가 어려워서 아래처럼 변경함
		
		int[][] array1 = {
							{10,20,30},
							{40,50,60},
							{70, 80,90}
						};
		
		// arr1 배열의 모든 원소의 총합을 구하시오.
		int[] arr1 = {10,20,30,40,50};
		int sum = 0;
//		for(int i=0;i<arr1.length;i++) { // i=0 1 2 3 4
//			sum = sum + arr1[i];
//		}				

		System.out.println(sum);
		
		// for i in arr1: - 파이썬으로 하면 이렇게 함
		// sum = sum + i
		
		// 새로나온 문법이 있음 - 문법이름 : 향상된 for문
		// 향상된 for 문
		for(int i: arr1) {
			sum = sum + i;
		}
		System.out.println(sum);
		
	}
		

		
		
}
