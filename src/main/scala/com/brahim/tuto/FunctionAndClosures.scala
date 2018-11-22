package com.brahim.tuto

import scala.io.Source

object FunctionAndClosures {

      def  main( args : Array [String]) : Unit = {


        print ( a(1,2,3))// partial applied function
        print ( b(2))// partial applied function

        makeIncreaser(13);

        val arr = Array("What's", "up", "doc?")
        echo(arr : _*);
      }

  def processFile(filename: String, width: Int) {

    //her we define function inside an other function ( we called this : local functions)
    def processLine(  line: String) {
          if (line.length > width){
              print(filename +": "+ line)
          }
    }
    val source = Source.fromFile(filename)
    for (line <- source.getLines) {
      processLine(filename)
    }
  }

  // first class function
  // cad : you can express functions in function literal syntax, i.e., (x: Int) => x + 1
  // function lateral is compiled into a class that when instantiated at runTile is function value
  // the distinction is much like between classes(sources code) and object (runtime)

  (_: Int) + 1;  // class
   var  increase  =  {
     (_:Int) +1;
     println("this code"); println("this code");println("this code");
   };  // store value in variable


  //Partially applied functions

  def sum(a: Int, b: Int, c: Int) = a + b + c

  val a = sum _  // her as exemple of partial applied function: you don't supply all of the argument needed by the function

  val b  = sum( 1, _:Int, 3);
 // val c  = sum( _, _:Int, _);
 // val d  = sum( _, _, _);

  //Closures
   val mores= 9999;

  (x: Int) => x + mores

  def makeIncreaser(more: Int) = (x: Int) => x + more

  // repetead parameters

   def echo(args: String*)={
     for (arg <- args){
       println(arg)
     }
   }


  //Tail recursion

}
