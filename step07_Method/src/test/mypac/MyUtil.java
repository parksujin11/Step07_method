package test.mypac;
/*
 * �޼ҵ� �����ϱ�
 * 
 * 1. ���� ������? public �����ڴ� ���� 
 * 2. static or non static ? static Ŭ������ �Բ� static ������ �ö�.
 * 3. return ������ type? �������������Ÿ� void 
 * 4. �޼ҵ�� ? showVersion
 * 5. �޼ҵ忡 ���޹޴� ������ ������ ������ type? �޼ҵ�� �ڿ� ()�� ����
 * 
 */

public class MyUtil {
	//�޼ҵ� �����ϱ�
	//������ �Ƚᵵ ����Ʈ ������ �ִ°� 
	public static void showVersion() {
		System.out.println("showVersion() ȣ���!");		
	}
	public void sendMessage() {
		System.out.println("sendMessage() ȣ���!");
	}
	//int type�� ������
	public static int getNum() {
		System.out.println("getNum() ȣ���!");
		return 10;
	}
	
	public static String getMessage() {
		System.out.println("getMessage() ȣ���");
		return "Hello! mama!";
	}
	public String getName() {
		System.out.println("getName() ȣ���");
		return "�豸��";
	}
	/*
	 * ���� ������ : public
	 * static
	 * ���� ������ type : Car
	 * �޼ҵ�� : getCar
	 * �޼ҵ� ���� : ����
	 */
	public static Car getCar() {
		Car car=new Car();
		return car;
	}
	//���ڷ� String type �� �޴� �޼ҵ�
	public static void printMsg(String msg) {
		System.out.println("printMsg() ȣ���");
	}
	
	//���ڷ� Car type �� �޴� �޼ҵ�
	public static void useCar(Car car) {
		car.drive();
	}
	// ���ڷ� String type �� Car type �� ���� �޴� �޼ҵ�
	public static void useCar(String msg, Car car) {
		car.drive();
	}
}







