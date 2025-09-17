package proyectosunidad2;
import java.util.Scanner;
<<<<<<< HEAD

=======
//Trabajo Practico unidad 2 programacion II Adriel lopez
>>>>>>> 19728f8 (unidad 3 adriel lopez introduccion a poo)
public class Proyectosunidad2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //1.​ Verificación de Año Bisiesto.
        //Escribe un programa en Java que solicite al usuario un año y determine si es
        //bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea
        //divisible por 400.
        
        System.out.print("Ingrese un año: ");
        int anio = scan.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
        
        //2.​ Determinar el Mayor de Tres Números.
        //Escribe un programa en Java que pida al usuario tres números enteros y
        //determine cuál es el mayor.
        
        System.out.print("Ingrese el primero numero: ");
        int num1 = scan.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = scan.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int num3 = scan.nextInt();
        
        int mayor;

        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }
        System.out.print("el numero mayor de los 3 es el " + mayor);
       
        //3.​ Clasificación de Edad.
        //Escribe un programa en Java que solicite al usuario su edad y clasifique su
        //etapa de vida según la siguiente tabla:
        //Menor de 12 años: "Niño"
        //Entre 12 y 17 años: "Adolescente"
        //Entre 18 y 59 años: "Adulto"
        //60 años o más: "Adulto mayor"
        
        System.out.print("Ingrese su edad: ");
        int edad = scan.nextInt();
        
        if (edad < 12){
            System.out.print("Usted es categorizado como Niño\n");
        };
        if (edad >= 12 && edad <= 17){
            System.out.print("Usted es categorizado como Adolescente\n");
        };
        if (edad >= 18 && edad <= 59){
            System.out.print("Usted es categorizado como Adulto\n");
        };
        if (edad >= 60){
            System.out.print("Usted es categorizado como Adulto mayor\n");
        };
        
        //4.​ Calculadora de Descuento según categoría.
        //Escribe un programa que solicite al usuario el precio de un producto y
        //su categoría (A, B o C).
        //Luego, aplique los siguientes descuentos:
        //Categoría A: 10% de descuento
        //Categoría B: 15% de descuento
        //Categoría C: 20% de descuento
        //El programa debe mostrar el precio original, el descuento aplicado y el
        //precio final
        
        System.out.print("Ingrese el precio de su producto ");
        double price = scan.nextDouble();
        
        System.out.print("Ingrese la categoria de descunto valido: \n A|B|C ");
        char cate = scan.next().toUpperCase().charAt(0); //aporte de con ayuda de ia para evitar errores
        
        double descuento = 0.0;
        
        switch (cate) {
            case 'A':
                descuento = 0.10;
                break;
            case 'B':
                descuento = 0.15;
                break;
            case 'C':
                descuento = 0.20;
                break;
            default:
                System.out.println("Categoría inválida. Debe ser A, B o C.");
                return;
        }
        
        double montoDescuento = price * descuento;
        double precioFinal = price - montoDescuento;

        System.out.println("Descuento aplicado: $" + montoDescuento);
        System.out.println("Precio final: $" + precioFinal);
        
        
        //5.​ Suma de Números Pares (while).
        //Escribe un programa que solicite números al usuario y sume solo los
        //números pares. El ciclo debe continuar hasta que el usuario ingrese el número
        //0, momento en el que se debe mostrar la suma total de los pares ingresados.
        
        int bet;
        int sumPares = 0;
        
        do {
            System.out.print("Para finalizar ingrese 0 \nIngrese un numero:");
            bet = scan.nextInt();
            if (bet % 2 == 0 && bet != 0){
                sumPares =+ bet;   
            }
        
        } while (bet != 0);
        
        System.out.println("La suma de los números pares es: " + sumPares);
        
        //6.​ Contador de Positivos, Negativos y Ceros (for).
        //Escribe un programa que pida al usuario ingresar 10 números enteros y
        //cuente cuántos son positivos, negativos y cuántos son ceros.
        
        int contNega = 0;
        int contPosi = 0;
        int contcero= 0;
        
        for (int i = 1; i <= 10; i++){
            System.out.print("ingrese 10 numeros enteros:");
            int numero = scan.nextInt();
            
            if (numero == 0){
                contcero += 1;
            }
            if (numero > 0){
                contPosi += 1;
            }
            if (numero < 0){
                contNega += 1;
            }
            
            }
        System.out.println("Positivos: " + contPosi);
        System.out.println("Negativos: " + contNega);
        System.out.println("Ceros: " + contcero);
        
    
        //7.​ Validación de Nota entre 0 y 10 (do-while).
        //Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el
        //usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota
        //hasta que ingrese un valor válido.
        
        double nota = 0.0;
        
        do {
            System.out.print("Ingrese una nota entre 0 y 10: ");
            nota = scan.nextInt();  

            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido. Intente nuevamente.");
            }

        } while (nota < 0 || nota > 10);

        System.out.println("La nota ingresada es válida: " + nota);
       
        //8.​ Cálculo del Precio Final con impuesto y descuento.
        //Crea un método calcularPrecioFinal(double impuesto, double
        //descuento) que calcule el precio final de un producto en un e-commerce. La
        //fórmula es:
        //PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times
        //Descuento)
        //Desde main(), solicita el precio base del producto, el porcentaje de
        //impuesto y el porcentaje de descuento, llama al método y muestra el precio
        
        System.out.print("Ingrese el precio base del producto: ");
        double precio = scan.nextDouble();
        
        System.out.print("Ingrese el impuesto en porcentaje: ");
        double impuest = scan.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje: ");
        double desc = scan.nextDouble();
        
        double pricef = precio + (precio * impuest / 100) - (precio * desc / 100);
        
        System.out.println("El precio final del producto es: " + pricef);

        //9. Composición de funciones para calcular costo de envío y total de compra.
        //a.​calcularCostoEnvio(double peso, String zona): Calcula el costo de
        //envío basado en la zona de envío (Nacional o Internacional) y el peso del
        //paquete.​
        //Nacional: $5 por kg
        //Internacional: $10 por kg
        //b. calcularTotalCompra(double precioProducto, double
        //costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con
        //el costo de envío.​
        //Desde main(), solicita el peso del paquete, la zona de envío y el precio
        //del producto. Luego, muestra el total a pagar.
       
        double cost = 0.0;
        System.out.print("Ingrese el precio del producto: ");
        double preciobulto = scan.nextDouble();
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scan.nextDouble();

        System.out.print("Ingrese la zona de envío: \n (Selecione \n 1 = Internacional \n 2 = Nacional\n)");
        int tenvio = scan.nextInt();
        
        if (tenvio == 1) {
            cost = peso * 10;
        } else if (tenvio ==2){
            cost = peso * 5;
        }
        else{
        System.out.println("Zona inválida. Debe ser Nacional o Internacional.");
        }        
        
        double costf = preciobulto + cost;
        
        System.out.println("El total a pagar es: " + costf);

        //10.​Actualización de stock a partir de venta y recepción de productos.
        //Crea un método actualizarStock(int stockActual, int cantidadVendida,
        //int cantidadRecibida), que calcule el nuevo stock después de una venta y
        //recepción
        //de productos:
        //NuevoStock = StockActual − CantidadVendida + CantidadRecibida
        //NuevoStock = CantidadVendida + CantidadRecibida
        //Desde main(), solicita al usuario el stock actual, la cantidad vendida y la
        //cantidad recibida, y muestra el stock actualizado.
        
        System.out.print("Ingrese el stock actual del producto: ");
        int stocka =scan.nextInt();
        
        System.out.print("Ingrese la cantidad vendida:: ");
        int cventa = scan.nextInt();

        System.out.print("Ingrese la cantidad recibida:");
        int crecibe = scan.nextInt();
              
        
        int stockf = stocka - cventa + crecibe;
        
        System.out.println("El nuevo stock del producto es: " + stockf);
        
        //12.​ Modificación de un array de precios y visualización de resultados.
        //Crea un programa que:
        //a. Declare e inicialice un array con los precios de algunos productos.
        //b.​Muestre los valores originales de los precios.
        //c.​Modifique el precio de un producto específico.
        //d.​Muestre los valores modificados.
        
        double [] precios1 = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales:\n ");
        
        for (int i = 0; i < precios1.length; i++) {
            System.out.println("Precio: $"+precios1[i]);
            }
        
        System.out.println("\nPrecios modificados:\n ");

        precios1[2]= 129.99;
        
        for (int i = 0; i < precios1.length; i++) {
            System.out.println("Precio: $"+precios1[i]);
            }
        
        //13.​ Impresión recursiva de arrays antes y después de modificar un elemento.
        //Crea un programa que:
        //a.​Declare e inicialice un array con los precios de algunos productos.
        //b.​Use una función recursiva para mostrar los precios originales.
        //c.​Modifique el precio de un producto específico.
        //d.​Use otra función recursiva para mostrar los valores modificados.
        

    }    
}
// Función recursiva para mostrar los precios originales

