public class Segmento {
	private Punto inizioSegmento;
	private Punto fineSegmento;
	
	public Segmento(Punto inizioSegmento, Punto fineSegmento) {
		this.inizioSegmento = new Punto(inizioSegmento.getCoordinataX(),inizioSegmento.getCoordinataY(),inizioSegmento.getCoordinataZ());
		this.fineSegmento = new Punto(fineSegmento.getCoordinataX(),fineSegmento.getCoordinataY(),fineSegmento.getCoordinataZ());
	}
	
	public String toString () {
		return "Il segmento ha coordinate \nx1: " +inizioSegmento.getCoordinataX() + " y1: " + inizioSegmento.getCoordinataY() + " z1: " +
				inizioSegmento.getCoordinataZ() + "\nx2: " + fineSegmento.getCoordinataX() + " y2: " + fineSegmento.getCoordinataY() + " z2: " +
				fineSegmento.getCoordinataZ();
	}
	
}
