
package problemariot2;

public class NewtonRaphson4 {
    // Función cuya raíz se desea encontrar
    public static double funcion(double x) {
        // Función: f(x) = x^3 - 3x - 5
        return Math.pow(x, 3) - 3 * x - 5;
    }
    
    // Derivada de la función
    public static double derivada(double x) {
        // Derivada: f'(x) = 3x^2 - 3
        return 3 * Math.pow(x, 2) - 3;
    }
    
    // Método de Newton-Raphson para encontrar la raíz
    public static double newtonRaphson(double x0, double tolerancia, int maxIteraciones) {
        double x1 = 0;
        int iteraciones = 0;
        
        while (iteraciones < maxIteraciones) {
            x1 = x0 - (funcion(x0) / derivada(x0));
            
            // Si f(x1) es casi cero, entonces x1 es la raíz
            if (Math.abs(funcion(x1)) < tolerancia) {
                break;
            }
            
            // Actualizando el valor de x0 para la siguiente iteración
            x0 = x1;
            
            iteraciones++;
        }
        
        return x1;
    }
    
    public static void main(String[] args) {
        // Valor inicial y tolerancia
        double x0 = 2;
        double tolerancia = 0.0001;
        int maxIteraciones = 1000; // Máximo número de iteraciones
        
        // Llamando al método de Newton-Raphson para encontrar la raíz
        double raiz = newtonRaphson(x0, tolerancia, maxIteraciones);
        
        // Imprimiendo la raíz encontrada
        System.out.println("La raíz aproximada es: " + raiz);
    }
    
}

