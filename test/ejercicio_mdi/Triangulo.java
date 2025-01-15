package ejercicio_mdi;

public class Triangulo {
    //Triangulo rectangulo
    double base;
    double altura;
    
    Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    double calcular_area(){
        return base * altura / 2;
    }
    
    double calcular_hipotenusa(){
        return Math.pow(base * base + altura * altura, 0.5);
    }
    
    double calcular_perimetro(){
        return base + altura + calcular_hipotenusa();
    }
    
    String determinar_tipo(){
        if (base==altura && base==calcular_hipotenusa() && altura==calcular_hipotenusa()){
            return "Equilatero";
        }
        else if (base!=altura && base!=calcular_hipotenusa() && altura!=calcular_hipotenusa()){
            return "Escaleno";
        }
        else{
            return "Isoceles";
        }
    }
}