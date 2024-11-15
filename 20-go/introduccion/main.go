package main

import (
	"introduccion/function" // Ruta del paquete según el módulo definido en go.mod
)

func main() {
	var myIntVar int64 = 42
	function.Display(myIntVar)
}