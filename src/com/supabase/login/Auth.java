package com.supabase.login;

import io.supabase.GoTrue;
import org.json.JSONObject;

public class Auth {
    public static boolean register(String email, String password) {
        try {
            GoTrue auth = Supabase.client.auth;
            JSONObject response = auth.signUp(email, password);
            return response.has("user");
        } catch (Exception e) {
            System.out.println("Error during registration: " + e.getMessage());
            return false;
        }
    }

    public static boolean login(String email, String password) {
        try {
            GoTrue auth = Supabase.client.auth;
            JSONObject response = auth.signInWithPassword(email, password);
            return response.has("user");
        } catch (Exception e) {
            System.out.println("Error during login: " + e.getMessage());
            return false;
        }
    }
}
