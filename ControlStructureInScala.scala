package com.brahim.tuto

import java.io.{FileNotFoundException, FileReader,IOException}

object ControlStructureInScala {

  def main (args :Array[String]) : Unit ={

    val filesHere = (new java.io.File(".")).listFiles

    // we can do filter in if
    for (file <- filesHere if file.getName.endsWith(".scala")){
      println(file)
    }

   // You could alternatively accomplish the same goal with this code:
    for (file <- filesHere)
      if (file.getName.endsWith(".scala"))
        println(file)


    //more condition
    for (
      file <- filesHere
      if file.isFile;
      if file.getName.endsWith(".scala")
    ) println(file)


     // producinf a new collection  with name file Array[File],
    //The yield goes before the entire body.
    def scalaFiles =
      for { file <- filesHere;  if file.getName.endsWith(".scala")} yield file


    /**
      * Try Catch  : Scala does not require you to catch checked exceptions
      * you can skip catch
      */
    var  f = new FileReader("input.txt")
    try {
     
      // Use and close file
    } catch {
      case ex: FileNotFoundException => // Handle missing file
      case ex: IOException => // Handle other I/O error
    }finally {
      f.close();
    }


  }
}
