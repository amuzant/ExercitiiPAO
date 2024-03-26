public class ExercitiuRegex {
    public static void main(String[] args) {
        //exercitiul 1
        System.out.println("b".matches("[abc]"));
        System.out.println(" ".matches("[^abc]"));
        System.out.println("x".matches("[a-z]"));
        System.out.println("xQ".matches("[a-z][A-Z]"));
        System.out.println("cab".matches("[abc]+"));
        System.out.println("".matches("[abc]*"));
        System.out.println("abcba".matches("[abc]{5}"));
        System.out.println("abcbabc".matches("[abc]{5,}"));
        System.out.println("abcbabca".matches("[abc]{5,10}"));

        //exercitiul 2.1+2.2
        String string="Odata creat un sir de caractere cu continutul sau nu mai poate fi modificat.";
        System.out.println(string.length());
        System.out.println(string.matches("[a-zA-Z]+"));
        String[] cuvinte=string.split(" ");

        //exercitiul 2.3
        int nrCuvinte = cuvinte.length;
        System.out.println(nrCuvinte);
        if (nrCuvinte>1)
            if (nrCuvinte%2==0)
                System.out.println("Cuvintele de la mijloc: "+cuvinte[nrCuvinte/2-1]+" "+cuvinte[nrCuvinte/2]);
            else System.out.println("Cuvantul de la mijloc: "+cuvinte[nrCuvinte/2]);
        else if(nrCuvinte==1)
            System.out.println("Cuvantul de la mijloc (singurul): "+cuvinte[0]);
        else System.out.println("Stringul nu contine cuvinte");

        //exercitiul 2.4
        StringBuilder sb=new StringBuilder();
        for(int i=string.length()-1;i>=0;i--)
            sb.append(string.charAt(i));
        System.out.println(sb);
    }
}