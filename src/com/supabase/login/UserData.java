package com.supabase.login;

import io.supabase.GoTrue;
import org.json.JSONObject;

public class UserData {
    public static void displayUserData() {
        try {
            GoTrue auth = Supabase.client.auth;
            JSONObject user = auth.getUser();
            if (user != null) {
                System.out.println("User ID: " + user.getString("id"));
                System.out.println("Email: " + user.getString("email"));
                System.out.println("Created At: " + user.getString("created_at"));
            } else {
                System.out.println("No user is currently logged in.");
            }
        } catch (Exception e) {
            System.out.println("Error fetching user data: " + e.getMessage());
        }
    }
}
