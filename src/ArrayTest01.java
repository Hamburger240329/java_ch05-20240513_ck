
public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//list1 = [1,2,3,4,5]
		int[] ArrayInt = {1,2,3,4,5};
		double[] arrayDouble = {1.1,2.2};
		String[] arrayStr = {"korea","japan","use"};
		
		int[] arrayTest = null; // 참조하는 배열값이 없는 배열 이름만 선언 
		// list1 = []
		
		int[] arrayTest2 = new int[5]; // 각 원소값이 0으로 초기화 되는 5칸짜리 배열이 생성됨
		
		System.out.println(arrayTest2[0]);

//		for(int i=0;i<5;i++) {  // 배열 arrayTest2의 모든 원소를 출력
//			System.out.println(arrayTest2[i]);	
			
		for(int i=0;i<arrayTest2.length;i++) { // 배열 arrayTest2의 모든 원소를 출력
		System.out.println(arrayTest2[i]);	
		 // 배열의 크기를 모를때 length 사용 - 소프트코딩
		}
				

	}
}

