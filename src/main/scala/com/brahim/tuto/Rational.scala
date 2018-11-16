package com.brahim.tuto

class Rational ( n: Int, d:Int) {

  require(d !=0)

   val  g = gcd(n.abs, d.abs)

  val   denum : Int = d/g;
  val   numer: Int  = n/g;

  def this( n:Int){  // auxiliary constructor : definir un constructor  autre que celui déjà defini
    this(n,1);// when you define  other consturctor it call first constructor rather thant super
                      // class constructor first (pas comme java)

  }

  override def toString =  numer +"/"+ denum;

  def add(that :Rational) : Rational ={
    new Rational( this.denum* that.numer+  this.numer* that.denum
                , this.denum* that.denum );
  }

  def  +( that:Rational):Rational ={
     new Rational(denum* that.numer+  numer* that.denum,    denum* that.denum )
  }

  def  +( n :Int):Rational = {
    new Rational( this.denum* n+ numer, this.denum)
  }

  def   - (that: Rational): Rational = {
    new Rational(
      numer * that.denum - that.numer * denum,
      denum * that.denum
    )
  }

  def - (i: Int): Rational ={
    new Rational(numer - i * denum, denum)
  }

  def * (that: Rational): Rational ={
               new Rational(numer * that.numer, denum * that.denum)
  }

  def * (i: Int): Rational ={
    new Rational(numer * i, denum)
  }

  def / (that: Rational): Rational ={
               new Rational(numer * that.denum, denum * that.numer)
  }

  def / (i: Int): Rational ={
    new Rational(numer, denum * i)}



  def  lessThan (that : Rational): Boolean={
     this.numer * that.denum   <   that.numer  * this.denum
  }

  def max(that: Rational) : Rational ={
     if( lessThan(that)) that  else this;
  }

  private def gcd(a: Int, b: Int): Int ={
      if( b == 0) a  else gcd(b, a % b);
  }


  implicit def intToRational(x: Int) : Rational ={
          return   new Rational(x);
  }


}


object Rational {

  def main(args: Array[String]): Unit = {

    val oneHalf = new Rational(1, 2)
    val twoThirds = new Rational(2, 3)


    println(oneHalf.intToRational(2 ) +  (oneHalf));
  }

}
