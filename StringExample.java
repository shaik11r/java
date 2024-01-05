public class StringExample {
    public static void main(String[] args) {
        String s="nadeen";
        String newsString=s.concat("Shaik");
        System.out.println(s);
        System.out.println(newsString);
        StringBuilder mutablestring=new StringBuilder("nadeenshaik");
        mutablestring.append("mahammed");
        System.out.println(mutablestring);

    }
}
