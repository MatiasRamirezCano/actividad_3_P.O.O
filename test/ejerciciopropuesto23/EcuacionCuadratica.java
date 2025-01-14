package ejerciciopropuesto23;

public class EcuacionCuadratica {
    
    public static Double calcular_solucion_1(double a, double b, double c){
        double discriminante = Math.pow(b, 2) - (4 * a * c);
        
        if (discriminante >= 0){
            return ((-1) * b + Math.sqrt(discriminante)) / (2 * a);
        }
        else{
            return null;
        }
    }
    
    public static Double calcular_solucion_2(double a, double b, double c){
        double discriminante = Math.pow(b, 2) - (4 * a * c);
        
        if (discriminante >= 0){
            return ((-1) * b - Math.sqrt(discriminante)) / (2 * a);
        }
        else{
            return null;
        }
    }
      
}