package decorator;

import strategy.WorkoutProgram;

public class StrengthTrainingDecorator extends WorkoutProgramDecorator {

    private static final double STRENGTH_COST = 0.4;

    public StrengthTrainingDecorator(WorkoutProgram workoutProgram) {
        super(workoutProgram);
        System.out.println("Strength Training Decorator created");
    }

    @Override
    public void addExercise() {
        workoutProgram.addExercise("Strength Training");
    }

    @Override
    public double getCost() {
        return super.getCost() + STRENGTH_COST;
    }
}
