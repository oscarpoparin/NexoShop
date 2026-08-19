package main

import "fmt"

func main() {
	var subtotal, descuento, baseConDescuento, iva, total float64
	var opc int
	fmt.Println("CARRITO DE COMPRA")
	fmt.Println("1.- Datos harcodeados")
	fmt.Println("2.- Ingresar datos manualmente")
	fmt.Println("3.- Salir")
	fmt.Print("\nIngresar opcion:")
	fmt.Scanln(&opc)

	switch opc {
	case 1:

		precios := []float32{850.00, 450.00, 2800.00}

		for _, value := range precios {
			subtotal += float64(value)
		}

		if subtotal > 1000 {
			descuento = subtotal * 0.10
			baseConDescuento = subtotal - descuento
			iva = baseConDescuento * 0.16
			total = baseConDescuento + iva
			fmt.Printf("SUBTOTAL: %.2f\t\n" , subtotal)
			fmt.Printf("DESCUENTO: %.2f\t\n", descuento)
			fmt.Printf("IVA: %.2f\t\n", iva)
			fmt.Printf("TOTAL: %.2f\t\n", total)
		} else {
			iva = subtotal * 0.16;
            total = subtotal + iva;
			fmt.Printf("SUBTOTAL: %.2f\t\n" , subtotal)
			fmt.Printf("IVA: %.2f\t\n", iva)
			fmt.Printf("TOTAL: %.2f\t\n", total)
		}
	case 2:

		var totalProductos int
		var precio float32
		fmt.Print("Ingresa el total de productos:")
		fmt.Scanln(&totalProductos)

		listaPrecios := make([]float32, 0, totalProductos)
		for i := 0; i < totalProductos; i++{
			fmt.Printf("Precio %d :", i)
			fmt.Scanln(&precio)
			listaPrecios = append(listaPrecios, precio)
			subtotal += float64(listaPrecios[i])
		}
		
		if subtotal > 1000{
			descuento = subtotal * 0.10
			baseConDescuento = subtotal - descuento
			iva = baseConDescuento * 0.16
			total = baseConDescuento + iva
			fmt.Printf("SUBTOTAL: %.2f\t\n" , subtotal)
			fmt.Printf("DESCUENTO: %.2f\t\n", descuento)
			fmt.Printf("IVA: %.2f\t\n", iva)
			fmt.Printf("TOTAL: %.2f\t\n", total)
		}else{
			iva = subtotal * 0.16;
            total = subtotal + iva;
			fmt.Printf("SUBTOTAL: %.2f\t\n" , subtotal)
			fmt.Printf("IVA: %.2f\t\n", iva)
			fmt.Printf("TOTAL: %.2f\t\n", total)
		}
		
	default:
		fmt.Println("Saliendo del programa...")
	}
}
