package function

import (
	"fmt"
)

func Display(myValue int64) {
	fmt.Printf("Type: %T, Value: %d, Address: %v\n", myValue, myValue, &myValue)
}