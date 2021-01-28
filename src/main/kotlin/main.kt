import com.sun.xml.internal.fastinfoset.util.StringArray

fun main(args: Array<String>) {
    println("Hello World!")

    println("dataTypes() Called");
    dataTypes();

    println("stringTypes() Called");
    stringTypes();

    println("arrayExample()");
    arrayExample();

    println("Collection Example")
    collection();
}

fun dataTypes()
{
    val A : Int;
    A = 1;

    val B : Float = 3.76f;
    val C : Double = 3.8768;

    println(" A : $A ,\n B : $B,\n C : $C ");
}

fun stringTypes()
{
    var first : String = "I am first string !!"; // could be reassigned
    val second : String = "I am second string !!" // couldn't be reassigned

    first = "First string changed"; // compile
//    second = "Second string changed"  Error

    println("$first \n$second");
}

fun arrayExample()
{
    val myInt : IntArray = intArrayOf(1, 2, 3, 4, 5);
    val myChar : CharArray = charArrayOf('a', 'b', 'c', 'd', 'e');
    val myString = arrayOf<String>("Shakeel", "Haider");
    val myAnotherInt = arrayOf<Int>(11, 22, 33, 44, 55);
    val mixTypes = arrayOf(111, 222, 333, "shk", "hai", "eel");
    val zeros = Array<Int>(5){0};

    // modify array
    myAnotherInt.set(4, 6);
    myAnotherInt[2] = 7;



    for (ele in myAnotherInt)
    {
        println("$ele")
    }

}

fun collection()
{
    val number: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5);
    val readOnlyNumbers : List<Int> = listOf(21, 22, 23, 24, 25);

    println("Mutable list : $number");
    println("Immutable List : $readOnlyNumbers");

    number.add(6);
    println("Mutable List after added : $number")

}

