object MyClass {

    def toFaranhite(c: Double) = {
        println(c*1.800 + 32 + " F");
    }

    def Volume(r: Double) = {
        println(4.0/3.0*math.Pi*r*r*r);   
    }

    def Wcost(c: Double) = {
        var x :Double = 0;
        var total :Double = 0;
        
        x = c*24.95;
        total = x - x*40/100;
        
        if(c>50){ total = total + 3 + (c-50)*0.75; }
        else{ total = total + 3; }
        println(total);   
    }
    
    def main(args: Array[String]) {
        toFaranhite(35);
        Volume(5);
        Wcost(60);
    }
}