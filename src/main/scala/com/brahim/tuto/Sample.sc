import com.brahim.tuto.Rational;

// Scripting code

def greet(){println("Hi")}

greet() ==()

for( element <- 1 to 10 ){

}


var increase = (x: Int) => x + 1

println(increase(5))

val someNumbers = List(-11, -10, -5, 0, 5, 10)

//someNumbers.filter(_ > 0)

someNumbers.filter(_ > 5).foreach(println _)



val arr = Array("What's", "up", "doc?")

print(arr)


var cL = List("India", "USA", "UK", "CHINA", "Russia")

def f1(s: String):String ={
    println("Printing " +s +"\n");
 return  "Returning_" +s ;
}
//cL.foreach(f1)
cL.map(f1).foreach(println _)

someNumbers.exists( _ < 0)



