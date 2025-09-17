//Adriel lopez
//Introduccion a POO unidad 3

//a.​ Crear una clase Estudiante con los atributos: nombre, apellido, curso,
//calificación.
//Métodos requeridos: mostrarInfo(), subirCalificacion(puntos),
//bajarCalificacion(puntos).
//Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir
//calificaciones.

class Estudiantes{
    
    String nombre;
    String apellido;
    int curso;
    double calificacion;

    public void mostrarInfoAlum() {
        System.out.println("Nombre del alumno: " + nombre + " " + apellido);
        System.out.println("Curso numero: " + curso);
        System.out.println("Calificación: " + calificacion);
    
    }
    
    public void subirCalificacion(double puntos){
        calificacion += puntos;
        System.out.println("La calificación se actualizo.\nSu nueva calificación es: "
                + calificacion);
        
    }

    public void bajarCalificacion(double puntos){
        calificacion -= puntos;
        if (calificacion <= 0){
            calificacion = 0.00;
        }
        System.out.println("La calificación se actualizo.\nSu nueva calificación es: "
                + calificacion);
        
    }
}
//2.​ Registro de Mascotas
//a.​ Crear una clase Mascota con los atributos: nombre, especie, edad.
//Métodos requeridos: mostrarInfo(), cumplirAnios().
//Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y
//verificar los cambios.
    
class Mascota{
        
    String nombre;
    String especie ;
    int edad;
    
    public void mostrarInfoMasco() {
        System.out.println("Nombre de la mascota: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("anios: " + edad);
    
    }
    
    public void cumplirAnios(int anios){
        edad += anios;
        System.out.println("La edad de " + nombre + " se actualizo.\nSu edad es: "
                + edad);
    }
}    
//3.​ Encapsulamiento con la Clase Libro
//a.​ Crear una clase Libro con atributos privados: titulo, autor,
//añoPublicacion.
//Métodos requeridos: Getters para todos los atributos. Setter con validación
//para añoPublicacion.
//Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con
//uno válido, mostrar la información final.    
    
class Libro{
    
    private String titulo;
    private String autor;
    private int anio;
    
    public Libro(String titulo,String autor,int anio){
        this.titulo= titulo;
        this.autor= autor;
        this.anio= anio;
        
    }
    
    public void mostrarInfoLibro() {
        System.out.println("Nombre del libro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Anio de publicacion: " + anio);

    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anio;
    }
    
    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 1000 && anioPublicacion <= 2026) { 
            // ponemos un rango lógico de años
            this.anio = anioPublicacion;
        } else {
            System.out.println("Año inválido. Debe estar entre 1000 y 2025.\n");
        }
    
    }
}

//4.​ Gestión de Gallinas en Granja Digital
//a.​ Crear una clase Gallina con los atributos: idGallina, edad,
//huevosPuestos.
//Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().
//Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y
//mostrar su estado.

class Gallina{
    
    String idGallina;
    int edad;
    int huevosPuestos;
    
    
    public void ponerHuevo(int huevos){
        huevosPuestos += huevos;
        System.out.println("Huevos puesto por Gallina "+ idGallina + ": " + huevosPuestos);

    }
            
    public void envejecer(int anios){
        edad += anios;
        System.out.println("Edad de la Gallina "+ idGallina + ": " + edad);

    }
            
    public void mostrarEstado(){
    System.out.println("Id de Gallina: " + idGallina);
    System.out.println("Edad: " + edad);
    System.out.println("Cantidad de Huevos puestos: " + huevosPuestos);
    }

}

//5.​ Simulación de Nave Espacial
//Crear una clase NaveEspacial con los atributos: nombre, combustible.
//Métodos requeridos: despegar(), avanzar(distancia),
//recargarCombustible(cantidad), mostrarEstado().
//Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que
//se supere el límite al recargar.
//Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin
//recargar, luego recargar y avanzar correctamente. Mostrar el estado al final.

class NaveEspacial{
    
    String nombre;
    int combustible; 
    
    final int MAX_COMBUSTIBLE = 100; //aporte de chat 
    
    public void despegar(){
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado 🚀. Combustible restante: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible para despegar.\n"
                    + "Se necesita un minimo de 10 unidades de combustible y "+ nombre +
                    " tiene"+ combustible +" unidades");
        }
        
    }
    
    public void avanzar(int distancia){
        
        int consumo = distancia * 2; // 2 de combustible por distancia (aporte de chat gpt)
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " km. Combustible restante: " + combustible);
        } else {
            System.out.println("Combustible insuficiente para avanzar.");
        }
        
    }
    
    public void recargarCombustible(int cantidad){
         if (combustible + cantidad > MAX_COMBUSTIBLE) {
            combustible = MAX_COMBUSTIBLE;
            System.out.println("Combustible cargado al máximo (" + MAX_COMBUSTIBLE + ")");
        } else {
            combustible += cantidad;
            System.out.println("🔋Se recargaron " + cantidad + " unidades. Combustible actual: " + combustible);
        } 
        
    }
    
    public void mostrarEstado(){
        System.out.println("🌌 Nave: " + nombre + 
                " | Combustible: " + combustible + 
                "/" + MAX_COMBUSTIBLE);
        
    }
    
}

public class Unidad3IntroduccionPOO {
   
    public static void main(String[] args) {
    
        Estudiantes estudi1 = new Estudiantes();
        estudi1.nombre = "Adriel";
        estudi1.apellido = "Lopez";
        estudi1.curso = 16;
        estudi1.calificacion = 4.6;
        estudi1.mostrarInfoAlum();
        estudi1.subirCalificacion (3.77);
        estudi1.bajarCalificacion(6);
        
        System.out.println("\n");
        
        Mascota masco1 = new Mascota();
        masco1.nombre = "Juanchope";
        masco1.especie = "Dogo Argentino";
        masco1.edad = 2;
        masco1.mostrarInfoMasco();
        masco1.cumplirAnios(3);
        
        System.out.println("\n");
        
        Libro libro1 = new Libro("Con razon lo llaman el salvador", 
                "Max Lucado", 1986);
        libro1.mostrarInfoLibro();
        
        // Modificar con un año NO válido
        libro1.setAnioPublicacion(980);  
        libro1.mostrarInfoLibro(); // el año NO cambia

        // Modificar con un año válido
        libro1.setAnioPublicacion(1985);  
        libro1.mostrarInfoLibro(); // el año cambia correctamente
        
        System.out.println("\n");
        
        Gallina gallo1= new Gallina();
        gallo1.idGallina= "Sofia12B";
        gallo1.edad = 3;
        gallo1.huevosPuestos = 301;

        Gallina gallo2= new Gallina();
        gallo2.idGallina= "Lara02A";
        gallo2.edad = 1;
        gallo2.huevosPuestos = 123; 
        
        gallo1.envejecer(2);
        gallo2.envejecer(5);
        
        gallo1.mostrarEstado();
        gallo2.mostrarEstado();
        
        System.out.println("\n");
        
        NaveEspacial nave1 = new NaveEspacial();
        
        nave1.nombre = "Apolo";
        nave1.combustible = 50;

        nave1.mostrarEstado();
        nave1.avanzar(20); // intenta avanzar, gasta 40
        nave1.recargarCombustible(60); // debería recargar hasta el máximo
        nave1.despegar();
        nave1.mostrarEstado();
    }
       
}
