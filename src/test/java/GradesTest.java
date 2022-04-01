import org.junit.Test;

import static org.junit.Assert.*;

public class GradesTest {
    @Test
    public void testAddSubject() {
        Grades grades = new Grades();

        assertEquals("", grades.getGrades());

        String subject1 = "Math";
        String subject2 = "Programming";

        grades.addSubject(subject1);

        assertEquals(subject1 + " -", grades.getGrades());

        grades.addSubject(subject2);

        assertEquals(subject1 + " -\r\n" + subject2 + " -", grades.getGrades());
    }

    @Test
    public void testDropSubject() {
        Grades grades = new Grades();
        String subject1 = "Math";
        String subject2 = "Programming";

        grades.addSubject(subject1);
        grades.addSubject(subject2);
        grades.dropSubject(subject1);

        assertEquals(subject2 + " -", grades.getGrades());
    }

    @Test
    public void testRegistGradeToSubject() {
        Exam exam = new Exam();
        String subject1 = "Math";
        String subject2 = "Programming";
        int grade1 = 3;
        int grade2 = 5;

        exam.addSubject(subject1);
        exam.addSubject(subject2);
        exam.registGradeToSubject(subject1, grade1);
        exam.registGradeToSubject(subject2, grade2);

        assertEquals(subject1 + " " + grade1 + "\r\n" + subject2 + " " + grade2, exam.getGrades());
    }
}