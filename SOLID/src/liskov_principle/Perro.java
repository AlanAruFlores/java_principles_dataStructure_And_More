package liskov_principle;

public class Perro extends Animal {
	
	@Override
	public void hacerRuido() {
		System.out.println("Wof");
	}
}
