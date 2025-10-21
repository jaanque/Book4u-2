package com.supabase.login;

import io.supabase.SupabaseClient;

public class Supabase {
    private static final String SUPABASE_URL = "https://zqprlyjrywyljjinvepa.supabase.co";
    private static final String SUPABASE_KEY = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InpxcHJseWpyeXd5bGpqaW52ZXBhIiwicm9sZSI6ImFub24iLCJpYXQiOjE3NjA5MDk1NDIsImV4cCI6MjA3NjQ4NTU0Mn0.s8rVj_HbBxbcyWV6RfDQ1mDbEHPTNy8touAaUCHydL0";

    public static final SupabaseClient client = new SupabaseClient(SUPABASE_URL, SUPABASE_KEY);
}
