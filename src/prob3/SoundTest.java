package prob3;

public class SoundTest {

	public static void main(String[] args) {
		printSound( new Cat() );
		printSound( new Dog() );
		printSound( new Sparrow() );
		printSound( new Duck() );
	}

	private static void printSound(Soundable animal) {
		System.out.println(animal.Sound());		
	}
}
