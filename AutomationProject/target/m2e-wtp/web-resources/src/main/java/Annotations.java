import java.util.Date;
import org.testng.annotations.*;


public class Annotations {
	
	@DataProvider(name="test1")
	public Object[][] createData1(){
		return new Object[][] {
			
			
		}
		
	}
	
	
	
	 public static void main (String[] args) {
		 Called operadores1 = new Called();
		 Called operadores2 = new Called();
		 Called operadores3 = new Called();
		 Called operadores4 = new Called();		 
		 
		 int w, z;
		 String phrase;
		 Date fet;
		 
		
		 w = operadores1.multiplicar();
		 System.out.println(w);
		 
		 z = operadores2.restar();
		 System.out.println(z);
		 
		 phrase = operadores3.concatenacion();
		 System.out.println(phrase);
		 
		 fet = operadores4.fechasdat();
		 System.out.println(fet);
			 

	 }
}
