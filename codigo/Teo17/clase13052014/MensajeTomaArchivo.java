import java.io.Serializable;

public class MensajeTomaArchivo implements Serializable{
	public String nombreArchivo;
	public boolean ultimoMensaje = true;
	public int bytesValidos=0;
	public byte[] contenidoArchivo = new byte[LONGITUD_MAXIMA];
	public final static int LONGITUD_MAXIMA = 10; 
}