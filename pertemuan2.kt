// Class
class Contact(val id: Int, var email: String)

// Contoh List
fun contohList() {
    // read only list
    val readOnly = listOf("me", "hello", "apa", "kabar")
    println(readOnly)

    val bentuk: MutableList<String> = mutableListOf("me", "hello")
    println(bentuk)
    bentuk.add("apa")
    println(bentuk)
    bentuk.removeAt(1)
    println(bentuk)
    bentuk[0] = "saya"
    println(bentuk)
}

// Contoh set
fun contohSet() {
    val readOnly = setOf("me", "satu", "dua")
    println(readOnly)

    val bentuk: MutableSet<String> = mutableSetOf("me", "hello", "saya")
    println(bentuk)
    bentuk.add("hello")
    bentuk.remove("saya")
    println(bentuk)
}

fun contohMap() {
    val readOnly: Map<String, Int> = mapOf("circle" to 1, "square" to 2, "quad" to 3)
    print(readOnly)

    val bentuk: MutableMap<String, Int> = mutableMapOf("me" to 1, "hai" to 2, "ge" to 3)
    bentuk.put("me", 4)
    println(bentuk)
}

fun conditional() {
    val number = 10
    if (number > 0) {
        println("positif number")
    } else {
        println("negative number")
    }

    val day: Byte = 3
    when (day) {
        1.toByte() -> println("sunday")
        2.toByte() -> println("monday")
        3.toByte() -> println("tuesday")
        4.toByte() -> println("thursday")
        5.toByte() -> println("friday")
    }

    val value: String = "10"
    try {
        val result = value.toByte()
        println(result)
    }
    catch(e: NumberFormatException) {
        println("invalid number")
    }

    val cars: List<String> = listOf("sedan", "toyota", "mitshubishi")
    for (car in cars) {
        println(car)
    }

    for (range in 1..10) {
        print(range)
    }
}

fun withoutParameter(){
    println("hello worlds")
}

fun withParameter(name: String) {
    println("nama saya: $name")
}

fun withDefaultParameter(name: String = "Aldo", age: Byte) {
    println("Nama saya $name umur $age")
}

fun withReturn(panjang: Byte, lebar: Byte): Int {
    return panjang.toInt() * lebar.toInt()
}

fun main() {
    val contact = Contact(1, "hello@mail.com")
    // println(contact.email)
    contact.email = "giveonaldo@gmail.com"
    // println(contact.email)

    contohList()
    contohSet()
    contohMap()
    conditional()
    withoutParameter()
    withParameter("abriansyah adam")
    withDefaultParameter("Giveon", 22)
    println(withReturn(20, 5))
}