
class A{
    private var name: String = "Shakeel";

    fun printMe()
    {
        println("My Name is $name")
    }
}

fun main(args: Array<String>)
{
    val obj = A();

    obj.printMe()
}