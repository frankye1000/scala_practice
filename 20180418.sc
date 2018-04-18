import scala.io._
import scala.util.Random
val source = Source.fromFile("/home/frank/IdeaProjects/test/text.txt")
val s = source.mkString
s.split("[\\s.,]+") foreach println


val source_int = Source.fromFile("/home/frank/IdeaProjects/test/int.txt")
val i = source_int.mkString
val b = i.split("\\s+") map(x=>x.toInt)
source.close()
source_int.close()

import java.io._
val filein = new FileInputStream("/home/frank/IdeaProjects/test/int.txt")
val fileout = new FileOutputStream("/home/frank/IdeaProjects/test/outint.txt")

var byte = filein.read()

while(byte>=0){
  fileout.write(byte)
  byte = filein.read()
}
filein.close()
fileout.close()

//other io
//val urlsource = Source.fromURL("https://tw.yahoo.com/")
//val lines = urlsource.getLines()
//lines.take(10) foreach(println)

//urlsource.close()

//
import java.io.File
val file = new File(".")
file.exists()

file.isDirectory

val files = file.listFiles

//
def lineCurried(a:Double)(b:Double)(x:Double)=a*x+b

def f:(Int=>Int)=>Int=>Int = m=>a=>m(a)
f(x=>x*x)
f(x=>x*x)(3)
f(x=>x*x)(4)


def compose[A, B, C](f:B=>C, g:A=>B):A=>C=
  a=>f(g(a))

def compose1[A, B, C](f:B=>C, g:A=>B)=
  (b:A)=>(f(g(b))):C

val h = compose[Int,Int,Int](x=>x+2,x=>x+2)
h(3)
//Laziness Evalution
(1 to 10 ) map(_+1) filter(_%2==0) filter(_%5!=0) map(_*2)

lazy val y ={println("y:"); 100}
y

List[Int]() == List[Nothing]()

//Recursion
//GCD
def gcd(m:Int,n:Int):Int = n match{
  case 0 => m
  case _ => gcd(n,m%n)
}
gcd(12,4)
//Hanoi Tower
def hanoiMove(n:Int,
              from:String,
              to:String,
              via:String):Unit=
  n match {
    case 1 => println("Move from "+from +" to "+to)
    case n=>{
      hanoiMove(n-1, from, via, to)
      hanoiMove(1,from, to , via)
      hanoiMove(n-1, via, to ,from)
    }
  }

hanoiMove(3,"A" ,"C","B")


val in =List(List(1,2,3,4,5),List(6,7,8,9,10))
val step1 = in.zipWithIndex
val step2 = step1.map{r => (r._1.zipWithIndex,r._2)}
val step3 = step2.map{r=>r._1.map(c=>(c._1, r._2, c._2))}
val step4 = step3.flatten

//Set
Set('A','B','C') ('C')

//List
val l = List.fill(5)(99)
val l1 = List.fill(2,5)(100)
val l2 = List.fill(10)(Random.nextInt(100))
val numbers = 11::22::33::44::55::Nil
val num = 11::22::numbers

