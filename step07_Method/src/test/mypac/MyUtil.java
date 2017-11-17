package test.mypac;
/*
 * 메소드 정의하기
 * 
 * 1. 접근 지정자? public 지정자는 공개 
 * 2. static or non static ? static 클래스와 함께 static 영역에 올라감.
 * 3. return 데이터 type? 돌려주지않을거면 void 
 * 4. 메소드명 ? showVersion
 * 5. 메소드에 전달받는 인자의 갯수와 데이터 type? 메소드명 뒤에 ()에 넣을
 * 
 */

public class MyUtil {
	//메소드 정의하기
	//생성자 안써도 디폴트 생성자 있는거 
	public static void showVersion() {
		System.out.println("showVersion() 호출됨!");		
	}
	public void sendMessage() {
		System.out.println("sendMessage() 호출됨!");
	}
	//int type을 돌려줌
	public static int getNum() {
		System.out.println("getNum() 호출됨!");
		return 10;
	}
	
	public static String getMessage() {
		System.out.println("getMessage() 호출됨");
		return "Hello! mama!";
	}
	public String getName() {
		System.out.println("getName() 호출됨");
		return "김구라";
	}
	/*
	 * 접근 지정자 : public
	 * static
	 * 리턴 데이터 type : Car
	 * 메소드명 : getCar
	 * 메소드 인자 : 없음
	 */
	public static Car getCar() {
		Car car=new Car();
		return car;
	}
	//인자로 String type 을 받는 메소드
	public static void printMsg(String msg) {
		System.out.println("printMsg() 호출됨");
	}
	
	//인자로 Car type 을 받는 메소드
	public static void useCar(Car car) {
		car.drive();
	}
	// 인자로 String type 과 Car type 을 전달 받는 메소드
	public static void useCar(String msg, Car car) {
		car.drive();
	}
}







