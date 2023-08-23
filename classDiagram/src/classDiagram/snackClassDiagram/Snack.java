package classDiagram.snackClassDiagram;


public class Snack {      // 어떠한 기능적 작용은 없지만 데이터를 저장하는데 사용하는 엔티티 클래스임. 
	
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	
	public Snack() {}
	public Snack(String kind, String name, String flavor, int numOf, int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}
	
	//
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getNumOf() {
		return numOf;
	}
	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//
	public String information() {
		return null;
	}
	
//	public void MapData(String kind, String name, String flavor, int numOf, int price) {
//		Map<Integer, ArrayList<Snack>> map = new HashMap<>();
//		
//		int id = 1;
//		
//		map.put(id, new ArrayList<>());
//		map.get(id).add(new Snack(kind, name, flavor, numOf, price));
//		
//		id++;
//		
//		for(int x: map.keySet()) {
//			for(int z=1; z<map.get(x).size(); z++) 
//				{System.out.print(map.get(x).get(z));
//				System.out.println();}
//		}
}


