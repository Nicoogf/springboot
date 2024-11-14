package main

import "fmt"

func main () {
	sum := 0 
	
	for i := 0 ; i < 10 ; i++ {
		fmt.Printf("En el valor de %d , la variable sum vale %d \n" , i , sum)
		sum++
		
	}

	sum = 1
	fmt.Println(sum)

	for sum < 1000 {
		fmt.Println("Hola")
		sum += 100
	}
	
}