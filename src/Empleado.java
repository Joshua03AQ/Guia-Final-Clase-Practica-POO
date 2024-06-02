 abstract class Empleado {

    private String nombre;
    private String NumIdentificacion;
    private String NumCelular;
    private String areaLaboral;
    private String tipoEmpleo;

    public Empleado(String nombre, String NumIdentificacion, String NumCelular, String areaLaboral, String tipoEmpleo){
        this.nombre = nombre;
        this.NumIdentificacion = NumIdentificacion;
        this.NumCelular = NumCelular;
        this.areaLaboral = areaLaboral;
        this.tipoEmpleo = tipoEmpleo;
    }

    public String getNombre(){
        return nombre;
    }

    public String setNombre(String nombre){
        return this.nombre = nombre;
    }

    public String getNumIdentificacion(){
        return NumIdentificacion;
    }

    public String setNumIdentificacion(String NumIdentificacion){
        return this.NumIdentificacion = NumIdentificacion;
    }

    public String getNumCelular(){
        return NumCelular;
    }

    public String setNumCelular(String NumCelular){
        return this.NumCelular = NumCelular;
    }

    public String getAreaLaboral(){
        return areaLaboral;
    }

    public String setAreaLaboral(String areaLaboral){
        return this.areaLaboral = areaLaboral;
    }

    public String getTipEmpleo(){
        return tipoEmpleo;
    }

    public String setTipEmpleo(String tipoEmpleo){
        return this.tipoEmpleo = tipoEmpleo;
    }

    // Metodo abstracto
    public abstract double calcularSalario();
}
