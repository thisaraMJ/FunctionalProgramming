object Salary {

	def wage(hours:Int):Int={ hours*150 }
	def ot(hours:Int):Int={ hours*75 }
	def incomef(h1:Int,h2:Int):Int={ wage(h1)+ot(h2) }
	def tax(income:Int):Double={ income*(0.1) }
	def takeHome(h1:Int,h2:Int):Double={ incomef(h1,h2)-tax(incomef(h1,h2)) }


	def main(args: Array[String]) {
 		
		print("Input Working Hours: ");
		val h1 = scala.io.StdIn.readInt();
		print("Input Ot Hours: ");
		val h2 = scala.io.StdIn.readInt();
		val sal = 	takeHome(h1,h2);	
       		print("Take Home Salary Rs: ");
		print(sal);
	}
}

