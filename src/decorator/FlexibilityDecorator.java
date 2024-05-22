package decorator;

import strategy.WorkoutProgram;

public class FlexibilityDecorator extends WorkoutProgramDecorator {

    private static final double FLEXIBILITY_COST = 0.1;

    public FlexibilityDecorator(WorkoutProgram workoutProgram) {
        super(workoutProgram);
        System.out.println("Flexibility Decorator created");
        addFlexibility();
    }

    private void addFlexibility() {
        workoutProgram.addExercise("Flexibility Training");
    }

    @Override
    public double getCost() {
        return super.getCost() + FLEXIBILITY_COST;
    }
}
