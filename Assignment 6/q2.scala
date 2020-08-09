package main.scala

object MovePoint {

    def main(args:Array[String]): Unit =
    {
      print("x=")
      val x1=scala.io.StdIn.readInt()
      print("y=")
      val y1=scala.io.StdIn.readInt()
      val p1=Point1(x1,y1)
      print(p1);

      print("\ndx=")
      val x2=scala.io.StdIn.readInt()
      print("dy=")
      val y2=scala.io.StdIn.readInt()
      val p2=p1.move(x2,y2)
      print("After moving="+p2)
    }
  }

  case class Point1(x:Int,y:Int){
    def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
  }

