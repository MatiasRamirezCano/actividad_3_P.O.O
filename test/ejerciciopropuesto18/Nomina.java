package ejerciciopropuesto18;

public class Nomina {
    
    static double calcular_bruto(double horas_trabajadas, double valor_hora){
        double salario_bruto = horas_trabajadas * valor_hora;
        return salario_bruto;
    }
    
    static double calcular_neto(double horas_trabajadas, double valor_hora, double retencion){
        double salario_bruto = calcular_bruto(horas_trabajadas, valor_hora);
        double salario_neto = salario_bruto - (salario_bruto * retencion / 100);
        return salario_neto;
    }
}