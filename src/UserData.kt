import io.github.jan.supabase.gotrue.auth

suspend fun displayUserData() {
    val user = Supabase.client.auth.currentUserOrNull()
    if (user != null) {
        println("User ID: ${user.id}")
        println("Email: ${user.email}")
        println("Created At: ${user.createdAt}")
    } else {
        println("No user is currently logged in.")
    }
}
