package examen;


/**
 * El autor es Marcos Domínguez, en la clase fracción guardará dentro más clases junto a dos variables llamadas num y den
 * @author mdominguez
 *
 */
// Clase que define una fracción
public class Fraccion {
	// Numerador
	private int num;
	/**
	 * Variable que hace referencia al numerador
	 */

	// Denominador
	private int den;
	/**
	 *  Variable que hará de denominador en esta clase
	 */
	// Constructor por defecto
	
	/**
	 * Dentro de Fracción, los valores num y den se fijan a 0 y 1 respectivamente
	 */
	
	public Fraccion() { // debe generar el valor neutro que es 0/1
		num = 0;
		den = 1;

	}

	// Constructor con parámetros
	/**
	 * La función pública fracción devuelve la fracción simplificada y evita fracciones con divisor 0
	 * @param num (Valor numerador)
	 * @param den (Valor denominador)
	 */
	
	public Fraccion(int num, int den) {
		// debo evitar crear fracciones con 0 en el divisor
		this.num = num;
		if (den == 0) {
			this.den = 1;
		}
		else {
			this.den = den;
		}
		// devuelvo la fracci�n simplificada
		simplificar();
	}

	// Constructor copia
	
	/**
	 * Esta pequeña función fija las variables num y dem con la nueva variable constante llamada f
	 * @param fraccion (Variable llamada f que es una constante)
	 */
	public Fraccion(final Fraccion fraccion) {
		num = fraccion.num;
		den = fraccion.den;
	}

	// getters y setters
	/**
	 *  Fijará en un void la variable num
	 * @param num (Variable que fija el número entero nuevo)
	 */
	
	public void setNum(int num) {
		this.num = num;

	}
	/**
	 * Crea una variable entera llamada getNum Hace que devuelva el valor de num
	 * @return
	 */
	public int getNum() {
		return num;

	}
	/**
	 * Fija la variable denominador a un número específico
	 * @param den
	 */
	public void setDen(int den) {
		this.den = den;
	}

	/**
	 * getDen() devuelve el resultado de den 
	 * @return
	 */
	public int getDen() {
		return den;
	}

	// Cálculo del máximo común divisor por el algoritmo de Euclides
	
	/**
	 * Esta función crea dos variables, que son los valores absolutos del numerador y denominador respectivamente, para calcular el mcd y lo devuelve
	 * @return
	 */
	private int maxComunDivisor() {
		int numeradorValAbs = Math.abs(num); // valor absoluto del numerador
		int valordenominador = Math.abs(den); // valor absoluto del denominador
		int resultado;
		while (valordenominador != 0) {
			resultado = numeradorValAbs % valordenominador;
			numeradorValAbs = valordenominador;
			valordenominador = resultado;
		}
		return numeradorValAbs;
	}

	// método para simplificar fracciones
	
	/**
	 * Simplifica num y den entre la variable n
	 */
	public void simplificar() {
		int numero = maxComunDivisor();
		num = num / numero;
		den = den / numero;
	}

	// Método toString
	/**
	 * Devuelve el String mensaje que es "(num) / (den)"
	 */
	public String toString() {
		String mensaje = extracted();
		return extracted(mensaje);

	}

	public String extracted(String mensaje) {
		return mensaje;
	}

	public String extracted() {
		String mensaje = num + "/" + den;
		return extracted(mensaje);
	}

	// suma de fracciones
	
	/**
	 * Suma las dos fracciones (con las variables num y den) y devuelve el resultado con una variable llamada aux que los calcula
	 * @param fraccion
	 * @return
	 */
	public Fraccion sumar(Fraccion fraccion) {
		Fraccion aux = new Fraccion();
		final int cruce1 = num * fraccion.den;
		final int cruce2 = den * fraccion.num;
		aux.num = cruce1 + cruce2;
		aux.den = den * fraccion.den;
		aux.simplificar();
		return aux;

	}

	// Restar fracciones
	/**
	 * Resta las fracciones den y num y los devuelve con aux, similar a Fraccion sumar
	 * @param fraccion
	 * @return
	 */
	
	public Fraccion restar(Fraccion fraccion) {
		Fraccion aux = new Fraccion();
		aux.num = num * fraccion.den - den * fraccion.num;
		aux.den = den * fraccion.den;
		aux.simplificar();
		return aux;

	}

//Multiplicar fracciones
	
	/**
	 * Multiplica las fracciones den y num y los devuelve con aux, similar a Fraccion sumar y restar
	 * @param fraccion
	 * @return
	 */

	public Fraccion multiplicar(Fraccion fraccion) {
		Fraccion aux = new Fraccion();
		aux.num = num * fraccion.num;
		aux.den = den * fraccion.den;
		aux.simplificar();
		return aux;

	}

//Dividir fracciones
	
	/**
	 * Divide las fracciones den y num y los devuelve con aux, similar a Fraccion sumar, restar y multiplicar
	 * @param fraccion
	 * @return
	 */


	public Fraccion dividir(Fraccion fraccion) {
		Fraccion aux = new Fraccion();
		aux.num = num * fraccion.den;
		aux.den = den * fraccion.num;
		aux.simplificar();
		return aux;

	}

}
