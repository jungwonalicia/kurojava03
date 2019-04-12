package generic;

class GenericUser {

	public static void main(String[] args) {
		Generic1<String, String> g1 
			= new Generic1<>("감자", "고구마");
		System.out.println(g1.x + g1.y);
		System.out.println("------------");
		
		Generic1<Integer, Double> g2 
			= new Generic1<Integer, Double>(100, 33.3);
		System.out.println(g2.x + g2.y);
	}
}

