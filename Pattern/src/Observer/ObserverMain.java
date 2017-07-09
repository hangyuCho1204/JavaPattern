package Observer;

public class ObserverMain {
	public static void main(String[] args) {
		ObserverMain om = new ObserverMain();
		om.startFunction();
	}
	public void startFunction(){
		Observer man = new Man("남자");
		Subject woman = new Woman("여자");
		
		woman.attach(man);
		
		woman.notifyObservers();
		
		woman.detach(man);
	}
}
