package task_3.solution;

import java.util.List;

public class Main {
    public static void main(String[] args){
        SimpsonsSchool simpsonsSchool = new SimpsonsSchool();

        SimpsonsCharacter bart = new SimpsonsCharacter("Bart", 11, 1);
        SimpsonsCharacter lisa = new SimpsonsCharacter("Lisa", 9, 2);

        SimpsonsCourse math = new SimpsonsCourse("Math", 1);
        SimpsonsCourse barts_pranks = new SimpsonsCourse("Bart's Pranks", 2);
        SimpsonsCourse history = new SimpsonsCourse("History", 3);

        simpsonsSchool.enrollCharacter(bart, List.of(math, barts_pranks));
        simpsonsSchool.enrollCharacter(lisa, List.of(math, history, barts_pranks));

        try {
            simpsonsSchool.addGrade(bart, math, 4);
            simpsonsSchool.addGrade(bart, history, 3);
            simpsonsSchool.addGrade(bart,  barts_pranks, 5);

            simpsonsSchool.addGrade(lisa, math, 5);
            simpsonsSchool.addGrade(lisa, history, 4);
            simpsonsSchool.addGrade(lisa, barts_pranks, 0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
