package com.eight.P16_chainOfResponsibilityPattern;

import com.eight.P16_chainOfResponsibilityPattern.middleware.Middleware;
import com.eight.P16_chainOfResponsibilityPattern.middleware.RoleCheckMiddleware;
import com.eight.P16_chainOfResponsibilityPattern.middleware.ThrottlingMiddleware;
import com.eight.P16_chainOfResponsibilityPattern.middleware.UserExistsMiddleware;
import com.eight.P16_chainOfResponsibilityPattern.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Demo class. Everything comes together here.
 */
public class CORPTestDrive {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // All checks are linked. Client can build various chains using the same
        // components.
        Middleware middleware = Middleware.link(
                new ThrottlingMiddleware(1),
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware()
        );

        // Server gets a chain from client code.
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}
