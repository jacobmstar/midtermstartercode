import java.util.ArrayList;

class Student {

    private ArrayList<Double> grades;

    public Student(double... grades) {
        this.grades = new ArrayList<>();
        for (double grade: grades) {
            this.grades.add(grade);
        }
    }

    public double getMinimumGrade() {
        double lowest = grades.get(0);
        for (int i=1; i<grades.size(); i++) {
            if (grades.get(i) < lowest) {
                lowest = grades.get(i);
            }
        }
        return lowest;
    }

    public double getAverageGrade() {
        double sum = 0.0;
        for (double grade: grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}