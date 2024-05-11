package labJUnitTest;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.Deque;

public class BracketsCheck {

    public static boolean validateJSON(String filename) throws NullPointerException, IOException {
        if (filename == null || filename.isEmpty()) {
            throw new NullPointerException("File name cannot be null or empty");
        }

        if (!Files.exists(Paths.get(filename))) {
            throw new IOException("File not found");
        }

        if (!Files.probeContentType(Paths.get(filename)).equals("application/json")) {
            throw new IOException("File is not a JSON file");
        }

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filename));
            Deque<Character> stack = new ArrayDeque<>();
            int lineNumber = 1;
            int charNumber = 0;
            int c;
            while ((c = reader.read()) != -1) {
                charNumber++;
                char ch = (char) c;
                if (!isTextChar(ch)) {
                    throw new IOException("non Json file");
                }
                if (ch == '\n') {
                    lineNumber++;
                    charNumber = 0;
                }
                if (ch == '{' || ch == '[') {
                    stack.push(ch);
                } else if (ch == '}' || ch == ']') {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char top = stack.pop();
                    if ((top == '{' && ch != '}') || (top == '[' && ch != ']')) {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
    public static  boolean isTextChar(char ch) {
        return String.valueOf(ch).matches("^[a-zA-Zа-яА-Я0-9.,!?'\"\\s{}\\[\\]\\(\\)@#$%^&*_+-=~/`|\\\\:]+$");
    }
}
