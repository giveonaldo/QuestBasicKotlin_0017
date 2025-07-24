class Contact(val id: Int, var email: String)

fun main() {
    val contact = Contact(1, "hello@mail.com")
    println(contact.email)
    contact.email = "giveonaldo@gmail.com"
    println(contact.email)
}