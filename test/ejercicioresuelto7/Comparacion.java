package ejercicioresuelto7;

public class Comparacion {
    
    public static String comparar(double a, double b){
        if (a>b){
            return "A es mayor que B";
        }
        else if (a==b){
            return "A es igual B";
        }
        else {
            return "A es menor que B";
        }
    }
}