package decorator;

import strategy.WorkoutProgram;

public abstract class WorkoutProgramDecorator extends WorkoutProgram {

    protected WorkoutProgram workoutProgram;

    public WorkoutProgramDecorator(WorkoutProgram workoutProgram) {
        super(workoutProgram.getName(), workoutProgram.getDescription(), workoutProgram.getDurationInMinutes(), workoutProgram.getDifficultyLevel(), workoutProgram.getTargetArea(), workoutProgram.getEquipmentNeeded(), workoutProgram.getExercises(), workoutProgram.getGuidanceTips());
        this.workoutProgram = workoutProgram;
    }

    @Override
    public void print() {
        workoutProgram.print();
    }

    @Override
    public double getCost() {
        return workoutProgram.getCost();
    }
}
