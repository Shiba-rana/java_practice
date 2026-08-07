class TestString {
    public static void main(String[] args) {

        // String --> Immutable
        String s = "Software Engineering";

        System.out.println(s.length());
        System.out.println(s.charAt(2));
        System.out.println(s.toLowerCase());
        System.out.println(s.substring(0, 8));
        System.out.println(s.contains("Soft"));
        
        s.concat(" Backend");
        System.out.println(s);


        // StringBuilder --> Mutable
        StringBuilder sb = new StringBuilder();

        System.out.println(sb.append("Backend"));
        System.out.println(sb.append(" Dev"));
        System.out.println(sb.toString());

    }
}