
public class TestPuntiSegmenti {

	public static void main(String[] args) {
		Punto punto1 = new Punto(1,3,8);
		Punto punto2 = new Punto(4,4,7);
		
		Segmento segmento1 = new Segmento(punto1, punto2);
		
		System.out.print(segmento1);

	}

}
