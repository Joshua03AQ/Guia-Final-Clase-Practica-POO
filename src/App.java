public class App {
    public static void main(String[] args) throws Exception {

        Empleado[] empleados = new Empleado[2];
        
        empleados[0] = new EmpleadoTiempoCompleto("Randall", "222444666", "86386175",
         "Mercadotecnia", "Tiempo Completo", 40000.00);

        empleados[1] = new EmpleadoMedioTiempo("Ather", "2024-1348U","87048287",
         "Contabilidad", "Medio Tiempo", 400, 12);

         // Ciclo foreach
        for (Empleado empleado : empleados) {
            System.out.println("Empleado: " + empleado.getNombre() + ", Salario mensual: $"+empleado.calcularSalario());
        } 
        
        //ciclo fori
        for (int i = 0; i < empleados.length; i++) {
            System.out.println();
            System.out.println("Empleado: " + empleados[i].getNombre()+ ", Area Laboral: "+empleados[i].getAreaLaboral()
            +", Tipo de empleo: "+empleados[i].getTipEmpleo()+", Salario mensual: $"+empleados[i].calcularSalario());
        }
    }
}
