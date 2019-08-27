
abstract class Instrument {
	abstract void play();
}
class Flute extends Instrument {
	void play() {
		System.out.println("toot toot toot");
	}
}
class Guitar extends Instrument {
	void play() {
		System.out.println("tin tin tin");
	}
}
class Piano extends Instrument {
	void play() {
		System.out.println("tan tan tan");
	}
}
public class InstrumentMain {
	public static void main(String[] args) {
		Instrument ref1,ref2,ref3;
		ref1 = new Piano();
		ref1.play();
		
		ref2 = new Flute();
		ref2.play();
		
		ref3 = new Guitar();
		ref3.play();
	}
}
