package StringTrials;

public class StringBufferTrial {
    public static void main(String[] args) {
        StringBuffer Sb = new StringBuffer();
        Sb.append("jnd");
        Sb.append("takes");
        Sb.append("home");
        System.out.println(Sb);
        String message = Sb.toString();
        System.out.println(message);
        System.out.println(Sb.hashCode());
        System.out.println(message.hashCode());
    }
}
