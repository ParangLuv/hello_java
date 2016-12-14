package kr.or.dgit.bigdata.hello_java.func;

public class Gugudan {

	public void calGugudan(int dan) {

/* 
 
		2 * 1 = 2
		2 * 2 = 4
		...
		2 * 9 = 18*
		
		
		초기값 1 -> 2 -> 3 -> 4-> 5-> 6-> 1씩 증가
		조건 9일때 까지 반복
		
		
		
		for(초기화 ; 조건식 ; 증감식){ 
		//반복 할 문장
		}
		
*/

			for(int i = 1; i < 10; i++){
				System.out.println(dan + "*" + i + " = " + dan*i);
			}
		
	}
	
	
}
