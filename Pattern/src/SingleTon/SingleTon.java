package SingleTon;

public class SingleTon {
	public static void main(String[] args) {
		Single st = Single.SingleTon();
		System.out.println("st1 : " + st.getTest());
		st.setTest("Overloading");
		SingleTon ston = new SingleTon();
		ston.test();
	}
	public void test(){
		Single st = Single.SingleTon();
		System.out.println("st2 : "+ st.getTest());
	}
}