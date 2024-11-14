package main 

import(
	"fmt"
)

func main(){
	// yearsOld := 33 
	
	// if yearsOld > 18 {
	// 	fmt.Printf(" %d es mayor de 18 \n " , yearsOld)
	// }

	// boolVar := false 

	// if boolVar {
	// 	fmt.Println( "Imprimir cartel \n ")
	// }

	// if value := true;  value{
	// 	fmt.Printf("Es verdadero")
	// }

	// number3 := 3

	// if number3 == 3 {
	// 	fmt.Println("Valida igual a 3")
	// }else if number3 > 3 {
	// 	fmt.Println("Valida el mayor a 3")
	// }else{
	// 	fmt.Println("Valida el menor de 3")
	// }


	variablePrueba := 1231231


	switch variablePrueba {
	case 1:
		fmt.Println("UNO")	
	case 2:
		fmt.Println("DOS")
	case 3:
		fmt.Println("TRES")
	default:
		fmt.Println("Ninuno de los valores")
	}


	switch newValue := 4 ; newValue {
	case 1 : 
	fmt.Println("Este caso fue igual a uno")
	default :
	fmt.Println("Otra vez ninguno de los anteriores")
	}

}