package adeptia;

 class TestOne extends Testing {

	
	public void set(int a) {
		this.a=a;
	}

	
	final public  void get() {
		System.out.println("a="+a);
		
	}
	public static void main(String[] args) {
		TestOne obj= new TestOne();
		obj.set(20);
		obj.get();
	}

}
