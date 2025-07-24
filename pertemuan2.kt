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

fun main() {
    val contact = Contact(1, "hello@mail.com")
    // println(contact.email)
    contact.email = "giveonaldo@gmail.com"
    // println(contact.email)

    contohList()
    contohSet()
    contohMap()
}