package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		int[] nums = {10, 20, 30, 40, 50};
		// 1.
		for(int i=0; i<nums.length; i++){
			int tmp = nums[i];
		}
		// 2. 확장 for 문
		// for( 배열에 저장된 data type tmp : 배열의 참조값)
		for(int tmp : nums){
			
		}
		// 1번 for 문과 2번 for 문은 같은 것임
		// 배열에 있는 것을 순서대로 사용할때 확장 for 문 사용
	}
}
