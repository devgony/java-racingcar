package study.racing.utils;

import java.util.Scanner;

public final class ScannerUtils {

    private static final Scanner scanner = new Scanner(System.in);
    public static final String IS_NOT_A_NUMERIC_STRING = "not a numeric string.";

    private ScannerUtils() {
    }

    public static int nextInt() {
        validateNextIntOrThrow();
        return scanner.nextInt();
    }

    private static void validateNextIntOrThrow() {
        if (!scanner.hasNextInt()) {
            throw new RuntimeException(IS_NOT_A_NUMERIC_STRING);
        }
    }

    public static String nextLine() {
        return scanner.nextLine();
    }
}
