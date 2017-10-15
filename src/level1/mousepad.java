package level1;

public class mousepad {
	String material;
	static int numMousepads = 0;
	
	public mousepad(){
		numMousepads++;
		material = new String("leather");
		
	}
	public mousepad(String mat){
		numMousepads++;
		mat = material;
	}
	public static void numMousepads(){
		System.out.println(numMousepads);
	}
	public void setMaterial(String mat){
		material = mat;
		System.out.println(material);
	}
	

}
