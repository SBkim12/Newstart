package practice01;
class Truck
{
	private int num;
	private double gas;
	
	public void setTruck(int n) {
		num = n;
		System.out.println("차량번호를" + num + "으로 바꾸었습니다.");
	}
	public void setTruck(double g) {
		gas = g;
		System.out.println("연료 양을" + gas + "으로 바꾸었습니다.");
	}
	public void setTruck(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량번호를" + num + "으로, 연료 양을" + gas +  "으로 바꾸었습니다.");
	}
	public void show()
	{
		System.out.println("차량 번호는" + num + "입니다.");
		System.out.println("연료 양은" + gas + "입니다.");
	}
}
public class Practice30 {

	public static void main(String[] args) {
		Truck car1 = new Truck();
		
		car1.setTruck(1234,20.5);
		car1.show();
		
		System.out.println("차량 번호만 변경 되었습니다.");
		car1.setTruck(2345);
		car1.show();
		
		System.out.println("연료량만 변경 되었습니다.");
		car1.setTruck(30.5);
		car1.show();

	}

}
