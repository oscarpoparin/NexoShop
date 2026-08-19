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

let precios = [850.0, 450.0, 2800.0];
let subtotal = 0.0;
let descuento = 0.0;
let baseConDescuento = 0.0;
let iva = 0.0;
let total = 0.0;

for (let i = 0; i < precios.length; i++) {
  subtotal += precios[i];
}

if (subtotal > 1000) {
  descuento = subtotal * 0.1;
  baseConDescuento = subtotal - descuento;
  iva = baseConDescuento * 0.16;
  total = baseConDescuento + iva;
  console.log(`SUBTOTAL: ${subtotal.toFixed(2)}`);
  console.log(`DESCUENTO: ${descuento.toFixed(2)}`);
  console.log(`IVA: ${iva.toFixed(2)}`);
  console.log(`TOTAL: ${total.toFixed(2)}`);
} else {
  iva = subtotal * 0.16;
  total = subtotal + iva;
  console.log(`SUBTOTAL: ${subtotal.toFixed(2)}`);
  console.log(`IVA: ${iva.toFixed(2)}`);
  console.log(`TOTAL: ${total.toFixed(2)}`);
}
