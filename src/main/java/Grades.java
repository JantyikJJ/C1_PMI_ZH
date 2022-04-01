import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Grades {
    protected HashMap<String, Integer> dict;

    public Grades() {
        dict = new HashMap<>();
    }

    public void addSubject(String subject) {
        dict.put(subject, 0);
    }
    public void dropSubject(String subject) {
        dict.remove(subject);
    }
    public String getGrades() {
        StringBuilder grades = new StringBuilder();
        for (String key : dict.keySet()) {
            grades.append(key).append(" ");
            if (dict.get(key) == 0) {
                grades.append("-");
            }
            else {
                grades.append(dict.get(key));
            }
            grades.append("\r\n");
        }
        String[] split = grades.toString().trim().split("\r\n");
        String[] reversed = new String[split.length];
        for (int i = 0; i < split.length; i++) {
            reversed[i] = split[split.length - i - 1];
        }
        return String.join("\r\n", reversed);
    }
}
