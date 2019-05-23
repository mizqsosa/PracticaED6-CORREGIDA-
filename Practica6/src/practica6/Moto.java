package practica6;

/**
* Clase Moto
* Contiene informaci�n de cada moto (matr�cula, cilindrada)
* Adem�s contiene los getter y setters correspondientes
* @author Manuel Izquierdo Sosa
* @version 1.1
*/
public class Moto {
	/**
	 * matr�cula de la moto
	 */
	String matricula;
	/**
	 * cilindrada de la moto
	 */
	int cilindrada;
	/**
	 * Constructor
	 */
	public Moto() {
		matricula = "";
		cilindrada = 0;
	}
	/**
	 * Constructor con 2 par�metros
	 * @param m //matr�cula de la moto
	 * @param c //cilindrada de la moto
	 */
	public Moto(String m, int c) {
		matricula = m;
		cilindrada = c;
	}
	/**
	 * @return matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * @return cilindrada
	 */
	public int getCilindrada() {
		return cilindrada;
	}
	/**
	 * @param m //Cambia matricula
	 */
	public void setMatricula(String m) {
		matricula = m;
	}
	/**
	 * @param c //Cambia cilindrada
	 */
	public void setCilindrada(int c) {
		cilindrada = c;
	}
}
