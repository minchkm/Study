/*
 * IntBinaryOpperator 함수형 인터페이스를 활용하여 람다식을 정적메서드 참조와 인스턴스 메서드 참조로 변환하는 실습
 */

import java.util.function.IntBinaryOperator;

public class MethodReferenceExaple {

	public static void main(String[] args) {
 
		IntBinaryOperator operator;
		/* java.util.function 패키지의 내장 함수형 인터페이스 IntBinaryOperator 특징
		 *  이 함수형 인터페이스에 정의된 추상메서드 int applyAsInt(int left, int right)는 int 타입 2개 매개값을 가지고
		 *  연산한 다음 동일한 타입 int로 연산 결과값을 반환
		 */
		
	      
		operator = (left,right) -> Calculator.staticMethod(left, right);
		System.out.println("덧셈 결과값"+operator.applyAsInt(10, 20));
	
	     //정적 매서드 참조로 변환
		operator = Calculator ::staticMethod; //정적 메서드 
	  
	
	}

}
