public class Rettangolo 
{
    private double x, y, lunghezza, altezza;

    public Rettangolo (double x, double y, double lunghezza, double altezza)
    {
        this.x = x;
        this.y = y;
        this.lunghezza = lunghezza;
        this.altezza = altezza;
    }

    public void transla (double x, double y) 
    {
        this.x += x;
        this.y += y;     
    }	  

    public String toString ( )
    {
    	double x1 = x;
        double y1 = y + altezza;
        double x2 = x + lunghezza;
        double y2 = y;

        String s = "(" + x1 + ", " + y1 + ") -> (" + x2 + ", " + y2 + ")";
        return s;    
    }
}