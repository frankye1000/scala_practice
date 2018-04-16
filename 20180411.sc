// Pattern Matching
def numberToString(x:Int)={
  x match {
    case 1 => "One"
    case 2 => "Two"
    case 3 => "Three"
    case _ => "Many"
  }
}

println(numberToString(2))
/////////////////////////////
def numberToString1(x:Int)={
  x match{
    case 1|2|3=>"One or Two or Three"
    case _=>"Many"
  }
}

println(numberToString1(1))
///////////////////////////
def scoreMatch(x:Int)={
  x match{
    case a if (a >90) => "A"
    case b if (b>=80) => "B"
    case other => "c or below"
  }
}

println(scoreMatch(66))

///////////////////////////

class Stock (val id:String, val price:Int)
def stockMatch(x:Stock) = {
  x match{
    case a if (a.id =="TSNC") || a.price > 100 =>"sell"
    case b if (b.id =="TSNC") || b.price <=80  =>"buy"
    case c => "do nothong"
  }
}

val s = new Stock("TSNC",150)
stockMatch(s)

//Enumeration
class EnumWeekDay1{
  val Mon = 1
  val Tue = 2
  val Wed = 3
  val Thr = 4
  val Fri = 5
  val Sat = 6
  val Sun = 7
}

val weekDay = new EnumWeekDay1
val day = weekDay.Mon
/////////////////////////////////
object EnumWeekDay2{
  val Mon = 1
  val Tue = 2
  val Wed = 3
  val Thr = 4
  val Fri = 5
  val Sat = 6
  val Sun = 7
}

val day1 = EnumWeekDay2.Mon
////////////////////////////////

object EnumWeekDay3{
  type EnumWeekDay3 = Int
  val Mon = 1
  val Tue = 2
  val Wed = 3
  val Thr = 4
  val Fri = 5
  val Sat = 6
  val Sun = 7
}

import EnumWeekDay3._

val day2:EnumWeekDay3 = EnumWeekDay3.Mon





