package practica6;

public class Coche {
	
	/**
	 * Clase Coche
	 * Contiene informaci�n de cada coche (matr�cula, combustible, modelo y fabricante)
	 * Adem�s contiene los m�todos AtributosCoche, ConsumoCocheA, ConsumoCocheB y ConsumoCocheC
	 * @author Manuel Izquierdo Sosa
	 * @version 1.1
	 */
	
	/**
	 * Matr�cula del coche
	 */
	String matricula;
	/**
	 * Combustible que usa el coche 
	*/
	String combustible;
	/** 
	 * Modelo del coche 
	*/
	String modelo;
	/**
	 * Fabricante del coche
	 */
	String fabricante;

	/**
	 * Constructor
	 */
	public Coche() {
		
		matricula = "";
		combustible = "";
		modelo = "";
		fabricante = "";
	}
	/**
	 * Constructor con 4 par�metros
	 * @param m //matricula del coche
	 * @param c //combustible que usa el coche
	 * @param mo //modelo del coche
	 * @param f //fabricante del coche
	 */
	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		combustible = c;
		modelo = mo;
		fabricante = f;
	}
	/**
	 * M�todo AtributosCoche
	 * Describe los atributos de los coches dependiendo del tipo de combustible que utilizan
	 * @return <ul>
	 * 			  <li>"Gasolina": "El coche con matricula " + matricula + " " + ConsumoCocheA</li>
	 * 			  <li>"Diesel": "El coche con matricula " + matricula + " " + ConsumoCocheB</li>
	 * 			  <li>"H�brido": "El coche con matricula " + matricula + " " + ConsumoCocheC</li>
	 * 			  <li> Por defecto: "El coche con matricula " + matricula + " " + "no dispone de informaci�n"</li> 
	 * 		   </ul>
	 */
	public String AtributosCoche() {
		String resultado = "";
		String texto = "El coche con matricula ";
		
		return resultado;
	}
	/**
	 * M�todo ConsumoCocheA
	 * Define lo que gasta un coche en funci�n de su fabricante y modelo
	 * @param modelo modelo del coche
	 * @param fabricante fabricante del coche
	 * @return <p>"es un " + fabricante + modelo + " y gasta 1,337 euros por litro"</p>
	 */
	public String ConsumoCocheA(String modelo, String fabricante) {
		String resultado = "";
		resultado = "es un " + fabricante + modelo + " y gasta 1,337 euros por litro";
		return resultado;	
	}
	/**
	 * M�todo ConsumoCocheB
	 * Define lo que gasta un coche en funci�n de su fabricante y modelo
	 * @param modelo modelo del coche
	 * @param fabricante fabricante del coche
	 * @return <p>"es un " + fabricante + modelo + " y gasta 1,052 euros por litro"</p>
	 */
	public String ConsumoCocheB(String modelo, String fabricante) {
		String resultado = "";
		resultado = "es un " + fabricante + modelo + " y gasta 1,052 euros por litro";
		return resultado; 
	}
	/**
	 * M�todo ConsumoCocheC
	 * Define lo que gasta un coche en funci�n de su fabricante y modelo
	 * @param modelo modelo del coche
	 * @param fabricante fabricante del coche
	 * @return <p>"es un " + fabricante + modelo + " y no necesita combustible"</p>
	 */
	public String ConsumoCocheC(String modelo, String fabricante) {
		String resultado = "";
		resultado = "es un " + fabricante + modelo + " y no necesita combustible";
		return resultado;
	}
}
