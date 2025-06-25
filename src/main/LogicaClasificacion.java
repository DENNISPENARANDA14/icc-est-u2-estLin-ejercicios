package main;

import java.util.*;

public class LogicaClasificacion {

    /**
     * Invierte una cadena de texto utilizando una pila (Stack).
     *
     * @param texto Cadena original a invertir.
     * @return Cadena invertida.
     *
     *         Ejemplo:
     *         Entrada: "Hola Mundo"
     *         Salida: "odnuM aloH"
     */
    public String invertirCadena(String texto) {
        Stack<Character> pila = new Stack<>();
        for (char c : texto.toCharArray()) {
            pila.push(c);
        }

        StringBuilder invertida = new StringBuilder();
        while (!pila.isEmpty()) {
            invertida.append(pila.pop());
        }

        return invertida.toString();
    }

    /**
     * Verifica si los símbolos de paréntesis, corchetes y llaves están bien
     * balanceados.
     *
     * @param expresion Cadena con símbolos.
     * @return true si está balanceada, false en caso contrario.
     *
     *         Ejemplo:
     *         Entrada: "{[()]}"
     *         Salida: true
     */
    public boolean validarSimbolos(String expresion) {
        // mapa para relacionar los símbolos de apertura y cierre
        Map<Character, Character> simbolosCierreApertura = new HashMap<>();
        simbolosCierreApertura.put(')', '(');
        simbolosCierreApertura.put('}', '{');
        simbolosCierreApertura.put(']', '[');

        // Pila para almacenar los símbolos de apertura encontrados
        Stack<Character> pila = new Stack<>();

        // Recorrer la expresión carácter por carácter
        for (char caracter : expresion.toCharArray()) {

            if (caracter == '(' || caracter == '{' || caracter == '[') {
                pila.push(caracter);
            }

            else if (caracter == ')' || caracter == '}' || caracter == ']') {
                if (pila.isEmpty()) {
                    return false;
                }
                char simboloAperturaEsperado = simbolosCierreApertura.get(caracter);

                char simboloAperturaActual = pila.pop();

                if (simboloAperturaActual != simboloAperturaEsperado) {
                    return false;
                }
            }
            // Si el carácter no es un símbolo de apertura o cierre, simplemente lo ignoramos
        }

        // Al final, si la pila está vacía, todos los símbolos de apertura tuvieron su correspondiente cierre
        return pila.isEmpty();
    }

    /**
     * Ordena una pila de enteros en orden ascendente usando otra pila auxiliar.
     *
     * @return Lista ordenada.
     *
     *         Ejemplo:
     *         Entrada: [3, 1, 4, 2]
     *         Salida: [1, 2, 3, 4]
     */
    public List<Integer> ordenarPila(Stack<Integer> pila) {
        Stack<Integer> pilaAuxiliar = new Stack<>();

        while (!pila.isEmpty()) {

            int temp = pila.pop();

            while (!pilaAuxiliar.isEmpty() && pilaAuxiliar.peek() > temp) {
                pila.push(pilaAuxiliar.pop());
            }

            pilaAuxiliar.push(temp);
        }
        return pilaAuxiliar;
    }

    /**
     * Clasifica una lista de enteros separando pares e impares.
     * Usa LinkedList para mantener el orden de inserción.
     *
     * @return Lista con pares primero, luego impares.
     *
     *         Ejemplo:
     *         Entrada: [1, 2, 3, 4, 5, 6]
     *         Salida: [2, 4, 6, 1, 3, 5]
     */
    public List<Integer> clasificarPorParidad(LinkedList<Integer> original) {

        LinkedList<Integer> pares = new LinkedList<>();
        LinkedList<Integer> impares = new LinkedList<>();

        for (Integer numero : original) {

            if (numero % 2 == 0) {

                pares.add(numero);
            } else {

                impares.add(numero);
            }
        }

        pares.addAll(impares);

        return pares;
    }
}
