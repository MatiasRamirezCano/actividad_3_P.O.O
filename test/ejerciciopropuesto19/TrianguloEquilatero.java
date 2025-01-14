package ejerciciopropuesto19;

public class TrianguloEquilatero {
    
    static double obtener_perimetro(double lado){
        double perimetro = 3 * lado;
        return perimetro;
    }
    
    static double obtener_altura(double lado){
        double altura = lado * Math.sqrt(3) / 2;
        return altura;
    }
    
    static double obtener_area(double lado){
        double area = Math.pow(lado, 2) * Math.sqrt(3) / 4;
        return area;
    }
    
}