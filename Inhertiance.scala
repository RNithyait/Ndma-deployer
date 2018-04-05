 
class Point(val a:Int,val b:Int)
{
	var x : Int = a;
	var y : Int = b;
	println(a);
	println(b);
	def move(ac:Int , bc:Int)
	{
		println(a+ac);
		println( bc);
	}
}
class Location(override val a : Int,override val b : Int, val c : Int) extends Point(a, b) 
{var z: Int = c;

	def moves(ac:Int , bc:Int,cc :Int)
	{
		println(a+ac);
		println(b+bc);
		println(c+cc);
	}
}
object Inhertiance{
	def main(args : Array[String])
	{
		var pt = new Location(50,100,150);
		pt.moves(50,100,150);
	}
}