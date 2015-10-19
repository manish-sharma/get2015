package assignment2;

public class Main {

	public static void main(String[] args) {
		System.out.println("Converting JSON To Object:");
		JSONToObject jToO = new JSONToObject();
		jToO.convertJSONToObject();
		System.out.println("Converting Object To JSON");
		ObjectToJSON oToJ = new ObjectToJSON();
		oToJ.objectToJSON();
	}
}
