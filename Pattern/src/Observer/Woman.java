package Observer;

import java.util.ArrayList;
import java.util.List;

public class Woman implements Subject{
	private String name;
	private List<Observer> boyFriendList;

	public Woman(String name) {
		this.name = name;
		this.boyFriendList = new ArrayList<>();
	}

	@Override
	public void attach(Observer o) {
		boyFriendList.add(o);
	}

	@Override
	public void detach(Observer o) {
		if(boyFriendList.contains(o)){
			boyFriendList.remove(o);
		}
	}

	@Override
	public void notifyObservers() {
		boyFriendList.forEach((boyFriend) -> boyFriend.update("!!!"));
	}
	
}
