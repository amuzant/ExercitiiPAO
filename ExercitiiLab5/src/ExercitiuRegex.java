public class ExercitiuRegex {
    public static void main(String[] args) {
        System.out.println("b".matches("[abc]"));
        System.out.println(" ".matches("[^abc]"));
        System.out.println("x".matches("[a-z]"));
        System.out.println("xQ".matches("[a-z][A-Z]"));
        System.out.println("cab".matches("[abc]+"));
        System.out.println("".matches("[abc]*"));
        System.out.println("abcba".matches("[abc]{5}"));
        System.out.println("abcbabc".matches("[abc]{5,}"));
        System.out.println("abcbabca".matches("[abc]{5,10}"));
    }
}