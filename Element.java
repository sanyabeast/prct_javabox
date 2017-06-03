import java.util.ArrayList;
import java.util.Random;

public class Element {
	String name = "Thing";
	ArrayList<Child> children = new ArrayList<Child>();

	public Element(String name){
		this.name = name;

		for (int i = 0; i < 10; i++){
			Child child = new Child(i);
				children.add(child);
		}

	}

	public String toString(){
		return name;
	}

	public void logChildren(){
		for (int i = 0; i < children.size(); i++){
			System.out.println(children.get(i));
		}
	}

}

class Child {
	int index;
	Random rand;

	static int total = 0;

	public Child(int index){
		this.index = index;
		rand = new Random();
		total++;

	}

	public String toString(){
		return Integer.toString(total);
	}
}
