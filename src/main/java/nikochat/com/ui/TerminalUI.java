package nikochat.com.ui;

import nikochat.com.app.AppConfig;
import nikochat.com.app.AppConstants;
import nikochat.com.exceptions.ServerUnavailableException;

import java.util.Scanner;

/**
 * Created by nikolay on 23.08.14.
 */
public class TerminalUI {

    private Scanner scanner;

    public TerminalUI() {
        scanner = new Scanner(System.in);
    }

    public String getServerIP() {
        System.out.println("Enter IP for connection to server");
        System.out.println("Format: XXX.XXX.XXX.XXX");
        System.out.print("_______>");
        return scanner.nextLine();
    }

    public String getClientName() {
        System.out.print("Enter your name: >");
        return scanner.nextLine();
    }

    public String read() {
        return scanner.nextLine();
    }

    public int getPort() {
        return AppConfig.PORT;
    }

    public void write(String line) {
        System.out.println(line);
    }
}
