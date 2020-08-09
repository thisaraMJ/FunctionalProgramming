package main.scala

object AddPoints {
def main(args:Array[String]): Unit ={
  print("x1=")
val x1=scala.io.StdIn.readInt()
  print("y1=")
  val y1=scala.io.StdIn.readInt()
  val p1=Point(x1,y1)
  println(p1)
  print("x2=")
  val x2=scala.io.StdIn.readInt()
print("y2=")
  val y2=scala.io.StdIn.readInt()
  val p2=Point(x2,y2)
  println(p2);
  print("p1+p2=")
  val p3=p1+p2


  println(p3);


}
}

case class Point(x:Int,y:Int){
  def +(that:Point)=Point(this.x+that.x,this.y+that.y)
}
