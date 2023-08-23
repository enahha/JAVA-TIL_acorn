package classDiagram.snackClassDiagram;

public class SnackController{
	private Snack s;
	//
	public SnackController() {}
	
	public Snack saveData(String kind, String name, String flavor, int numOf, int price) {
		s = new Snack(kind, name, flavor, numOf, price);
		
		return s;
	}
	
//	public Collection<> MapData(String kind, String name, String flavor, int numOf, int price) {
//		s = new Snack(kind, name, flavor, numOf, price);
//		sM = s.MapData(kind, name, flavor, numOf, price);
//		return s;
//	}

}


