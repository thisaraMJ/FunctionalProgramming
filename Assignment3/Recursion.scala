object Recursion {
    	def prime(n:Int,i:Int=2):Boolean = {
		if(n<=2){
			if(n==2) return true;
			else return false;
		}
		if(n%i==0) return false;
		if(i*i>n) return true;
		return prime(n,i+1);
	}
	def primeSeq(n:Int):Unit = {
		if(prime(n)) println(n);
		if(n>0) primeSeq(n-1);
	}
	def fibonacci(n:Int):Int= n match{
		case x if x==0 => 0;
		case x if x==1 => 1;
		case x => fibonacci(n-1)+fibonacci(n-2);
	}
	def fibonacciSeq(n:Int):Unit= {
		if (n > 0) fibonacciSeq(n-1);
		println(fibonacci(n));
	}
	def addition(n:Int): Int = {
	    	if (n==0) return 0;
	    	if (n==1) return 1;
		return (n+addition(n-1));
	}
	def printEvenOdd(n:Int):Unit = {
	    	if (n==0) {println("Even number"); return;}
	    	if (n==1) {println("Odd number"); return;}
	    	else { return (printEvenOdd(n-2)) }
   	 }
    	def sumOfEven(n:Int,start:Int = 2):Int = {
        		if(start==n) return start;
        		if(start==n-1) return start;
        		else return (start+sumOfEven(n,start+2));
    	}
    
    	def main(args: Array[String]) {
        		//val x = prime(3);
        		//println(x);
        		//val y = fibonacci(5);
        		//primeSeq(6);
        		//print(y);
        		//fibonacciSeq(5);
        		//val z = addition(5);
        		//print(z);
        		//printEvenOdd(10);
        		//println(sumOfEven(6));
    	}
}