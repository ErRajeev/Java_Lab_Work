public class ReplaceChar {
    public static String swap(String str, char c1, char c2) {
        StringBuffer sb = new StringBuffer();
        for (char c : str.toCharArray()) {
            if (c == c1) {
                sb.append(c2);
            } else if (c == c2) {
                sb.append(c1);
            } else
                sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "apples";
        char c1 = 'a';
        char c2 = 'p';
        System.out.println(swap(str, c1, c2));
    }
}
