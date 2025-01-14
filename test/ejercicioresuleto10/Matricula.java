package ejercicioresuleto10;

public class Matricula {
    int numero_inscripcion;
    String nombre;
    double patrimonio;
    int estrato;
    double pago_matricula;
    
    public Matricula(int numero_inscripcion, String nombre, double patrimonio, int estrato){
        
        this.numero_inscripcion = numero_inscripcion;
        this.nombre = nombre;
        this.patrimonio = patrimonio;
        this.estrato = estrato;
        calcular_pago_matricula(patrimonio, estrato);
        
    }
    
    public void calcular_pago_matricula(double patrimonio, int estrato){
        pago_matricula = 50000;
        if (patrimonio>2000000 && estrato>3){
            pago_matricula = pago_matricula + (0.03 * patrimonio);
        }
    }  

    public double getPago_matricula() {
        return pago_matricula;
    }
    
}