public class recursivaarray13 {

    public static void mostrarPrecios(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            mostrarPrecios(precios, indice + 1); 
        }
    }

    public static void mostrarPreciosModificados(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            mostrarPreciosModificados(precios, indice + 1); 
        }
    }

    public static void main(String[] args) {
        
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        mostrarPrecios(precios, 0);

        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        mostrarPreciosModificados(precios, 0);
    }
}


// formato de clase separada del main principal
public class ActualizarStock {

    // Método que calcula el nuevo stock
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el stock actual del producto: ");
        int stocka = scan.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        int cventa = scan.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        int crecibe = scan.nextInt();

        // Uso del método
        int stockf = actualizarStock(stocka, cventa, crecibe);

        System.out.println("El nuevo stock del producto es: " + stockf);
    }
}

        //11. Cálculo de descuento especial usando variable global.
        //Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un
        //método calcularDescuentoEspecial(double precio) que use la variable global para
        //calcular el descuento especial del 10%.
        //Dentro del método, declara una variable local descuentoAplicado, almacena
        //el valor del descuento y muestra el precio final con descuento.




public class ProyectosUnidad2 {
    static double descespe = 0.10;

    public static void calcularDescuentoEspecial(double precio) {
            // Variable local
            double descuentoAplicado = precio * descespe;
            double pricefinal = precio - descuentoAplicado;
            System.out.println("Precio original: $" + precio);
            System.out.println("Descuento aplicado: $" + descuentoAplicado);
            System.out.println("Precio final con descuento: $" + pricefinal);    
    }

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Ingrese el precio del producto: ");
            double precio = scan.nextDouble();

            calcularDescuentoEspecial(precio);
        }
    }