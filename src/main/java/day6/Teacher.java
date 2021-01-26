package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String discipline;

    public void setName(String name) { this.name = name; }
    public void setDiscipline(String discipline) { this.discipline = discipline;}

    public String getName() { return name;}
    public String getDiscipline() { return discipline; }

    public Teacher(String name, String discipline){
        this.name = name;
        this.discipline = discipline;
    }
    public void evaluate(Student student){
        Random random = new Random();
        String grade;
        int mark = random.nextInt(4) + 2;
        switch (mark){
            case 2: grade = "неудовлетворительно"; break;
            case 3: grade = "удовлетворительно"; break;
            case 4: grade = "хорошо"; break;
            case 5: grade = "отлично"; break;
            default: grade = "Нет такой оценки!";//Без этого не хотел пропускать.
        }
        System.out.printf("Преподаватель %s оценил студента с именем %s по предмету %s на оценку \"%s\". ",
               this.name, student.getName(), this.discipline, grade);


    }
}
