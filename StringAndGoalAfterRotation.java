
/**
 * Given a string s and a goal string goal, return true if and only if
 * after rotating s, it can become equal to goal.
 */
public class StringAndGoalAfterRotation {

    public static boolean canRotate(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String concatenated = s + s;
        return concatenated.contains(goal);
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "deabc";
        System.out.println(canRotate(s, goal));
    }
}
