package main

import (
	"fmt"
	"unsafe"
)

func main() {
	var intVar int = 30
	fmt.Printf("type : %T , value : %d , bytes: %d , bits : %d \n", intVar, intVar, unsafe.Sizeof(intVar), unsafe.Sizeof(intVar)*8)

	var myArrayVar1 [5]int 
	fmt.Println(len(myArrayVar1))

	 myArray2 := [3] string{"Value1" , "Value2" , "Value3"}
	 fmt.Println(myArray2 , "- Size " , len(myArray2))

	 myArrayVar1[0] = 2
	 myArrayVar1[1] = 5
	 myArrayVar1[2] = 9
	 
	 fmt.Println(myArrayVar1 , "- Size " , len(myArrayVar1))
	 fmt.Println(myArrayVar1[1:3])

	 for i , v := range myArrayVar1 {
		fmt.Println("index: " , i ," " , "value: " , v)
	 }

}
