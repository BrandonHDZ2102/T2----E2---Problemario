
package problemariot2;

public class Secante5 {
     // Función cuya raíz se desea encontrar
    public static double funcion(double x) {
        // Función: f(x) = x^3 - 2x - 5
        return Math.pow(x, 3) - 2 * x - 5;
    }
    
    // Método de la secante para encontrar la raíz
    public static double secante(double x0, double x1, double tolerancia, int maxIteraciones) {
        double x2 = 0;
        int iteraciones = 0;
        
        while (iteraciones < maxIteraciones) {
            x2 = x1 - (funcion(x1) * (x1 - x0)) / (funcion(x1) - funcion(x0));
            
            // Si f(x2) es casi cero, entonces x2 es la raíz
            if (Math.abs(funcion(x2)) < tolerancia) {
                break;
            }
            
            // Actualizando los valores de x0 y x1 para la siguiente iteración
            x0 = x1;
            x1 = x2;
            
            iteraciones++;
        }
        
        return x2;
    }
    
    public static void main(String[] args) {
        // Valores iniciales y tolerancia
        double x0 = 1;
        double x1 = 2;
        double tolerancia = 0.0001;
        int maxIteraciones = 1000; // Máximo número de iteraciones
        
        // Llamando al método de la secante para encontrar la raíz
        double raiz = secante(x0, x1, tolerancia, maxIteraciones);
        
        // Imprimiendo la raíz encontrada
        System.out.println("La raíz aproximada es: " + raiz);
    }
    
}
