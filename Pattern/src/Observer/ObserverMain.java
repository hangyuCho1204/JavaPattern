package Observer;

public class ObserverMain {
	public static void main(String[] args) {
		ObserverMain om = new ObserverMain();
		om.startFunction();
	}
	public void startFunction(){
		Observer man = new Man("����");
		Subject woman = new Woman("����");
		
		woman.attach(man);
		
		woman.notifyObservers();
		
		woman.detach(man);
	}
}
