package practice01;
class Truck
{
	private int num;
	private double gas;
	
	public void setTruck(int n) {
		num = n;
		System.out.println("������ȣ��" + num + "���� �ٲپ����ϴ�.");
	}
	public void setTruck(double g) {
		gas = g;
		System.out.println("���� ����" + gas + "���� �ٲپ����ϴ�.");
	}
	public void setTruck(int n, double g) {
		num = n;
		gas = g;
		System.out.println("������ȣ��" + num + "����, ���� ����" + gas +  "���� �ٲپ����ϴ�.");
	}
	public void show()
	{
		System.out.println("���� ��ȣ��" + num + "�Դϴ�.");
		System.out.println("���� ����" + gas + "�Դϴ�.");
	}
}
public class Practice30 {

	public static void main(String[] args) {
		Truck car1 = new Truck();
		
		car1.setTruck(1234,20.5);
		car1.show();
		
		System.out.println("���� ��ȣ�� ���� �Ǿ����ϴ�.");
		car1.setTruck(2345);
		car1.show();
		
		System.out.println("���ᷮ�� ���� �Ǿ����ϴ�.");
		car1.setTruck(30.5);
		car1.show();

	}

}
