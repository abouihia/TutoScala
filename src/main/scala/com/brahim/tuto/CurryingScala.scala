package com.brahim.tuto

object CurryingScala {

  def main(args : Array[String]) ={

    print(curriedSum(1)(2))
    print(second(2))
  }

  // non curried function
  def plainOldSum(x:Int, y:Int) =   x+y;

  //  curried function
  def curriedSum(x:Int)(y:Int) = x+ y;
  /*
     when you invoke curriedSum, you actually get two traditional function invocations back to back
     takes a single Int parameter named x, and returns a function value for the second function
   */

  def first(x: Int) = (y: Int) => x + y
 /**
   Applying 1 to the first function in other words, invoking the first function
    and passing in 1—yields the second function
   */

  val  second  = first(1);
  second(2);

  //use placeHolder  for the second argument
   val onePlus = curriedSum(1)_
  onePlus(2);



}
