package practice01;

class Mygraph
{
	private int x;
	private int y;
	
	public Mygraph()
	{
		x = 0;
		y = 0;
	}
	public Mygraph(int px, int py) {
		if(px >= 0 && py <= 100) x = px; else x = 0;
		if(px >= 0 && py <= 100) x = px; else x = 0;
	}
	public void setX(int px) {
		if(px >=0 && px <= 100)
			x = px;
	}
	public void setY(int py) {
		if(py >=0 && py <= 100)
			y = py;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}

class Test9
{
	public static void main(String[] args)
	{
		Mygraph p1;
		p1 = new Mygraph();
		p1.setX(10);
		p1.setY(5);
		
		int px1 = p1.getX();
		int py1 = p1.getY();
		
		System.out.println("p1ÀÇ xÁÂÇ¥´Â " + px1 + " YÁÂÇ¥´Â " + py1 +"ÀÔ´Ï´Ù.");
		
		Mygraph p2;
		p2 = new Mygraph();
		p2.setX(20);
		p2.setY(10);
		
		int px2 = p2.getX();
		int py2 = p2.getY();
		
		System.out.println("p2ÀÇ xÁÂÇ¥´Â " + px2 + " YÁÂÇ¥´Â " + py2 +"ÀÔ´Ï´Ù.");
	}
}