
package problemariot2;

public class Biseccion3 {
    // Función cuya raíz se desea encontrar
    public static double funcion(double x) {
        // Función: f(x) = e^x - 2
        return Math.exp(x) - 2;
    }
    
    // Método de la bisección para encontrar la raíz
    public static double biseccion(double a, double b, double tolerancia) {
        double c = 0;
        while ((b - a) >= tolerancia) {
            // Calculando el punto medio c
            c = (a + b) / 2;
            
            // Si f(c) es casi cero, entonces c es la raíz
            if (Math.abs(funcion(c)) < tolerancia) {
                break;
            }
            
            // Actualizando los valores de a y b basado en el teorema del valor medio
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
        double a = 0;
        double b = 2;
        double tolerancia = 0.0001;
        
        // Llamando al método de la bisección para encontrar la raíz
        double raiz = biseccion(a, b, tolerancia);
        
        // Imprimiendo la raíz encontrada
        System.out.println("La raíz aproximada es: " + raiz);
    }
    

}
