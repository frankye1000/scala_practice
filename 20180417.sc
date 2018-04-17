import com.sun.net.httpserver.Authenticator.Success

import scala.io.StdIn
import scala.util.Try

//try-catch
def half(n:Int)={
  try{
    if( n%2 == 0){
      n/2
    }
    else{
      throw new RuntimeException("input is not even")
    }
  }
  catch {
    case ex: RuntimeException=>println("Exception happened")
  }

}
half(4)
half(5)

def avg(list:List[Double]):Double=
  if(list.isEmpty)
    throw new IllegalStateException("Empty List")
  else
    list.sum/list.size
avg(List(1,2,4,5))

def avg2(list:List[Double]):Tuple2[Int, Double]=
  if(list.isEmpty)
    (1,0)
else
    (0, list.sum/list.size)

val a = avg2(List())
val b = avg2(List(1.1,3))

//option
sealed trait Option[+A]
case class Some[+A](get:A) extends Option[A]
case object None extends Option[Nothing]

def avg3(list:List[Double]):Option[Double]=
  if(list.isEmpty)
    None
  else
    Some(list.sum/list.size)

println(avg3(List(1.2,2.4,3.6)))
println(avg3(List()))


val aa = avg3(List(1.2,1.3,1.4))

//println(aa.getOrElse("It is empty"))
//println(avg3(List()).getOrElse("It is empty"))

//option

case class Teacher(name:String, dept:String, age:Int)

val teachers = Map("Jimmy"-> Teacher("Jimmy","CS",33),
                   "Frank"-> Teacher("Frank","AOCC",25),
                   "Kent"-> Teacher("Kent","AMES",27) )

def deptOf(name:String):scala.Option[String]=
  teachers.get (name) map {_.dept}


println(deptOf("Frank"))
println(deptOf("nn"))

def threeDiv(divisor:Double):Option[Double]=
  if(divisor==0) None
  else Some(3/divisor)

def fourDiv(divisor:Double):Option[Double]=
  if(divisor==0) None
  else Some(4.0/divisor)

//Some (8.0).flatMap(threeDiv(_))
//fourDiv(0.5) flatMap (threeDiv(_))

//try catch

val deno = Try(StdIn.readLine("Deno: ").toInt)
val divisor = Try(StdIn.readLine("Divisor: ").toInt)

val result = deno flatMap(x=> divisor.flatMap(y=>Try(x/y)))

//result match{
  //case Success(v) => println("result: " + v)
  //case Failure(e) => println(e)
//}

def abs(x:Int)=if (x>0) x else -x

assert(abs(1) == 1)
assert(abs(-1)== 1)
assert(abs(-2)== 2, "abs(-2)!=2")

//re
val telnumber ="""(\d\d)-(\d\d\d\d\d\d\d)""".r

val s = "02-1234567, 03-1234567"

val result1 = (telnumber findAllIn(s)).toList

import scala.io._
val source = Source.fromFile("/home/frank/IdeaProjects/test/text.txt")
for (c <- source) println(c)
source.close()
val source1 = Source.fromFile("/home/frank/IdeaProjects/test/text.txt")
val lines = source1.getLines()
lines foreach(println)
source1.close()


