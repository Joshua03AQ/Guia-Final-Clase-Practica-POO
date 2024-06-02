public class EmpleadoTiempoCompleto extends Empleado{

    private double SalarioAnual;

    public EmpleadoTiempoCompleto(String nombre, String NumIdentificacion,String NumCelular,String areaLaboral,
    String tipoEmpleo, double SalarioAnual ){

        super(nombre, NumIdentificacion, NumCelular, areaLaboral, tipoEmpleo);
        this.SalarioAnual = SalarioAnual;
    }

    @Override
    public double calcularSalario() {
        return SalarioAnual / 12;// Salario mensual
    }
}
