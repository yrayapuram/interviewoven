public class ReverseMessageWords {

    public static void main(String... args) {
        char[] msg = {
                's', 'e', 'c', 'r', 'e', 't', ' ',
                't', 'o', 'p', ' ',
                'i', 's', ' ',
                't', 'h', 'i', 's'
        };
        System.out.println(msg);
        reverseMessageWords(msg);
        System.out.println(msg);
    }

    private static void reverseMessageWords(char[] msg) {

        reverseMessage(msg, 0, msg.length - 1);
        int wordBegin = 0;
        for (int charCount = 0; charCount <= msg.length; charCount++) {
            if(charCount == msg.length || msg[charCount] == ' ') {
                reverseMessage(msg, wordBegin, charCount - 1);
                wordBegin = charCount + 1;
            }
        }
        return;
    }

    private static void reverseMessage(char[] msg, int start, int end) {

        while (start < end) {
            char temp = msg[start];
            msg[start] = msg[end];
            msg[end] = temp;
            start++;
            end--;
        }
    }
}