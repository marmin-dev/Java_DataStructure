package listInterface;

public class ThreadEx {

	public static void main(String[] args) {
		VectorEx vx = new VectorEx();
		for(int i=0;i<3;i++) {
			String name = "Person"+i;
			new Person(vx, name).start();
		}

	}

}
