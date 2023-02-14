package ordenacion;

/**
 *Esta clase contiene los métodos y atributos para ordenar arrays de números enteros
 * @author Juan Simón
 *
 */
public class Ordenacion {

/** Método para ordenar un array de números enteros de manera ascendente
 * @see #intercambiar(int[], int, int) intercambiar
 * @see #imprimirArray(int[]) imprimirArray
 */
        public void ordenarArray(int[] array) {
            for (int i = array.length - 1; i > 0; i--) {
                int maxValue = 0;
                for (int j = 0; j < i; j++) {
                    if (array[j + 1] > array[maxValue]) {
                        maxValue = j + 1;
                    }
                }
                intercambiar(array, i, maxValue);
                imprimirArray(array);
            }
        }
/** Método para ordenar un segundo array de números enteros de manera ascendente
 * @return regresa los números ordenados
 */
        public int[] ordenarArray2(int[] numbers) {
            for (int i=0; i < numbers.length - 1;i++) {
                for (int j=i+1;j<numbers.length;j++) {
                    if (numbers[i]>numbers[j]) {
                        int auxiliar=numbers[i];
                        numbers[i]=numbers[j];
                        numbers[j]=auxiliar;
                    }
                }
            }
            return numbers;
        }
/** Método para imprimir el array
 * @return imprime el array
 */
        public void imprimirArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.printf("%d \t", array[i]);
            }
            System.out.println();
        }
/** Método para intercambiar valores en los arrays */
        public void intercambiar(int[] array, int a, int b) {
            int value = array[b];
            array[b] = array[a];
            array[a] = value;
        }
    }





