import at.favre.lib.crypto.bcrypt.BCrypt
import io.github.jan.supabase.gotrue.auth
import io.github.jan.supabase.gotrue.providers.builtin.Email
import kotlinx.coroutines.runBlocking

suspend fun register(email: String, password: String): Boolean {
    return try {
        val hashedPassword = BCrypt.withDefaults().hashToString(12, password.toCharArray())
        Supabase.client.auth.signUpWith(Email) {
            this.email = email
            this.password = hashedPassword
        }
        true
    } catch (e: Exception) {
        println("Error during registration: ${e.message}")
        false
    }
}

suspend fun login(email: String, password: String): Boolean {
    return try {
        Supabase.client.auth.signInWith(Email) {
            this.email = email
            this.password = password
        }
        true
    } catch (e: Exception) {
        println("Error during login: ${e.message}")
        false
    }
}
