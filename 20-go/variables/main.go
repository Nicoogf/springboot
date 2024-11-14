package main

import (
	"fmt"
	// "unsafe"
	"strconv"
)

func main(){
	/*
	var myIntVar int 
	myIntVar = -5 

	fmt.Println("Mi variable es " , myIntVar)

	var myUintVar uint
	myUintVar = 12 
	fmt.Println( "Mi variable uint es " ,  myUintVar )

	var myStringVar string
	myStringVar = "Texto"
	fmt.Println("El valor del string es " ,  myStringVar)

	var myOtherVar bool
	myOtherVar = true 
	fmt.Println("Es verdadero o falso ?" , myOtherVar)


	fmt.Println("La variable esta guardada en : " , &myStringVar)

	myintVar2 := 12 
	fmt.Println("Varibale es : " , myintVar2)

	myStringVar2 := "My string variable with :="

	fmt.Println(myStringVar2)

	myBooleanVar := true
	fmt.Println(myBooleanVar)
	*/

	/*

	const myConstante int = 24 
	fmt.Println(myConstante)

	const myFirstConstant = "texto"
	fmt.Println("valor de la nueva constante" , myFirstConstant)

	const myStringConst = "nuevo texto" 
	fmt.Println("Mi constante es : " , myStringConst)

	*/

	/*
	
	myOtherVariable := 50
	{
		myInt := 40 
		{
			
			fmt.Println(myOtherVariable)
			fmt.Println(myInt)
		}
	
		fmt.Println(myOtherVariable)
		fmt.Println(myInt)
	}

	fmt.Println(myOtherVariable)
	*/

 /*
	var my8bits uint8 = 20
	fmt.Printf("type: %T , value: %d, bytes: %d , bits: %d \n" , my8bits , my8bits , unsafe.Sizeof(my8bits), unsafe.Sizeof(my8bits)*8)

	var my16Bits uint16 = 30
	fmt.Printf("type: %T , value: %d, bytes: %d , bits: %d \n" , my16Bits , my16Bits , unsafe.Sizeof(my16Bits), unsafe.Sizeof(my16Bits)*8)

	var my32Bits uint32 = 40 
	fmt.Printf("type: %T , value: %d, bytes: %d , bits: %d \n" , my32Bits , my32Bits , unsafe.Sizeof(my32Bits), unsafe.Sizeof(my32Bits)*8)

	var my64Bits uint64 = 50 
	fmt.Printf("type: %T , value: %d, bytes: %d , bits: %d \n" , my64Bits , my64Bits , unsafe.Sizeof(my64Bits), unsafe.Sizeof(my64Bits)*8)

	var myUnitBit uint = 60 
	fmt.Printf("type: %T , value: %d, bytes: %d , bits: %d \n" , myUnitBit , myUnitBit , unsafe.Sizeof(myUnitBit), unsafe.Sizeof(myUnitBit)*8)

*/

/*
	var myFloat float32 = 3.14
	fmt.Printf("type %T , value%f , bites:%d , bits %d \n" , myFloat , myFloat , unsafe.Sizeof(myFloat) , unsafe.Sizeof(myFloat) * 8)

	var myFloat64 float64 = 31.12
	fmt.Printf("type %T , value%f , bites:%d , bits %d \n" , myFloat64 , myFloat64 , unsafe.Sizeof(myFloat64) , unsafe.Sizeof(myFloat64) * 8)

	myNewFloat := 4547.54
	fmt.Printf("type %T , value%f , bites:%d , bits %d \n" , myNewFloat , myNewFloat , unsafe.Sizeof(myNewFloat) , unsafe.Sizeof(myNewFloat) * 8)

*/

	// var myStringVar3 string = "test1234"
	// fmt.Printf("Mi valor : %s \n" , myStringVar3 )

	// myString4 := `My String de texto dinamico
	// con multiples lineas
	// xD`

	// fmt.Printf(myString4)

	// {
	// 	// floatVar := 33.11
	// 	// fmt.Printf("type: %T , value: %.2f \n" , floatVar ,floatVar)

	// 	// floatStrVar := fmt.Sprintf("%.2f" , floatVar)
	// 	// fmt.Printf("type: %T , value: %s \n" , floatStrVar ,floatStrVar)
	
	// 	// intVar := 22
	// 	// fmt.Printf("type: %T , value: %d \n" , intVar ,intVar)

	// 	// intStrVar  := fmt.Sprintf("%d" , intVar)
	// 	// fmt.Printf("type: %T , value: %s \n" , intStrVar ,intStrVar)
	
	// 	intVar2 := 342
	// 	intStrVar2 := strconv.Itoa(intVar2)
	// 	fmt.Printf("type: %T , value: %s \n" , intStrVar2 ,intStrVar2)

	// }


	strIntVar , err := strconv.Atoi("15")
	fmt.Printf("Type: %T , Value: %d , Error : %v \n" , strIntVar ,strIntVar , err)

	strVar3, err := strconv.ParseInt("11" , 8 ,64)
	fmt.Printf("Type: %T , Value: %d , Error : %v \n" , strVar3 ,strVar3 ,err)


}