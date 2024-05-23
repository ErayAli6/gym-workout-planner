package decorator;

import strategy.WorkoutProgram;

public class CardioDecorator extends WorkoutProgramDecorator {

    private static final double CARDIO_COST = 0.2;

    public CardioDecorator(WorkoutProgram workoutProgram) {
        super(workoutProgram);
        System.out.println("Cardio Decorator created");
    }

    @Override
    public void addExercise() {
        workoutProgram.addExercise("Cardio");
    }

    @Override
    public double getCost() {
        return super.getCost() + CARDIO_COST;
    }
}
