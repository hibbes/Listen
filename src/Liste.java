public class Liste {
	private ListenElement kopf;

	public Liste (int wert){
		kopf = new ListenElement(wert);
	}
	
	public void add(int wert){
		kopf.add(new ListenElement(wert));
	}
	
	public void remove(){
		kopf.remove();
	}
	
	public String toString(){
		return kopf.toString();
	}
}
