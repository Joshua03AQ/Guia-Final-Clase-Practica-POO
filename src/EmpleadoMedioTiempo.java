public class EmpleadoMedioTiempo extends Empleado{

    private double salarioPorHora;
    private int horasTrabajadasPorSemana;
    

    public EmpleadoMedioTiempo(String nombre, String NumIdentificacion,String NumCelular, String areaLaboral,
     String tipoEmpleo, double salarioPorHora, int horasTrabajadasPorSemana){

        super(nombre, NumIdentificacion, NumCelular, areaLaboral, tipoEmpleo);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadasPorSemana = horasTrabajadasPorSemana;
        
    }

    @Override
    public double calcularSalario() {
        return salarioPorHora * horasTrabajadasPorSemana * 4;// Salario mensual
    }

}
