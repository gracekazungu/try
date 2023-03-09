import kotlin.math.min

fun main(){
var z=strings("Hello","Greeting")
    println(numbers())
     var sum=array("there","you","dear")
    println(sum)
    println(splits())
    calculater(34,56)
    println(sum)
    println(div)
    println(sub)
    println(multi)




}
//. Write and invoke a function that takes in any 2 strings and returns the first
//character of the longer string or the first character of the first string if they are
//equal in length.
fun strings(x:String,y:String){
  if (x.length>y.length) {
      return (x)
      {
          else if(x.length==y.length){
              return(y)
      }
      }
  }
}
//Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements
fun numbers(){
    var numbers= arrayOf(23,34,45,56,67)
    println(numbers.min())
    println(numbers.max())
    println(numbers.average())
}
//Write and call a function that takes in a string and splits it into all the
//characters that constitute it. Your function should print out this output.
fun splits(){
    var name="wonderful"
    for (item in name)
        println(name)

}


//Write and call a function that takes in an array of strings, joins them all into
//one string and returns it.
fun array(n:String,m:String,l:String){
     var sum=n +" "+m+" "+"l"




}



//Create a calculator class that is capable of the following functions:
//(i) Addition of any 2 numbers
//(ii) Subtraction between any 2 numbers
//(iii) Accurate division between any 2 numbers
//(iv) Multiplication of any 2 numbers
//Instantiate your calculator object and invoke all its functions
class calculater(var num7:Int,var num8:Int){
    fun addition(){
        var sum=num7+num8
        println(sum)
    }fun division(){
        var div=num7/num8
        println(div)
    }
    fun subtraction(){
        var sub=num7-num8
        println(sub)
    }
    fun multiplication(){
        var multi=num7*num8
        println(multi)
    }

}