package main.scala

object SwitchPoint {
  def main(args: Array[String]): Unit = {
    print("x=")
    val x1 = scala.io.StdIn.readInt()
    print("y=")
    val y1 = scala.io.StdIn.readInt()
    val p1 = Point3(x1, y1)
    print("p1="+p1)
    val p2=p1.invert()
    print("\nAfter inverting:"+p2)
  }
}

case class Point3(x:Int,y:Int){
  def invert()=Point3(y,x)
}