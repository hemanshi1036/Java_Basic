public class ChareCount {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java CharCount <string>");
            return;
        }

        String input = args[0];
        int[] count = new int[256];

        for (char c : input.toCharArray()) {
            count[c]++;
        }

        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                System.out.println((char) i + ": " + count[i]);
            }
        }
    }
}

