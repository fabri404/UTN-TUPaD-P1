//Adriel Lopez

class Empleado {
    
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;
    
    public Empleado(int id, String nombre, String puesto,double salario){
        totalEmpleados ++; //totalEmpleados = totalEmpleados + 1;

        this.id= id;
        this.nombre= nombre;
        this.puesto= puesto;
        this.salario =salario;
    }
    
    public Empleado(String nombre, String puesto) {
        this.id = ++totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 2000;
    } 
    
    
    public void actualizarSalario(double aumento){
        this.salario += this.salario * (aumento/100);
    }
    
    public void actualizarSalario(int aumentoFijo) {
        this.salario += aumentoFijo;
    }
    
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

        
    @Override
    public String toString() {
        return "\nInformacion empleados:\n " +
                " id=" + id + 
                " nombre=" + nombre + 
                " puesto=" + puesto + 
                " salario=" + salario;
    }
    
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getPuesto() { return puesto; }
    public double getSalario() { return salario; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    public void setSalario(double salario) { this.salario = salario; }
    
}

public class Unidad4POO {
    
    public static void main(String[] args) {
    
        Empleado emple01 = new Empleado(01,"Adriel","QA Tester", 1900.75);
        Empleado emple02 = new Empleado("Lara", "Dev");
        
        System.out.println(emple01);
        System.out.println(emple02);
        
        emple01.actualizarSalario(21.9);
        emple02.actualizarSalario(790);
        
        System.out.println("\nSueldos después de aumentos:");
        System.out.println(emple01);
        System.out.println(emple02);
        
        System.out.println("\ntotal de empleados: "+ Empleado.mostrarTotalEmpleados());



    }
    
}
