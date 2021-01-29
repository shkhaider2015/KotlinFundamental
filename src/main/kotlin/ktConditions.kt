
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

    println("Loop Example")
    loopExample()

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
    val marks = arrayOf(44, 67, 84, 98, 65);

    println("First Example")
    for (ele in marks)
    {
        println("$ele");
    }

    println("Second Example");
    for(index in marks.indices)
    {
        print("$index \t");
    }

    println("Iterate Through Range");
    print("for (i in 1..5) print(i) = ")
    for (i in 1..5) print(i)
    println()

    print("for (i in 5 downTo 1) print(i) = ")
    for (i in 5 downTo 1) print(i)
    println()

    print("for (i in 1..5 step 2) print(i) = ")
    for (i in 1..5 step 2) print(i)
    println()
}