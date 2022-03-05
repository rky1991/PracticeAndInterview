package interfaces;

public interface ClassInsideInterface {
	
    void test();
	
	class InsideInterface {
		public void test2() {
			System.out.println("method inside the class");
		}	
	}
	
	public static void main(String[] args) {
		
		System.out.println("class inside the interface ");
	}

}
