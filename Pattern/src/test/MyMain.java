package test;

public class MyMain extends SuperMyMin{
	public static void main(String[] args) {
		MyMain mm = new MyMain();
		mm.process();
	}
	public void process(){
		MyAction myAction = super.myAction;
		String myDo = myAction.myStop();
		System.out.println(myDo);
	}
}
