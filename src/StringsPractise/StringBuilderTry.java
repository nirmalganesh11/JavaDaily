package StringsPractise;

public class StringBuilderTry {
    public static void main(String[] args) {
        char s[] ={'a','b','c'};
        appendtobuilder(s);
    }
    public static void appendtobuilder(char s[]){
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        System.out.println(sb.toString());
    }
}
