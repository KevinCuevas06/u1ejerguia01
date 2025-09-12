/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u1ejerguia01_fernandovegaykevincuevas;

/**
 *
 * @author Mr.Robot
 */
public class U1EJERGUIA01_FernandoVegaYKevinCuevas {

    public static void main(String[] args) {
        int numero = 5;
        System.out.println("Factorial de " + numero + " = " + factorial(numero));

    int numero1 = 1234;
      System.out.println("Suma de dígitos de " + numero + " = " + sumaDigitos(numero1));

        String texto = "hola";
        System.out.println("Texto invertido = " + invertir(texto));

        int numero2 = 6;
        System.out.println("Fibonacci de " + numero + " = " + fibonacci(numero2));

           int base = 2, exponente = 5;
           System.out.println(base + "^" + exponente + " = " + potencia(base, exponente));
    }
    
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * (factorial(n - 1));
        }
    }
    
    public static int sumaDigitos(int n) {
        if (n == 0) {
            return 0;
        } else {
        return (n % 10) + (sumaDigitos(n /10));
        }
    }
    
    public static String invertir(String s) {
        if (s.length() <= 1) {
            return s;
        } else {
            return invertir(s.substring(1)) + s.charAt(0);
        }
    }

    
    public static int fibonacci(int n) {
    if (n <= 1) {
            return n;
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
 }
    
    public static int potencia(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * potencia(a, b - 1);
        }
 }
}