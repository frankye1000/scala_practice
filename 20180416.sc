import java.io.File
//for
for(i<-1 to 10)
  print("*\n")

for(i <- 1 until(10))
  print(i)

for(i <-Range(1,10,2))
  print(i)

new java.io.File(".").listFiles

for(i <- new java.io.File(".").listFiles)
  print(i+"\n")

(new java.io.File(".").listFiles) foreach (println(_))

for(i<-List(1,2,3,3,4))
  print(i+" ")

for(i<-1 to 6){
  for (j<-1 to i){
    print("*")
  }
  println()
}

for(i<-1 to 6; j<-1 to i){
  print("+")
  if (j==i)
    println()
}

for(i<- 1 to 20; if i%2 == 0)
  print(i+" ")

for(i<- 1 to 20; j=i*2; if i%2 == 0 )
  println(i+", i*2 = "+j)
import scala.math._
//for comprehension
for(i <- 1 to 10; if(i%2 == 0)) yield(i)

def isPrime(x:Int)={
  val m:Int = floor(sqrt(x)).toInt
  (2 to m) forall(x % _ != 0)
}
for(i <- 2 to 100; if(isPrime(i))) yield(i)
//floor the method returns the largest interger that is less than or equal to the argument Return as a double

val files = (new java.io.File(".")).listFiles

val scalafiles = for(f <- files; if(f.getName.endsWith("scala"))) yield f

for(i <- 2 to 100;
    m = floor(sqrt(i)).toInt;
    if(2 to m) forall (i%_!=0)
) yield i

val s ="one/tom two/jimmy three/marry"

val a = s.split(" ")

val p = for( i <- a; p=i.split("/")) yield ((p(0),p(1)))

val a1 = p.unzip

val aa = Array(1,2,3,4,5)
val bb = Array(11,22,33,44,55)

val cc = aa zip bb

val dd = cc.unzip

(1 to 10 ) map {x=>x*x}

(1 to 10 ) withFilter(_%2==0) withFilter(_<=6) foreach {case x=>print(x*x+" ")}

val l1 = List(1,2,3,4)
val l2 = l1 map({x=>List(x,x*x)})
val l3 = l1 flatMap({x=>List(x,x*x)})
val l4 = l2 flatMap({x=>x})

val ls1 = List()

ls1 match {
  case Nil =>print("Nil ")
  case _ => print("Not Nil")
}

val ls2 = List(1,2,3)
ls2 match{
  case Nil => println("Nil")
  case x::ys => {println("x=" + x)
                 println("y=s" + ys)}
}

def vectorAdd(X:Tuple2[Double,Double],
              Y:Tuple2[Double, Double])={
  (X._1 + Y._1, X._2 + Y._2)
}

val (x,y) = vectorAdd((2, 3), (5, 10))

val t =(1,2,3,4,5)

for(i<-t.productIterator) println(i)

for(i<- 1 to 9){
  for(j<- 1 to 9){
    print(i*j+" ")
  }
  println()
}



for(i <- 1 to 4 ){
  for(l <- 1 to 4-i){
    print(" ")
  }
  for(j <- 1 to i*2-1){
    print("+")
  }
  println()
}

for(k <- 1 to 3){
  for(m <- 1 to k){
    print(" ")
  }
  for(m <-1 to 7-k*2){
    print("*")
  }
  println(" ")
}

