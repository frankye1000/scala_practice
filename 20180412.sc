class C(x:Int){
  override def toString="an obj with value:"+x
}

val cl = new C(100)

s"The object is $cl"

def foo(n:Int)={n*n}
s"foo(10)+3=${foo(10)+3}"

val name ="Jim"
val height = 170.2
f"$name%s is $height%2.2f centermeters tall."

//trait
abstract class Bird
trait Swimming{
  def swim()
}
trait Flying{
  def fly()
}

class Hawk extends Bird with Flying{
  def fly()=println("I am doing Hawk's flying")

}

class Penguin extends Bird with Swimming{
  def swim()=println("I am doing Penguin's Swimmimg")

}

class Pelican extends Bird with Flying with Swimming {
  def fly()=println("I am doing Pelican's Flying")
  def swim()=println("I am doing Pelican's swimmimg")
}

class Chicken extends Bird

val pelican = new Pelican

pelican.fly()
pelican.swim()


trait SomeUnderfined{
  val a = 0
  val b:Int
  def f(x:Int):Int
}

abstract class A extends  SomeUnderfined{
  val b = 3
}

class B extends  SomeUnderfined{
  val b = 4

  def f(x: Int)=x+1
}

val b = new B
b.b

//if
val x = 10
if (x==10)
  println("x=10")
else
  println("x!=10")

val z = 10
val i = if (z>10) z else 9

//while
def fa(n:Int)={
  var r =1
  var i = n

  while (i>0){
    r+=1
    i=i-1
    print(r)
  }
}

fa(9)

//for
for (i<-1 to 10) print("*")
1 to 10
1 until 10



