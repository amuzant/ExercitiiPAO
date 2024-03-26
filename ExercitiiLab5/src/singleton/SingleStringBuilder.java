package singleton;

public class SingleStringBuilder {
    private static SingleStringBuilder singleStringBuilder;
    private static StringBuilder stringComplet = new StringBuilder();
    private SingleStringBuilder(){}
    public static SingleStringBuilder getInstance()
    {
        if(singleStringBuilder==null)
        {
            singleStringBuilder=new SingleStringBuilder();
        }
        return singleStringBuilder;
    }
    public void addString(String stringDeAdaugat) {stringComplet.insert(stringComplet.length(),stringDeAdaugat);}

    public void printFullString() {
        System.out.println(stringComplet);
    }
}
