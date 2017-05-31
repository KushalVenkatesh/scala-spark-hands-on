// Check for Single Even:
def check_even(num:Int): Boolean={
	if(num%2 == 0){
		true
	}
	else false
}

// Check for Evens in a List:
def check_list(x:List[Int]): Boolean={
	for(item <- x){
		if(item%2 == 0){
			return true
		}
	}
	false
}

// Lucky Number Seven:
def lucky_seven(x:List[Int]): Int={
	var sum:Int = 0
	for(item <- x){
		if(item == 7){
			sum += 14		
		}
		else{
			sum += item
		}
	}	
	sum
}

println(check_even(3))	
println(check_list(List(1,3,11)))
println(lucky_seven(List(1,7,10,14)))
