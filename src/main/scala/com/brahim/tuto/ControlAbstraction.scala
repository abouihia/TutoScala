package com.brahim.tuto

import java.io.{File, PrintWriter}

object ControlAbstraction {

  def main(arg: Array[String]): Unit = {


   println( twice(_ + 1,5)  );

    withPrinterWriter(
      new File("date.txt"),
      writer => writer.println(new java.util.Date)
    )

    //curring
    //withPrinterWriter(new File("date.txt"))(writer => writer.println(new java.util.Date)) ;

    println(myAssert(() =>5 > 3))
    println(byNameAssert(x / 0 == 0))

  }


  private def filesHere = (new java.io.File(".")).listFiles


  def filesEnding(query: String) = {

    filesMatching(query, _.endsWith(_))
  }


  def filesContaining(query: String) = {
    filesMatching(query, _.contains(_))
  }



  def filesRegex(query: String) = {
    filesMatching(query, _.matches(_))
  }


  def filesMatching(query: String, matchedResults: (String, String) => Boolean) = {
    for (file <- filesHere; if matchedResults(file.getName, query))
      yield file
  }




  /*****Writing control Strucuture*****/

  def   twice(op: Double => Double,x:Double) = op(op(x));

  def withPrinterWriter(file:File, op: PrintWriter => Unit): Unit ={

    val writer = new PrintWriter(file);
    try{
      op(writer)
    }finally {
      writer.close();
    }

  }

 /* def withPrinterWriter(file:File)( op: PrintWriter => Unit): Unit ={

    val writer = new PrintWriter(file);
    try{
      op(writer)
    }finally {
      writer.close();
    }

  }*/


  /***  byName **/

  var assertionsEnabled = true

  def myAssert(predicate:() => Boolean) =
    if (assertionsEnabled && !predicate())
      throw new AssertionError

  def byNameAssert(predicate: => Boolean) =
    if (assertionsEnabled && !predicate)
      throw new AssertionError




}
