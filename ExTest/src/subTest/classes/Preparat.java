package subTest.classes;

public class Preparat {
    private int timp;
    private int grade;

    public Preparat(int timp, int grade) {
        this.timp = timp;
        this.grade = grade;
    }

    public int getTimp() {
        return timp;
    }

    public void setTimp(int timp) {
        this.timp = timp;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Preparat [timp=" + timp + ", grade=" + grade + "]";
    }

    
}
