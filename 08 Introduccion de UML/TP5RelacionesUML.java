//Adriel lopez

public class TP5RelacionesUML {
    
    //Ejercicio1: Pasaporte - Foto - Titular
    
    public static class Ex01 {
        static class Pasaporte {
            private final String numero;
            private final String fechaEmision;
            private final Foto foto;            // composición
            private Titular titular;            // asociación bidireccional

            public Pasaporte(String numero, String fechaEmision, String imagenFoto, String formatoFoto) {
                this.numero = numero;
                this.fechaEmision = fechaEmision;
                this.foto = new Foto(imagenFoto, formatoFoto);
            }
            public void setTitular(Titular titular) {
                this.titular = titular;
                if (titular.getPasaporte() != this) titular.setPasaporte(this);
            }
            public String getNumero() { return numero; }
            public String getFechaEmision() { return fechaEmision; }
            public Foto getFoto() { return foto; }
            public Titular getTitular() { return titular; }
        }
        static class Foto {
            private final String imagen;
            private final String formato;
            public Foto(String imagen, String formato) { this.imagen = imagen; this.formato = formato; }
            public String getImagen() { return imagen; }
            public String getFormato() { return formato; }
        }
        static class Titular {
            private final String nombre;
            private final String dni;
            private Pasaporte pasaporte; // asociación bidireccional
            public Titular(String nombre, String dni) { this.nombre = nombre; this.dni = dni; }
            public void setPasaporte(Pasaporte pasaporte) {
                this.pasaporte = pasaporte;
                if (pasaporte.getTitular() != this) pasaporte.setTitular(this);
            }
            public String getNombre() { return nombre; }
            public String getDni() { return dni; }
            public Pasaporte getPasaporte() { return pasaporte; }
        }
        public static void demo() {
            Pasaporte p = new Pasaporte("AR123","2025-01-01","img.jpg","jpg");
            Titular t = new Titular("Ada","44578368");
            p.setTitular(t);
            System.out.println("[EX01] Titular de pasaporte: " + p.getTitular().getNombre());
        }
    }

    //Ejercicio 2: Celular - Batería - Usuario
    
    public static class Ex02 {
        static class Celular {
            private final String imei, marca, modelo;
            private Bateria bateria; // agregación
            private Usuario usuario; // bidireccional
            public Celular(String imei, String marca, String modelo, Bateria bateria) {
                this.imei = imei; this.marca = marca; this.modelo = modelo; this.bateria = bateria;
            }
            public void setUsuario(Usuario usuario) {
                this.usuario = usuario;
                if (usuario.getCelular() != this) usuario.setCelular(this);
            }
            public void setBateria(Bateria bateria) { this.bateria = bateria; }
            public String getImei() { return imei; }
            public String getMarca() { return marca; }
            public String getModelo() { return modelo; }
            public Bateria getBateria() { return bateria; }
            public Usuario getUsuario() { return usuario; }
        }
        static class Bateria {
            private final String modelo; private final int capacidad;
            public Bateria(String modelo, int capacidad) { this.modelo = modelo; this.capacidad = capacidad; }
            public String getModelo() { return modelo; }
            public int getCapacidad() { return capacidad; }
        }
        static class Usuario {
            private final String nombre, dni;
            private Celular celular;
            public Usuario(String nombre, String dni) { this.nombre = nombre; this.dni = dni; }
            public void setCelular(Celular celular) {
                this.celular = celular;
                if (celular.getUsuario() != this) celular.setUsuario(this);
            }
            public String getNombre() { return nombre; }
            public String getDni() { return dni; }
            public Celular getCelular() { return celular; }
        }
        public static void demo() {
            Bateria bat = new Bateria("BT-01", 4000);
            Celular cel = new Celular("123","Brand","Model", bat);
            Usuario u = new Usuario("Bruno","123");
            cel.setUsuario(u);
            System.out.println("[EX02] Usuario del celular: " + cel.getUsuario().getNombre());
        }
    }

    //Ejercicio 3: Libro - Autor - Editorial

