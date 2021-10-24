package structural.bridge.colorshape;

public class ShapeBridgeDemo {

	public static void main(String[] args) {
		
		Shape greenSquare =  new Square(new Green());
		greenSquare.applyColor();
		
		Shape redSquare =  new Square(new Red());
		redSquare.applyColor();

	}

}
