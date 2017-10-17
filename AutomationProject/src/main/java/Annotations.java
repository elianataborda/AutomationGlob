import java.util.Date;
import org.testng.annotations.*;
import org.testng.asserts.*;


public class Annotations {
	
	@DataProvider(name="test1")
	public Object[][] createData1(){
		return new Object[][] {
			/*{4,5, 20},
			{6,8, 48},*/
			{new Integer(2), new Integer(3)},
			{new Integer(4), new Integer(5)},
			{new Integer(6), new Integer(7)}
		};
		
	}
	@DataProvider(name="test2")
	public Object[][] createData2(){
		return new Object[][] {
			/*{"Mary ", "tiene ", "un corderito"},
			{"En la ", "granja habia ", "un caballo"},*/
			{new String("Mary "), new String("tiene "), new String("un corderito")},
			{new String("En la "), new String("granja habia"), new String("un caballo")},
		};
		
	}
	
	@DataProvider(name="test3")
	public Object[][] createData3(){
		return new Object[][] {
			/*{26, 8, 18},
			{45, 20, 25},*/
			{new Integer(8), new Integer(9)},
			{new Integer(10), new Integer(11)},
			{new Integer(12), new Integer(13)}
		};
		
	}
	
	@DataProvider(name="test4")
	public Object[][] createData4(){
		return new Object[][] {
			{new String("19890930"), new String("1989/09/30")},
			{new String("19820521"), new String("1982/05/21")},
		};
		
	}
	
	
	 public static void main (String[] args) {
		 Operaciones operadores1 = new Operaciones();
		 Operaciones operadores2 = new Operaciones();
		 Operaciones operadores3 = new Operaciones();
		 Operaciones operadores4 = new Operaciones();	
		 
		 		 
		@Test(dataProvider = "test1")
		 System.out.println(operadores1.multiplicacion(Integer f1, Integer n1));
		 
		@Test(dataProvider = "test3")
		 System.out.println(operadores2.resta(int n3, int n4));
		 
		@Test(dataProvider = "test2")
		 System.out.println(operadores3.concatenar(String f1, String f2, String f3));
		 
		@Test(dataProvider = "test4")
		 System.out.println(operadores4.ConvertirTextoaFecha(String f6));
			 

	 }
}
