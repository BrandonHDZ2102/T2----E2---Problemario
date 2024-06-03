# T2----E2---Problemario

## Integrantes:
- Brandon Hernández Espinosa
- Italia Yoselin Lozada Olvera



## Método De falsa posición:
### Descripción: 

En métodos numéricos, el método de falsa posición se utiliza para encontrar las raíces de una ecuación no lineal. Este método combina la idea del método de bisección con la interpolación lineal para aproximar la raíz.
### Pseudocódigo 
```

Función falsa_posicion(f, a, b, tol, max_iter):
    Si f(a) * f(b) >= 0, imprimir error y terminar
    i = 1
    Mientras i <= max_iter:
        c = (a * f(b) - b * f(a)) / (f(b) - f(a))
        Si f(c) == 0 o (b - a) / 2 < tol, retornar c
        Si f(c) * f(a) < 0, b = c
        Sino, a = c
        i = i + 1
    Imprimir error de convergencia y retornar



```


### Implementación 
- Implementación en C#:

```
 using System;

class Program
{
    static double F(double x)
    {
        // Define la función f(x) para la ecuación no lineal
        return Math.Pow(x, 3) - 2 * x - 5;
    }

    static double FalsaPosicion(Func<double, double> f, double a, double b, double tol, int maxIter)
    {
        if (f(a) * f(b) >= 0)
        {
            Console.WriteLine("Error: Los valores iniciales deben tener signos opuestos.");
            return double.NaN; // Retornar NaN (Not a Number) para indicar error
        }

        int i = 1;
        double c = 0;
        while (i <= maxIter)
        {
            c = (a * f(b) - b * f(a)) / (f(b) - f(a));
            if (f(c) == 0 || Math.Abs(b - a) / 2 < tol)
                return c;

            if (f(c) * f(a) < 0)
                b = c;
            else
                a = c;

            i++;
        }

        Console.WriteLine("Error: No se logró converger en el número máximo de iteraciones.");
        return double.NaN;
    }

    static void Main(string[] args)
    {
        // Valores iniciales y parámetros del método
        double a = 2.0; // Extremo izquierdo del intervalo
        double b = 3.0; // Extremo derecho del intervalo
        double tol = 0.0001; // Tolerancia
        int maxIter = 100; // Número máximo de iteraciones

        // Llamar al método de falsa posición
        double raiz = FalsaPosicion(F, a, b, tol, maxIter);

        // Imprimir resultado
        Console.WriteLine($"La raíz aproximada es: {raiz}");
    }
}

```


### Ejemplos en java:

