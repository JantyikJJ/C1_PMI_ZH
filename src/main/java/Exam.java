public class Exam extends Grades {
    public void registGradeToSubject(String subject, int grade) {
        if (super.dict.containsKey(subject)) {
            super.dict.replace(subject, grade);
        }
    }
}
