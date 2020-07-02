package practice01;
class Suv{
	public static int sum =0;
	private int num;
	private double gas;
	
	public Suv() {
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("SUV가 만들어졌습니다.");
	}
	public void setSuv(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량번호가" + num + "이며 연료 양이" + gas + "로 바꾸었습니다.");
	}
	public static void showSum() {
		System.out.println("자동차는 모두" + sum + "대 있습니다.");
	}
	public void show() {
		System.out.println("차량 번호는" + this.num + "입니다.");
		System.out.println("연료 양은" + this.gas + "입니다.");
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
