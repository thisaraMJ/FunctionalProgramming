import math.{ sqrt, pow }
object DistancePoints {
  def main(args:Array[String]): Unit = {
    print("x1=")
    val x1 = scala.io.StdIn.readInt()
    print("y1=")
    val y1 = scala.io.StdIn.readInt()
    val p1 = Point2(x1, y1)
    println(p1)
    print("x2=")
    val x2 = scala.io.StdIn.readInt()
    print("y2=")
    val y2 = scala.io.StdIn.readInt()
    val p2 = Point2(x2, y2)
    println(p2);
    val n=p1.distance(p2)
    println(n)
  }
}

  case class Point2(x:Int,y:Int){


    def distance(that: Point2): Double =
      sqrt(pow(x - that.x, 2) + pow(y - that.y, 2))
  }

