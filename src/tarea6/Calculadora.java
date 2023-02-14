package tarea6;

/**
 *Esta clase contiene los métodos y atributos de un calcualdora sencilla
 * @author Juan Simón
 *
 */
public class Calculadora {

    public Calculadora(){

    }
/**
 * Método para sumar dos números enteros
 * @return Regresa la suma de los dos números enteros
 */
    public int suma(int num1,int num2){
        return num1+num2;
    }
/** Método para restar dos números enteros
 * @return Regresa la resta de los dos números enteros
 */
    public int resta(int num1,int num2){
        return num1-num2;
    }
/** Método para la multiplicación de dos números enteros
 * @return Regresa la multiplicación de los dos números enteros
 */
    public int multiplica(int num1,int num2){
        return num1*num2;
    }
/** Método para la división de dos números enteros
 * @return Regresa la división de los dos números enteros
 * @throws ArithmeticException el mensaje de error de la división entre cero
 */
    public int divide(int num1,int num2){
        if (num2==0) throw new ArithmeticException("NO PUEDES DIVIDIR POR CERO, MELON");
        return num1/num2;
    }
/** Declaración de variables y sus tipos
 * @param valor1 primer número entero
 * @param valor2 segundo número entero
 */
    private int valor1;
    private int valor2;
}



