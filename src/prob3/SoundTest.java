package prob3;

public class SoundTest {

	public static void main(String[] args) {

		printSound( new Cat() );
		printSound( new Dog() );
		printSound( new Bird() );
		printSound( new Duck() );
	}
	
	public static void printSound( Soundable soundable ) {
		System.out.println( soundable.sound() );
	}
}