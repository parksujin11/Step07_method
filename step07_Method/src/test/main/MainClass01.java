package test.main;

import test.mypac.MyUtil;

public class MainClass01 {
	public static void main(String[] args) {
		//MyUtil Ŭ������ ������ showVersion() �޼ҵ带 ȣ���� ������. 
		//static�� class�� �� �� ȣ�� 
		//�������� ��ü�� ��������  �� �� ����
		MyUtil.showVersion();
		//MyUtil Ŭ������ ������ sendMessage() �޼ҵ带 ȣ���� ������.
		MyUtil u=new MyUtil();//MyUtil�� �����ڸ� ȣ���� ��
		u.sendMessage();
		
		MyUtil u2=new MyUtil();
		u2.sendMessage();
		
		new MyUtil().sendMessage();//�ѹ����� �����Ÿ� ������ ���� ���� �ʰ� �ᵵ �ȴ�.
		//������ ���� u�� u2�� .�� �ҷ��� �� �ִ�.
	}
}