    public static class Ex03 {
        static class Libro {
            private final String titulo, isbn;
            private final Autor autor;   // unidireccional
            private Editorial editorial; // agregación
            public Libro(String titulo, String isbn, Autor autor) {
                this.titulo = titulo; this.isbn = isbn; this.autor = autor;
            }
            public void setEditorial(Editorial editorial) { this.editorial = editorial; }
            public String getTitulo() { return titulo; }
            public String getIsbn() { return isbn; }
            public Autor getAutor() { return autor; }
            public Editorial getEditorial() { return editorial; }
        }
        static class Autor {
            private final String nombre, nacionalidad;
            public Autor(String nombre, String nacionalidad) { this.nombre = nombre; this.nacionalidad = nacionalidad; }
            public String getNombre() { return nombre; }
            public String getNacionalidad() { return nacionalidad; }
        }
        static class Editorial {
            private final String nombre, direccion;
            public Editorial(String nombre, String direccion) { this.nombre = nombre; this.direccion = direccion; }
            public String getNombre() { return nombre; }
            public String getDireccion() { return direccion; }
        }
        public static void demo() {
            Autor a = new Autor("Cortázar","AR");
            Libro l = new Libro("Rayuela","ISBN", a);
            l.setEditorial(new Editorial("Sudamericana","CABA"));
            System.out.println("[EX03] Autor de libro: " + l.getAutor().getNombre());
        }
    }

    //Ejercicio 4: TarjetaDeCrédito - Cliente - Banco

