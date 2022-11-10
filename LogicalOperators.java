public class LogicalOperators {
    public static void main(String[] args){
        int chemistryGrade = 67;
        int englishGrade = 65;
        String language = "Java";

        if (chemistryGrade > 75 || englishGrade > 75 || language.equals("Java")) {
            System.out.println("You're in!");
        } else {
            System.out.println("Try next year");
        }
    }
}
