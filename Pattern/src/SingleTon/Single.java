package SingleTon;

public class Single {
	private static Single single;
	private String test = "test";
	public static Single SingleTon(){
		if(single == null){
			single = new Single();
		}
		return single;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
}
