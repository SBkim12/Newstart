package practice01;
class Suv{
	public static int sum =0;
	private int num;
	private double gas;
	
	public Suv() {
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("SUV�� ����������ϴ�.");
	}
	public void setSuv(int n, double g) {
		num = n;
		gas = g;
		System.out.println("������ȣ��" + num + "�̸� ���� ����" + gas + "�� �ٲپ����ϴ�.");
	}
	public static void showSum() {
		System.out.println("�ڵ����� ���" + sum + "�� �ֽ��ϴ�.");
	}
	public void show() {
		System.out.println("���� ��ȣ��" + this.num + "�Դϴ�.");
		System.out.println("���� ����" + this.gas + "�Դϴ�.");
	}
}
public class Practice32 {

	public static void main(String[] args) {
	
		Suv.showSum();
		Suv car1 = new Suv();
		car1.setSuv(1234, 20.5);
		
		Suv.showSum();
		
		Suv car2 = new Suv();
		car2.setSuv(4567, 30.5);
		Suv.showSum();
	}

}
