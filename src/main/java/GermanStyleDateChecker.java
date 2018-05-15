import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    public static Matcher getMatcher(String dateString) {
        Pattern p;
        p = Pattern.compile("^(0?[1-9]|1[0-9]|2[0-9]|3[0-1])(\\.|-|\\ )"
                + "(1[0-2]|0?[1-9])(\\.|-|\\ )(19|[2-9][0-9])?\\d{2}$");
        Matcher m = p.matcher(dateString);
        return m;
    }
}
