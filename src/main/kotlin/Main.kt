class Stack {

    private val list = mutableListOf<Int>()

    fun push(value: Int) {
        list.add(value)
    }

    fun pop() {
        val size = list.size
        val lastIndex = size - 1
        list.removeAt(lastIndex)
    }

    fun print() {
        println(list)
    }
}

fun reverse(s: String) {

}

fun main(args: Array<String>) {

//    // [1, 2, 3, 4, 5]
//
//    val stack = Stack()
//
//    stack.push(1)
//    stack.push(2)
//    stack.push(3)
//    stack.pop()
//    stack.push(5)
//
//    stack.print()
//
//    // [1, 2, 5]

    val a = "hello"
    val result = reverse(a)
    println(result) // "olleh"
}