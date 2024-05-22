package strategy;

import java.util.List;

public class AdvancedWorkoutProgram extends WorkoutProgram {

    private static final double COST_ADVANCED = 1.2;

    public AdvancedWorkoutProgram(String name, String description, int duration, String difficultyLevel, String targetArea, List<String> equipmentNeeded, List<String> exercises, List<String> guidanceTips) {
        super(name, description, duration, difficultyLevel, targetArea, equipmentNeeded, exercises, guidanceTips);
        System.out.println("Creating Advanced Workout Program");
    }

    @Override
    public void print() {
        System.out.println("Advanced Workout Program");
        System.out.println("Name: " + getName());
        System.out.println("Description: " + getDescription());
        System.out.println("Duration: " + getDurationInMinutes() + " minutes");
        System.out.println("Difficulty Level: " + getDifficultyLevel());
        System.out.println("Target Area: " + getTargetArea());
        System.out.println("Equipment Needed: " + getEquipmentNeeded());
        System.out.println("Exercises: " + getExercises());
        System.out.println("Guidance Tips: " + getGuidanceTips());
        System.out.println("Cost: $" + getCost());
    }

    @Override
    public double getCost() {
        return getDurationInMinutes() * COST_PER_MINUTE * COST_ADVANCED;
    }
}
