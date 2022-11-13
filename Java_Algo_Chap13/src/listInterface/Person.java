package listInterface;

import java.text.NumberFormat;

public class Person extends Thread{
	private VectorEx vx;
	private String name;
	
	public Person(VectorEx vx, String name) {
		this.vx = vx;
		this.name = name;
	}
	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			vx.vector.add(i);
		//	vx.arrList.add(i);
		}
		System.out.print("입금자 "+this.name+"금액 "+
		vx.getAmount());
		
	}
	
}
