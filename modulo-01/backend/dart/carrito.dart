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

import 'dart:io';

void main(){
  print("CARRITO DE COMPRA");
  print("1.- Datos harcodeados");
  print("2.- Ingresar datos manualmente");
  print("3.-Salir");
  print("Ingresar una opcion:");
  int opcion = int.parse(stdin.readLineSync()!);
  double subtotal = 0.0; 
  double descuento = 0.0; 
  double baseConDescuento = 0.0;
  double iva = 0.0;
  double total = 0.0;

  switch(opcion){
    case 1:
      List<double> precios = [850.00, 450.00, 2800.00];
      for(int i=0; i<precios.length; i++){
        subtotal += precios[i];
      }
      if(subtotal > 1000){
        descuento = subtotal * 0.10;
        baseConDescuento = subtotal - descuento;
        iva = baseConDescuento * 0.16;
        total = baseConDescuento + iva;
        print('SUBTOTAL: ${subtotal.toStringAsFixed(2)}');
        print('DESCUENTO: ${descuento.toStringAsFixed(2)}');
        print('IVA: ${iva.toStringAsFixed(2)}');
        print('TOTAL: ${total.toStringAsFixed(2)}');
        
      }else{
        iva = subtotal * 0.16;
        total = subtotal + iva;
        print('SUBTOTAL: ${subtotal.toStringAsFixed(2)}');
        print('IVA: ${iva.toStringAsFixed(2)}');
        print('TOTAL: ${total.toStringAsFixed(2)}');
      }
      break;
    case 2:
      print("Ingresa el total de productos:");
      int totalProductos = int.parse(stdin.readLineSync()!);
      
      for(int i=0; i<totalProductos; i++){
        print("Precio $i :");
        double precio = double.parse(stdin.readLineSync()!);
        subtotal += precio;
      }
      if(subtotal > 1000){
        descuento = subtotal * 0.10;
        baseConDescuento = subtotal - descuento;
        iva = baseConDescuento * 0.16;
        total = baseConDescuento + iva;
        print('SUBTOTAL: ${subtotal.toStringAsFixed(2)}');
        print('DESCUENTO: ${descuento.toStringAsFixed(2)}');
        print('IVA: ${iva.toStringAsFixed(2)}');
        print('TOTAL: ${total.toStringAsFixed(2)}');
      }else{
        iva = subtotal * 0.16;
        total = subtotal + iva;
        print('SUBTOTAL: ${subtotal.toStringAsFixed(2)}');
        print('IVA: ${iva.toStringAsFixed(2)}');
        print('TOTAL: ${total.toStringAsFixed(2)}');
      }
      break;
    default:
      print("Saliendo del programa...");
  }

}