    public static class Ex04 {
        static class TarjetaDeCredito {
            private final String numero, fechaVencimiento;
            private Cliente cliente; // bidireccional
            private final Banco banco;     // agregación
            public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
                this.numero = numero; this.fechaVencimiento = fechaVencimiento; this.banco = banco;
            }
            public void setCliente(Cliente cliente) {
                this.cliente = cliente;
                if (cliente.getTarjeta() != this) cliente.setTarjeta(this);
            }
            public String getNumero() { return numero; }
            public String getFechaVencimiento() { return fechaVencimiento; }
            public Cliente getCliente() { return cliente; }
            public Banco getBanco() { return banco; }
        }
        static class Cliente {
            private final String nombre, dni;
            private TarjetaDeCredito tarjeta;
            public Cliente(String nombre, String dni) { this.nombre = nombre; this.dni = dni; }
            public void setTarjeta(TarjetaDeCredito tarjeta) {
                this.tarjeta = tarjeta;
                if (tarjeta.getCliente() != this) tarjeta.setCliente(this);
            }
            public String getNombre() { return nombre; }
            public String getDni() { return dni; }
            public TarjetaDeCredito getTarjeta() { return tarjeta; }
        }
        static class Banco {
            private final String nombre, cuit;
            public Banco(String nombre, String cuit) { this.nombre = nombre; this.cuit = cuit; }
            public String getNombre() { return nombre; }
            public String getCuit() { return cuit; }
        }
        public static void demo() {
            Banco b = new Banco("Banco X","30-123");
            TarjetaDeCredito t = new TarjetaDeCredito("1111","12/30", b);
            Cliente c = new Cliente("Clara","222");
            t.setCliente(c);
            System.out.println("[EX04] Cliente de tarjeta: " + t.getCliente().getNombre());
        }
    }

    //Ejercicio 5: Computadora - PlacaMadre - Propietario

    public static class Ex05 {
        static class Computadora {
            private final String marca, numeroSerie;
            private final PlacaMadre placa; // composición
            private Propietario propietario; // bidireccional
            public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipset) {
                this.marca = marca; this.numeroSerie = numeroSerie;
                this.placa = new PlacaMadre(modeloPlaca, chipset);
            }
            public void setPropietario(Propietario propietario) {
                this.propietario = propietario;
                if (propietario.getComputadora() != this) propietario.setComputadora(this);
            }
            public String getMarca() { return marca; }
            public String getNumeroSerie() { return numeroSerie; }
            public PlacaMadre getPlaca() { return placa; }
            public Propietario getPropietario() { return propietario; }
        }
        static class PlacaMadre {
            private final String modelo, chipset;
            public PlacaMadre(String modelo, String chipset) { this.modelo = modelo; this.chipset = chipset; }
            public String getModelo() { return modelo; }
            public String getChipset() { return chipset; }
        }
        static class Propietario {
            private final String nombre, dni;
            private Computadora computadora;
            public Propietario(String nombre, String dni) { this.nombre = nombre; this.dni = dni; }
            public void setComputadora(Computadora computadora) {
                this.computadora = computadora;
                if (computadora.getPropietario() != this) computadora.setPropietario(this);
            }
            public String getNombre() { return nombre; }
            public String getDni() { return dni; }
            public Computadora getComputadora() { return computadora; }
        }
        public static void demo() {
            Computadora pc = new Computadora("Lenovo","SN001","B550","AMD");
            Propietario p = new Propietario("Diego","333");
            pc.setPropietario(p);
            System.out.println("[EX05] Propietario de PC: " + pc.getPropietario().getNombre());
        }
    }

    //Ejercicio 6: Reserva - Cliente - Mesa

    public static class Ex06 {
        static class Reserva {
            private final String fecha, hora;
            private final Cliente cliente; // uni
            private Mesa mesa;             // agregación
            public Reserva(String fecha, String hora, Cliente cliente) {
                this.fecha = fecha; this.hora = hora; this.cliente = cliente;
            }
            public void setMesa(Mesa mesa) { this.mesa = mesa; }
            public String getFecha() { return fecha; }
            public String getHora() { return hora; }
            public Cliente getCliente() { return cliente; }
            public Mesa getMesa() { return mesa; }
        }
        static class Cliente {
            private final String nombre, telefono;
            public Cliente(String nombre, String telefono) { this.nombre = nombre; this.telefono = telefono; }
            public String getNombre() { return nombre; }
            public String getTelefono() { return telefono; }
        }
        static class Mesa {
            private final int numero, capacidad;
            public Mesa(int numero, int capacidad) { this.numero = numero; this.capacidad = capacidad; }
            public int getNumero() { return numero; }
            public int getCapacidad() { return capacidad; }
        }
        public static void demo() {
            Cliente c = new Cliente("Elena","351-000");
            Reserva r = new Reserva("2025-11-07","20:00", c);
            r.setMesa(new Mesa(5,4));
            System.out.println("[EX06] Cliente en reserva: " + r.getCliente().getNombre());
        }
    }

    //Ejercicio 7: Vehículo - Motor - Conductor

    public static class Ex07 {
        static class Vehiculo {
            private final String patente, modelo;
            private Motor motor;          // agregación
            private Conductor conductor;  // bidireccional
            public Vehiculo(String patente, String modelo) { this.patente = patente; this.modelo = modelo; }
            public void setMotor(Motor motor) { this.motor = motor; }
            public void setConductor(Conductor conductor) {
                this.conductor = conductor;
                if (conductor.getVehiculo() != this) conductor.setVehiculo(this);
            }
            public String getPatente() { return patente; }
            public String getModelo() { return modelo; }
            public Motor getMotor() { return motor; }
            public Conductor getConductor() { return conductor; }
        }
        static class Motor {
            private final String tipo, numeroSerie;
            public Motor(String tipo, String numeroSerie) { this.tipo = tipo; this.numeroSerie = numeroSerie; }
            public String getTipo() { return tipo; }
            public String getNumeroSerie() { return numeroSerie; }
        }
        static class Conductor {
            private final String nombre, licencia;
            private Vehiculo vehiculo;
            public Conductor(String nombre, String licencia) { this.nombre = nombre; this.licencia = licencia; }
            public void setVehiculo(Vehiculo vehiculo) {
                this.vehiculo = vehiculo;
                if (vehiculo.getConductor() != this) vehiculo.setConductor(this);
            }
            public String getNombre() { return nombre; }
            public String getLicencia() { return licencia; }
            public Vehiculo getVehiculo() { return vehiculo; }
        }
        public static void demo() {
            Vehiculo v = new Vehiculo("ABC123","Sedan");
            v.setMotor(new Motor("Nafta","SNM1"));
            Conductor c = new Conductor("Fede","B1");
            v.setConductor(c);
            System.out.println("[EX07] Conductor del vehículo: " + v.getConductor().getNombre());
        }
    }

    //Ejercicio 8: Documento - FirmaDigital - Usuario

    public static class Ex08 {
        static class Documento {
            private final String titulo, contenido;
            private FirmaDigital firma; // composición
            public Documento(String titulo, String contenido) { this.titulo = titulo; this.contenido = contenido; }
            public void firmar(String codigoHash, String fecha, Usuario usuario) {
                this.firma = new FirmaDigital(codigoHash, fecha, usuario);
            }
            public String getTitulo() { return titulo; }
            public String getContenido() { return contenido; }
            public FirmaDigital getFirma() { return firma; }
        }
        static class FirmaDigital {
            private final String codigoHash, fecha;
            private final Usuario usuario; // agregación
            public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
                this.codigoHash = codigoHash; this.fecha = fecha; this.usuario = usuario;
            }
            public String getCodigoHash() { return codigoHash; }
            public String getFecha() { return fecha; }
            public Usuario getUsuario() { return usuario; }
        }
        static class Usuario {
            private final String nombre, email;
            public Usuario(String nombre, String email) { this.nombre = nombre; this.email = email; }
            public String getNombre() { return nombre; }
            public String getEmail() { return email; }
        }
        public static void demo() {
            Documento d = new Documento("Contrato","...");
            d.firmar("abc123","2025-11-07", new Usuario("Gina","g@x.com"));
            System.out.println("[EX08] Documento firmado por: " + d.getFirma().getUsuario().getNombre());
        }
    }

    //Ejercicio 9: CitaMédica - Paciente - Profesional

    public static class Ex09 {
        static class CitaMedica {
            private final String fecha, hora;
            private final Paciente paciente;
            private final Profesional profesional;
            public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
                this.fecha = fecha; this.hora = hora; this.paciente = paciente; this.profesional = profesional;
            }
            public String getFecha() { return fecha; }
            public String getHora() { return hora; }
            public Paciente getPaciente() { return paciente; }
            public Profesional getProfesional() { return profesional; }
        }
        static class Paciente {
            private final String nombre, obraSocial;
            public Paciente(String nombre, String obraSocial) { this.nombre = nombre; this.obraSocial = obraSocial; }
            public String getNombre() { return nombre; }
            public String getObraSocial() { return obraSocial; }
        }
        static class Profesional {
            private final String nombre, especialidad;
            public Profesional(String nombre, String especialidad) { this.nombre = nombre; this.especialidad = especialidad; }
            public String getNombre() { return nombre; }
            public String getEspecialidad() { return especialidad; }
        }
        public static void demo() {
            CitaMedica c = new CitaMedica("2025-11-07","10:00", new Paciente("Hugo","OSDE"), new Profesional("Iris","Cardio"));
            System.out.println("[EX09] Paciente: " + c.getPaciente().getNombre() + " - Médico: " + c.getProfesional().getNombre());
        }
    }

    //Ejercicio 10: CuentaBancaria - ClaveSeguridad - Titular

    public static class Ex10 {
        static class CuentaBancaria {
            private final String cbu;
            private double saldo;
            private final ClaveSeguridad clave; // composición
            private Titular titular;            // bidireccional
            public CuentaBancaria(String cbu, double saldoInicial, String codigo, String ultimaModificacion) {
                this.cbu = cbu; this.saldo = saldoInicial;
                this.clave = new ClaveSeguridad(codigo, ultimaModificacion);
            }
            public void setTitular(Titular titular) {
                this.titular = titular;
                if (titular.getCuenta() != this) titular.setCuenta(this);
            }
            public String getCbu() { return cbu; }
            public double getSaldo() { return saldo; }
            public void depositar(double monto) { this.saldo += monto; }
            public boolean extraer(double monto) { if (monto <= saldo) { saldo -= monto; return true; } return false; }
            public ClaveSeguridad getClave() { return clave; }
            public Titular getTitular() { return titular; }
        }
        static class ClaveSeguridad {
            private String codigo, ultimaModificacion;
            public ClaveSeguridad(String codigo, String ultimaModificacion) { this.codigo = codigo; this.ultimaModificacion = ultimaModificacion; }
            public String getCodigo() { return codigo; }
            public String getUltimaModificacion() { return ultimaModificacion; }
            public void actualizar(String nuevoCodigo, String fecha) { this.codigo = nuevoCodigo; this.ultimaModificacion = fecha; }
        }
        static class Titular {
            private final String nombre, dni;
            private CuentaBancaria cuenta;
            public Titular(String nombre, String dni) { this.nombre = nombre; this.dni = dni; }
            public void setCuenta(CuentaBancaria cuenta) {
                this.cuenta = cuenta;
                if (cuenta.getTitular() != this) cuenta.setTitular(this);
            }
            public String getNombre() { return nombre; }
            public String getDni() { return dni; }
            public CuentaBancaria getCuenta() { return cuenta; }
        }
        public static void demo() {
            CuentaBancaria cta = new CuentaBancaria("CBU",100.0,"000","2025-01-01");
            Titular t = new Titular("Juli","444");
            cta.setTitular(t);
            cta.depositar(500);
            System.out.println("[EX10] Saldo luego de depósito: " + cta.getSaldo());
        }
    }

    //Ejercicio 11: Reproductor - Canción - Artista

    public static class Ex11 {
        static class Cancion {
            private final String titulo;
            private final Artista artista; // uni
            public Cancion(String titulo, Artista artista) { this.titulo = titulo; this.artista = artista; }
            public String getTitulo() { return titulo; }
            public Artista getArtista() { return artista; }
        }
        static class Artista {
            private final String nombre, genero;
            public Artista(String nombre, String genero) { this.nombre = nombre; this.genero = genero; }
            public String getNombre() { return nombre; }
            public String getGenero() { return genero; }
        }
        static class Reproductor {
            public void reproducir(Cancion c) {
                System.out.println("Reproduciendo: " + c.getTitulo() + " - " + c.getArtista().getNombre());
            }
        }
        public static void demo() {
            Reproductor r = new Reproductor();
            r.reproducir(new Cancion("Track", new Artista("DJ","Electrónica")));
            System.out.println("reproducción OK");
        }
    }

    //Ejercicio 12: Impuesto - Contribuyente - Calculadora

    public static class Ex12 {
        static class Impuesto {
            private final double monto;
            private final Contribuyente contribuyente;
            public Impuesto(double monto, Contribuyente contribuyente) { this.monto = monto; this.contribuyente = contribuyente; }
            public double getMonto() { return monto; }
            public Contribuyente getContribuyente() { return contribuyente; }
        }
        static class Contribuyente {
            private final String nombre, cuil;
            public Contribuyente(String nombre, String cuil) { this.nombre = nombre; this.cuil = cuil; }
            public String getNombre() { return nombre; }
            public String getCuil() { return cuil; }
        }
        static class Calculadora {
            public void calcular(Impuesto i) {
                System.out.println("Calculando para " + i.getContribuyente().getNombre() + " => " + i.getMonto());
            }
        }
        public static void demo() {
            Calculadora c = new Calculadora();
            c.calcular(new Impuesto(1234.5, new Contribuyente("Katia","20-222")));
            System.out.println("[EX12] Cálculo OK");
        }
    }

    //Ejercicio 13: GeneradorQR - Usuario - CódigoQR

    public static class Ex13 {
        static class CodigoQR {
            private final String valor;
            private final Usuario usuario;
            public CodigoQR(String valor, Usuario usuario) { this.valor = valor; this.usuario = usuario; }
            public String getValor() { return valor; }
            public Usuario getUsuario() { return usuario; }
        }
        static class Usuario {
            private final String nombre, email;
            public Usuario(String nombre, String email) { this.nombre = nombre; this.email = email; }
            public String getNombre() { return nombre; }
            public String getEmail() { return email; }
        }
        static class GeneradorQR {
            public void generar(String valor, Usuario u) {
                CodigoQR qr = new CodigoQR(valor, u);
                System.out.println("QR de " + u.getNombre() + ": " + qr.getValor());
            }
        }
        public static void demo() {
            new GeneradorQR().generar("VALORQR", new Usuario("Leo","l@x.com"));
        }
    }

    //Ejercicio 14: EditorVideo - Proyecto - RenderQR

    public static class Ex14 {
        static class Render {
            private final String formato;
            private final Proyecto proyecto;
            public Render(String formato, Proyecto proyecto) { this.formato = formato; this.proyecto = proyecto; }
            public String getFormato() { return formato; }
            public Proyecto getProyecto() { return proyecto; }
        }
        static class Proyecto {
            private final String nombre;
            private final int duracionMin;
            public Proyecto(String nombre, int duracionMin) { this.nombre = nombre; this.duracionMin = duracionMin; }
            public String getNombre() { return nombre; }
            public int getDuracionMin() { return duracionMin; }
        }
        static class EditorVideo {
            public void exportar(String formato, Proyecto p) {
                Render r = new Render(formato, p);
                System.out.println("Exportando '" + p.getNombre() + "' a " + r.getFormato());
            }
        }
        public static void demo() {
            new EditorVideo().exportar("MP4", new Proyecto("Proyecto Demo", 3));
        }
    }
    public static void main(String[] args) {
        Ex01.demo();
        Ex02.demo();
        Ex03.demo();
        Ex04.demo();
        Ex05.demo();
        Ex06.demo();
        Ex07.demo();
        Ex08.demo();
        Ex09.demo();
        Ex10.demo();
        Ex11.demo();
        Ex12.demo();
        Ex13.demo();
        Ex14.demo();
        System.out.println(">> Todas las demos ejecutadas.");
    }
}
