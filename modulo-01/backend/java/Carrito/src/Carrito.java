
/*
Pide (o recibe hardcodeado) una lista de precios; calcula subtotal, aplica IVA (16%), 
aplica descuento si el subtotal > 1000, e imprime el total. Usa variables, condicional y bucle.

1. Carrito de compra (quemado): precios `[850.00, 450.00, 2800.00]`.
2. **Subtotal** = suma de precios = `4100.00`.
3. **Descuento:** si `subtotal > 1000`, aplica **10%** de descuento sobre el subtotal.
4. **Base con descuento** = subtotal − descuento.
5. **IVA** = 16% sobre la base con descuento.
6. **Total** = base con descuento + IVA.
7. Imprime las 4 líneas con 2 decimales.
**Salida esperada (idéntica en Java, Go, JS, TS y Dart):**
Subtotal: 4100.00
Descuento: 410.00
IVA: 590.40
Total: 4280.40

*/
import java.text.DecimalFormat;
import java.util.Scanner;

public class Carrito {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double subtotal = 0.0;
        double descuento = 0.0;
        double baseConDescuento = 0.0;
        double iva = 0.0;
        double total = 0.0;
        int opc = 0;

        System.out.println("CARRITO DE COMPRA");
        System.out.println("1.- Datos harcodeados");
        System.out.println("2.- Ingresar datos manualmente");
        System.out.println("3.- Salir");
        System.out.print("Ingresar opcion:");
        opc = sc.nextInt();

        switch (opc) {
            case 1:

                double[] precios = new double[3];
                precios[0] = 850.00;
                precios[1] = 450.00;
                precios[2] = 2800.00;

                for (double precio : precios) {
                    subtotal += precio;
                }

                if (subtotal > 1000) {
                    descuento = subtotal * 0.10;
                    baseConDescuento = subtotal - descuento;
                    iva = baseConDescuento * 0.16;
                    total = baseConDescuento + iva;
                    System.out.println("SUBTOTAL:\t" + df.format(subtotal));
                    System.out.println("DESCUENTO:\t" + df.format(descuento));
                    System.out.println("IVA:\t" + df.format(iva));
                    System.out.println("TOTAL:\t" + df.format(total));
                } else {
                    iva = subtotal * 0.16;
                    total = subtotal + iva;
                    System.out.println("SUBTOTAL:\t" + df.format(subtotal));
                    System.out.println("IVA:\t" + df.format(iva));
                    System.out.println("TOTAL:\t" + df.format(total));
                }

                break;
            case 2:
                System.out.print("Ingresa el total de productos:");
                int totalProductos = sc.nextInt();
                double [] listaPrecios = new double[totalProductos];

                for(int i=0; i < listaPrecios.length; i++){
                    System.out.println("Precio" + i +":");
                    listaPrecios[i] = sc.nextDouble();
                    subtotal += listaPrecios[i];
                }

                if(subtotal > 1000){
                    descuento = subtotal * 0.10;
                    baseConDescuento = subtotal - descuento;
                    iva = baseConDescuento * 0.16;
                    total = baseConDescuento + iva;
                    System.out.println("SUBTOTAL:\t" + df.format(subtotal));
                    System.out.println("DESCUENTO:\t" + df.format(descuento));
                    System.out.println("IVA:\t" + df.format(iva));
                    System.out.println("TOTAL:\t" + df.format(total));
                }else{
                    iva = subtotal * 0.16;
                    total = subtotal + iva;
                    System.out.println("SUBTOTAL:\t" + df.format(subtotal));
                    System.out.println("IVA:\t" + df.format(iva));
                    System.out.println("TOTAL:\t" + df.format(total));
                }

                break;
            default:
                System.out.println("Saliendo del programa...");
                break;
        }
        sc.close();
    }
}
