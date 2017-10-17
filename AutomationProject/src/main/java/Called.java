import java.util.Date;
import java.util.Scanner;

public class Called {
	
		public int multiplicar() {
		 Operaciones op1 = new Operaciones();
		//llamado a multiplicación de dos números
		 System.out.println("Ingrese dos números enteros: ");
		 String numero1="";
		 String numero2="";
		 System.out.println("Primer número: ");
		 Scanner numeroesc1 = new Scanner(System.in);
		 numero1 = numeroesc1.nextLine();
		 System.out.println("Segundo número: ");
		 Scanner numeroesc2 = new Scanner(System.in);
		 numero2 = numeroesc2.nextLine();
		 
		 int n1, n2, resultado; 
		 		
		 n1 = Integer.parseInt(numero1);
		 n2 = Integer.parseInt(numero2);
		 
		 resultado = op1.multiplicacion(n1, n2);
		 
		
		 		 
		 numeroesc1.close();
		 numeroesc2.close();
		 
		 return resultado;
		
	}
	
	
	public int restar() {
		 Operaciones op1 = new Operaciones();
		//llamado a la resta de dos números
		 System.out.println("Ingrese dos números enteros: ");
		 String numero1="";
		 String numero2="";
		 System.out.println("Primer número: ");
		 Scanner numeroesc1 = new Scanner(System.in);
		 numero1 = numeroesc1.nextLine();
		 System.out.println("Segundo número: ");
		 Scanner numeroesc2 = new Scanner(System.in);
		 numero2 = numeroesc2.nextLine();
		 
		 int n1, n2, resultado; 
		
		 n1 = Integer.parseInt(numero1);
		 n2 = Integer.parseInt(numero2);
		 
		 resultado = op1.resta(n1, n2);
		 
		 //System.out.println("El resultado de la multiplicación es: "+resultado);
		 		 
		 numeroesc1.close();
		 numeroesc2.close();
		 
		 return resultado;
	}
	
	
	public String concatenacion() {
		Operaciones op2 = new Operaciones();
		 //LLamado a la concatenación de cadenas: 
		 String palabra1 = "";
		 String palabra2 = "";
		 String palabra3 = "";
		 Scanner palesc1 = new Scanner(System.in);
		 Scanner palesc2 = new Scanner(System.in);
		 Scanner palesc3 = new Scanner(System.in);
		 System.out.println("Ingrese la primera palabra: ");
		 palabra1 = palesc1.nextLine();
		 System.out.println("Ingrese la Segunda palabra: ");
		 palabra2 = palesc2.nextLine();
		 System.out.println("Ingrese la tercera palabra: ");
		 palabra3 = palesc3.nextLine();
		 
		 String cadena="";
		 cadena = op2.concatenar(palabra1, palabra2, palabra3);
		 //System.out.println(cadena);
		 palesc1.close();
		 palesc2.close();
		 palesc3.close();
		 return cadena;
	}
	
	
	public Date fechasdat() {
		Operaciones op3 = new Operaciones();
		//formato fecha
		 String fecha="";
		 Scanner fechaesc= new Scanner(System.in);
		 System.out.println("Ingrese la fecha: ");
		 fecha = fechaesc.nextLine();
		 
		 Date fecharet = new Date();
		 fecharet = op3.ConvertirTextoaFecha(fecha);	 
		 //System.out.println(fecharet);
				
		 fechaesc.close();
		 
		 return fecharet;
	}

}
