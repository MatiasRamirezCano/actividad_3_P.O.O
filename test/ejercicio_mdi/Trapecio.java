package ejercicio_mdi;

public class Trapecio {
    //TRAPECIO ISOCELES
    static double calcular_area(double base_mayor, double base_menor, double lado){
        double base_pitagoras = (base_mayor - base_menor) / 2;
        double altura = Math.pow(lado * lado - base_pitagoras * base_pitagoras, 0.5);
        return (base_mayor + base_menor) * altura / 2;
    }
    
    static double calcular_perimetro(double base_mayor, double base_menor, double lado){
        return 2 * lado + base_mayor + base_menor;
    }
}