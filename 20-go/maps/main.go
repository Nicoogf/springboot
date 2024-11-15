package main

import(
	"fmt"
)

func main(){
	map1 := make( map[int]string )

	map1[1] = "A"
	map1[2] = "B"
	map1[3] = "C"
	map1[99] = "Z"

	v , ok := map1[9]
	fmt.Println("El valor es : " , v , "Existe ? : " , ok)

	v , ok = map1[8]
	fmt.Println("El valor es : " , v , "Existe ? : " , ok)

	map3 := map[int]string{
		4:"A",
		1:"N",
		8:"90",
	}

	fmt.Println(map3)

	for k := range map1 {
		fmt.Println("Key" , k , "value" , map1[k])
	}
}