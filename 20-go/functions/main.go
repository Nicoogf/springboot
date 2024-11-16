package main

import (
	"fmt"
	"funciones/functions/function"
)

func main() {
	


	xVal , yVal := function.Split(40)
	fmt.Println(xVal , yVal)

	val3 := function.SumaTodosDigitos(1,2,3,4,5,8,74,8,5,7,4)
	fmt.Print( val3 )

}