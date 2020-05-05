
public class Main {
	enum Vals {X, Y, Z}
	public static void main(String[] args) {
		Vals data = Vals.Z;
		switch(data) {
		case X: System.out.println("x ");
		case Y: System.out.println("y ");
		case Z: System.out.println("z ");
		default: System.out.println("other");
		}
	}
}
