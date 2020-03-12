
public class Test {

	public static void main(String[] args) {
		Liste liste = new Liste(3);
		liste.add(5);
		liste.add(7);
		liste.add(20);
		liste.add(6);
		
		System.out.println(liste);
		
		liste.remove();
		System.out.println(liste);
	}

}
