import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Operaciones {

	
	public int multiplicacion(int x, int y) {
		return x*y;
	}
	
	public int resta(int x, int y){
		return x-y;
	}
	
	public String concatenar(String pal1, String pal2, String pal3) {
		return pal1+pal2+pal3;
	}
	
	public Date ConvertirTextoaFecha(String fechatexto) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			String ano, mes, dia;
			ano = fechatexto.substring(0, 4);
			mes = fechatexto.substring(4, 6);
			dia = fechatexto.substring(6, 8);
			String fechadef = ano+"/"+mes+"/"+dia;
            Date fechaconv = formatter.parse(fechadef);
            return fechaconv;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }

		
	}
	
}
