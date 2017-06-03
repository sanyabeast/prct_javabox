public class Element {
	String name = "Thing";

	public Element(String name){
		this.name = name;
	}

	public String toString(){
		return name;
	}

	public static void main(String[] args){
		Element el = new Element("Chair");
		System.out.println(el);
	}
}
