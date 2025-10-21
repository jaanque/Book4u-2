import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.gotrue.GoTrue
import io.ktor.client.engine.cio.CIO

object Supabase {
    val client: SupabaseClient = createSupabaseClient(
        supabaseUrl = "https://zqprlyjrywyljjinvepa.supabase.co",
        supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InpxcHJseWpyeXd5bGpqaW52ZXBhIiwicm9sZSI6ImFub24iLCJpYXQiOjE3NjA5MDk1NDIsImV4cCI6MjA3NjQ4NTU0Mn0.s8rVj_HbBxbcyWV6RfDQ1mDbEHPTNy8touAaUCHydL0"
    ) {
        install(GoTrue)
        httpEngine = CIO.create()
    }
}
