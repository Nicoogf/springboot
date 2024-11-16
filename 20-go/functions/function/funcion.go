package function

import (
	"errors"
	"fmt"
)

type Operation int 

const (
	SUM Operation = iota
	SUB 
	DIV
	MUL
)

func Display( myValue string) {
	fmt.Printf( "Buenos dias %s importando funcion" , myValue )
}

func display( myValue string) {
	fmt.Printf( "Buenos dias %s importando funcion" , myValue )
}

func SumaPrueba( value1 , value2 int  ) int {
	return value1 + value2
}

func RepeatString( increment int , value string ) {
	for i := 0 ; i < increment ; i++ {
		fmt.Print(value)
	}  
}

func Calc( op Operation , x , y float64) (float64 , error ) {
	switch op {
	case SUM :
		return x + y , nil
	case SUB :
		return x - y , nil
	case MUL :
		return x * y , nil
	case DIV :
		if( y == 0 ){
			return 0 , errors.New("y must")
		} 
		return x / y , nil
	}
	return 0, errors.New("Has been an error")
	
}

func Split ( v int ) ( x ,y int ) {
	x = v * 4/9
	y = v-x
	return 
}

func SumaTodosDigitos( values ...float64) float64 {
	var sum float64
	for _, v := range values{
		sum += v
	}
	return sum
}