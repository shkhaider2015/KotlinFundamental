
fun main(args: Array<String>)
{
    val num: Int = 2;
    val num2 : Int = 4;


    // Traditional If else
    if (num == 2)
    {
        println("True")
    }
    else
    {
        println("False")
    }

    // Assign To variable

    val result = if(num > num2)
    {
        "$num is greater than $num2"
    }
    else
    {
        "$num is less than $num2"
    }
    println("result : $result")

    // another way
    val result2 = if(num > num2) "$num is greater than $num2" else "$num is less than $num2"
    println("result2 : $result2")

    println("Switch Example")
    switchExample();

}

fun switchExample()
{
    val x : Int = 5;

    when(x)
    {
        1 -> println("x == 1")
        2 -> println("x == 2")
        3 -> println("x == 3")
        4 -> println("x == 4")
        5 -> println("x == 5")
        6,7 -> println("x == 6 or 7")
        else -> {
            println("x == nothing")
        }

    }
}

fun loopExample()
{

}