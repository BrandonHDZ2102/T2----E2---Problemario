
package problemariot2;

public class FalsaPosicion3 {
    // Función cuya raíz se desea encontrar
    public static double funcion(double x) {
        // Función: f(x) = x^3 - 6x^2 + 11x - 6
        return Math.pow(x, 3) - 6 * Math.pow(x, 2) + 11 * x - 6;
    }
    
    // Método de la falsa posición para encontrar la raíz
    public static double falsaPosicion(double a, double b, double tolerancia) {
        double c = 0;
        while (Math.abs(b - a) >= tolerancia) {
            // Calculando el punto intermedio c
            c = (a * funcion(b) - b * funcion(a)) / (funcion(b) - funcion(a));
            
            // Si f(c) es casi cero, entonces c es la raíz
            if (Math.abs(funcion(c)) < tolerancia) {
                break;
            }
            
            // Actualizando los valores de a y b
            if (funcion(c) * funcion(a) < 0) {
                b = c;
            } else {
                a = c;
            }
        }
        return c;
    }
    
    public static void main(String[] args) {
        // Valores iniciales del intervalo [a, b] y la tolerancia
        double a = 1;
        double b = 3;
        double tolerancia = 0.0001;
        
        // Llamando al método de falsa posición para encontrar la raíz
        double raiz = falsaPosicion(a, b, tolerancia);
        
        // Imprimiendo la raíz encontrada
        System.out.println("La raíz aproximada es: " + raiz);
    }
}
