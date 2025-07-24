// Class
class Contact(val id: Int, var email: String)

// Contoh List
fun contohList() {
    // read only list
    val readOnly = listOf("me", "hello", "apa", "kabar")
    println(readOnly)
}

fun main() {
    val contact = Contact(1, "hello@mail.com")
    // println(contact.email)
    contact.email = "giveonaldo@gmail.com"
    // println(contact.email)

    contohList()
}