import tools.Element;

public class Hello {
	static String str = "KEK";
	public static void main(String[] args){
		System.out.println(str);
		Element el = new Element("table");

		System.out.println(el);

		el.logChildren();

	}
}
