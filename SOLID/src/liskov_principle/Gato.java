package liskov_principle;

public class Gato extends Animal{
	
	@Override
	public void hacerRuido() {
		System.out.println("Miau");
	}
}