[Ejemplo 1](https://github.com/BrandonHDZ2102/T2----E2---Problemario/blob/main/ProblemarioT2/src/problemariot2/FalsaPosicion1.java)

[Ejemplo 2](https://github.com/BrandonHDZ2102/T2----E2---Problemario/blob/main/ProblemarioT2/src/problemariot2/FalsaPosicion2.java)

[Ejemplo 3](https://github.com/BrandonHDZ2102/T2----E2---Problemario/blob/main/ProblemarioT2/src/problemariot2/FalsaPosicion3.java)

[Ejemplo 4](https://github.com/BrandonHDZ2102/T2----E2---Problemario/blob/main/ProblemarioT2/src/problemariot2/FalsaPosicion4.java)

[Ejemplo 5](https://github.com/BrandonHDZ2102/T2----E2---Problemario/blob/main/ProblemarioT2/src/problemariot2/FalsaPosicion5.java)




------------------------------------------------------------------------------------------

## Método De Biseccion:
### Descripción: 

En métodos numéricos, el método de bisección se utiliza para encontrar las raíces de una ecuación. Este método se basa en el teorema del valor intermedio y es especialmente útil cuando la función es continua en un intervalo y cambia de signo en los extremos de dicho intervalo.

### Pseudocódigo 

```

Función biseccion(f, a, b, tol, max_iter):
    Si f(a) * f(b) >= 0, imprimir error y terminar
    i = 1
    Mientras i <= max_iter:
        c = (a + b) / 2
        Si f(c) == 0 o (b - a) / 2 < tol, retornar c
        Si f(c) * f(a) < 0, b = c
        Sino, a = c
        i = i + 1
    Imprimir error de convergencia y retornar



```


### Implementación 
- Implementación en C#:
```
using System;

class Program
{
    static double F(double x)
    {
        // Define la función f(x) para la ecuación
        return Math.Pow(x, 3) - 2 * x - 5;
    }

    static double Biseccion(Func<double, double> f, double a, double b, double tol, int maxIter)
    {
        if (f(a) * f(b) >= 0)
        {
            Console.WriteLine("Error: Los valores iniciales deben tener signos opuestos.");
            return double.NaN; // Retornar NaN (Not a Number) para indicar error
        }

        int i = 1;
        double c = 0;
        while (i <= maxIter)
        {
            c = (a + b) / 2;
            if (f(c) == 0 || Math.Abs(b - a) / 2 < tol)
                return c;

            if (f(c) * f(a) < 0)
                b = c;
            else
                a = c;

            i++;
        }

        Console.WriteLine("Error: No se logró converger en el número máximo de iteraciones.");
        return double.NaN;
    }

    static void Main(string[] args)
    {
        // Valores iniciales y parámetros del método
        double a = 2.0; // Extremo izquierdo del intervalo
        double b = 3.0; // Extremo derecho del intervalo
        double tol = 0.0001; // Tolerancia
        int maxIter = 100; // Número máximo de iteraciones

        // Llamar al método de bisección
        double raiz = Biseccion(F, a, b, tol, maxIter);

        // Imprimir resultado
        Console.WriteLine($"La raíz aproximada es: {raiz}");
    }
}

```


### Ejemplos en java:

[Ejemplo 1](https://github.com/BrandonHDZ2102/T2----E2---Problemario/blob/main/ProblemarioT2/src/problemariot2/Biseccion1.java)

[Ejemplo 2](https://github.com/BrandonHDZ2102/T2----E2---Problemario/blob/main/ProblemarioT2/src/problemariot2/Biseccion2.java)

[Ejemplo 3](https://github.com/BrandonHDZ2102/T2----E2---Problemario/blob/main/ProblemarioT2/src/problemariot2/Biseccion3.java)

[Ejemplo 4](https://github.com/BrandonHDZ2102/T2----E2---Problemario/blob/main/ProblemarioT2/src/problemariot2/Biseccion4.java)

[Ejemplo 5](https://github.com/BrandonHDZ2102/T2----E2---Problemario/blob/main/ProblemarioT2/src/problemariot2/Biseccion5.java)




------------------------------------------------------------------------------------------

## Método De La Secante:
### Descripción: 

En métodos numéricos, el método de la secante es un método iterativo para encontrar raíces de una función real. A diferencia del método de Newton, el método de la secante no requiere el cálculo de derivadas y utiliza una aproximación de la derivada mediante una secante entre dos puntos cercanos.

### Pseudocódigo 

```

Función secante(f, x0, x1, tol, max_iter):
    i = 2
    Mientras i <= max_iter:
        x2 = x1 - f(x1) * (x1 - x0) / (f(x1) - f(x0))
        Si |x2 - x1| < tol, retornar x2
        x0 = x1
        x1 = x2
        i = i + 1
    Imprimir error de convergencia y retornar


```


### Implementación 
- Implementación en C#:
```
using System;

class Program
{
    static double F(double x)
    {
        // Define la función f(x) para la ecuación
        return Math.Pow(x, 3) - 2 * x - 5;
    }

    static double Secante(Func<double, double> f, double x0, double x1, double tol, int maxIter)
    {
        int i = 2;
        double x2 = 0;
        while (i <= maxIter)
        {
            x2 = x1 - f(x1) * (x1 - x0) / (f(x1) - f(x0));
            if (Math.Abs(x2 - x1) < tol)
                return x2;

            x0 = x1;
            x1 = x2;
            i++;
        }

        Console.WriteLine("Error: No se logró converger en el número máximo de iteraciones.");
        return double.NaN;
    }

    static void Main(string[] args)
    {
        // Valores iniciales y parámetros del método
        double x0 = 2.0; // Punto inicial 1
        double x1 = 3.0; // Punto inicial 2
        double tol = 0.0001; // Tolerancia
        int maxIter = 100; // Número máximo de iteraciones

        // Llamar al método de la secante
        double raiz = Secante(F, x0, x1, tol, maxIter);

        // Imprimir resultado
        Console.WriteLine($"La raíz aproximada es: {raiz}");
    }
}


```


### Ejemplos en java:

[Ejemplo 1](https://github.com/BrandonHDZ2102/T2----E2---Problemario/blob/main/ProblemarioT2/src/problemariot2/Secante1.java)

[Ejemplo 2](https://github.com/BrandonHDZ2102/T2----E2---Problemario/blob/main/ProblemarioT2/src/problemariot2/Secante2.java)

[Ejemplo 3](https://github.com/BrandonHDZ2102/T2----E2---Problemario/blob/main/ProblemarioT2/src/problemariot2/Secante3.java)

[Ejemplo 4](https://github.com/BrandonHDZ2102/T2----E2---Problemario/blob/main/ProblemarioT2/src/problemariot2/Secante4.java)

[Ejemplo 5](https://github.com/BrandonHDZ2102/T2----E2---Problemario/blob/main/ProblemarioT2/src/problemariot2/Secante5.java)




------------------------------------------------------------------------------------------

## Método De Newton-Raphson:
### Descripción: 

El método de Newton-Raphson es un método iterativo para encontrar aproximaciones de las raíces de una función real. Es particularmente eficiente cuando se parte de una buena aproximación inicial de la raíz.

### Pseudocódigo 

```

Función newton_raphson(f, df, x0, tol, max_iter):
    i = 1
    Mientras i <= max_iter:
        x1 = x0 - f(x0) / df(x0)
        Si |x1 - x0| < tol, retornar x1
        x0 = x1
        i = i + 1
    Imprimir error de convergencia y retornar


```


### Implementación 
- Implementación en C#:
```
using System;

class Program
{
    static double F(double x)
    {
        // Define la función f(x) para la ecuación
        return Math.Pow(x, 3) - 2 * x - 5;
    }

    static double DF(double x)
    {
        // Define la derivada de f(x)
        return 3 * Math.Pow(x, 2) - 2;
    }

    static double NewtonRaphson(Func<double, double> f, Func<double, double> df, double x0, double tol, int maxIter)
    {
        int i = 1;
        double x1 = 0;
        while (i <= maxIter)
        {
            x1 = x0 - f(x0) / df(x0);
            if (Math.Abs(x1 - x0) < tol)
                return x1;

            x0 = x1;
            i++;
        }

        Console.WriteLine("Error: No se logró converger en el número máximo de iteraciones.");
        return double.NaN;
    }

    static void Main(string[] args)
    {
        // Valores iniciales y parámetros del método
        double x0 = 2.0; // Aproximación inicial de la raíz
        double tol = 0.0001; // Tolerancia
        int maxIter = 100; // Número máximo de iteraciones

        // Llamar al método de Newton-Raphson
        double raiz = NewtonRaphson(F, DF, x0, tol, maxIter);

        // Imprimir resultado
        Console.WriteLine($"La raíz aproximada es: {raiz}");
    }
}

```


### Ejemplos en java:

[Ejemplo 1](https://github.com/BrandonHDZ2102/T2----E2---Problemario/blob/main/ProblemarioT2/src/problemariot2/NewtonRaphson1.java)

[Ejemplo 2](https://github.com/BrandonHDZ2102/T2----E2---Problemario/blob/main/ProblemarioT2/src/problemariot2/NewtonRaphson2.java)

[Ejemplo 3](https://github.com/BrandonHDZ2102/T2----E2---Problemario/blob/main/ProblemarioT2/src/problemariot2/NewtonRaphson3.java)

[Ejemplo 4](https://github.com/BrandonHDZ2102/T2----E2---Problemario/blob/main/ProblemarioT2/src/problemariot2/NewtonRaphson4.java)

[Ejemplo 5](https://github.com/BrandonHDZ2102/T2----E2---Problemario/blob/main/ProblemarioT2/src/problemariot2/NewtonRaphson5.java)


------------------------------------------------------------------------------------------
