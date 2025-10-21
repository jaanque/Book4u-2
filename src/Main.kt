import kotlinx.coroutines.runBlocking
import java.util.Scanner

fun main() = runBlocking {
    val scanner = Scanner(System.`in`)
    while (true) {
        println("1. Register")
        println("2. Login")
        println("3. Exit")
        print("Choose an option: ")
        when (scanner.nextInt()) {
            1 -> {
                print("Enter email: ")
                val email = scanner.next()
                print("Enter password: ")
                val password = scanner.next()
                if (register(email, password)) {
                    println("Registration successful!")
                }
            }
            2 -> {
                print("Enter email: ")
                val email = scanner.next()
                print("Enter password: ")
                val password = scanner.next()
                if (login(email, password)) {
                    println("Login successful!")
                    displayUserData()
                }
            }
            3 -> return@runBlocking
            else -> println("Invalid option")
        }
    }
}
