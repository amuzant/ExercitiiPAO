public class MainSingleton {
    public static void main(String[] args) {
        SingleStringBuilder singleStringBuilder1=SingleStringBuilder.getInstance();
        SingleStringBuilder singleStringBuilder2=SingleStringBuilder.getInstance();
        singleStringBuilder1.addString("ceva");
        singleStringBuilder2.addString("nou");
        singleStringBuilder1.printFullString();
    }
}
