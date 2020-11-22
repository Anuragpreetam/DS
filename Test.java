class Test{
	public void Test(){
		System.out.print("This is default constructor");
	}
	public Test(int a){
		System.out.print("This is default constructor1");
	}
	public void Testing(int a){
		System.out.print("This is not a constructor");
	}
	public static void main(String[] args) {
		Test o = new Test();
		Test q = new Test(1);
	}
}