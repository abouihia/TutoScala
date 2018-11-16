package com.brahim.tuto

import scala.collection.mutable.Set
import scala.collection.mutable.Map

object TutoScriptingScala {


  def main (arg : Array[String] ): Unit ={


    val  greetings : Array[String] = new Array[String](3);

    val  greetings2 = Array("Zero", "One","Two")
    var list  = List(1,2,3);
    var list2  = List(11,12,13);
    var concatenedList1AndList2 = list:::list2;//  print =>1,2,3,11,12,13

    val twoThree = List(2, 3)
    val oneTwoThree1 =  twoThree.::(1)
    val oneTwoThree = 1 :: twoThree
    println(oneTwoThree) //  print => 1,2,3

    val oneTwoThree2 = 111 :: 2222 :: 3333 :: Nil
    println(oneTwoThree2)

    //Sets and Maps

    var jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear"
    println(jetSet.contains("Cessna"))


    // Maps

    val treasureMap = Map[Int, String]()
    treasureMap += (1 -> "Go to island.")
    treasureMap += (2 -> "Find big X on ground.")
    treasureMap += (3 -> "Dig.")
    println(treasureMap(2))

    val romanNumeral = Map( 1 -> "I", 2 ->
      "II", 3 -> "III", 4 -> "IV", 5 -> "V")
    println(romanNumeral(4))

    // read File  scala




    greetings(0)= "Hello"
    greetings(1)= "Scala"
    greetings(2)= "Students"


    for(arg <-greetings ){
       println(arg);
    }

    println(greetings.apply(1))
    println( 1.+(2))

    // operator equals in Scala.

    println(List(1, 2, 3) == List(1, 2, 3));
    println(List(1, 2, 3) == List(4, 5, 6));
    println(1 == 1.0);
    println(List(1, 2, 3) == "hello");
    println(  List(1, 2, 3) == null);//No exception will be thrown:
    println(  null  ==  List(1, 2, 3) );//No exception will be thrown:
    println( ("he"+"llo") == "hello");




  }



}
