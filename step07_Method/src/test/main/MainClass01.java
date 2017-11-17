package test.main;

import test.mypac.MyUtil;

public class MainClass01 {
	public static void main(String[] args) {
		//MyUtil 클래스에 정의한 showVersion() 메소드를 호출해 보세요. 
		//static은 class명에 점 찍어서 호출 
		//힙영역의 객체는 참조값에  점 찍어서 참조
		MyUtil.showVersion();
		//MyUtil 클래스에 정의한 sendMessage() 메소드를 호출해 보세요.
		MyUtil u=new MyUtil();//MyUtil의 생성자를 호출한 것
		u.sendMessage();
		
		MyUtil u2=new MyUtil();
		u2.sendMessage();
		
		new MyUtil().sendMessage();//한번쓰고 버릴거면 변수에 굳이 담지 않고 써도 된다.
		//변수에 담은 u나 u2는 .찍어서 불러쓸 수 있다.
	}
}
