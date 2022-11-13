package genericEx;

public class BasicArrayListMain {

	public static void main(String[] args) {
		BasicArrayList bsl = new BasicArrayList();
		
		bsl.add(1);
		bsl.add("test");
		
		System.out.println(bsl.size());
		
		int intTypeValue = (int)bsl.getValue(0);
		String stringTypeValue = (String)bsl.getValue(1);
		
		System.out.println(intTypeValue);
		System.out.println(stringTypeValue);
	}

}
