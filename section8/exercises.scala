// Check for Single Even:
def check_even(num:Int) = num%2 == 0

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

// Balance Check:
def balance(mylist:List[Int]): Boolean = {
  var firsthalf = 0
  var secondhalf = mylist.sum

  for(i <- Range(0, mylist.length)){
    firsthalf = firsthalf + mylist(i)
    secondhalf = secondhalf - mylist(i)

    if(firsthalf == secondhalf){
      return true
    }
  }
  false
}

// Palindrome Check:
def palindrome(word:String) = word == word.reverse

//println(check_even(3))
//println(check_list(List(1,3,11)))
//println(lucky_seven(List(1,7,10,14)))
//println(balance(List(2,3,3,3)))
println(palindrome("maoam"))
