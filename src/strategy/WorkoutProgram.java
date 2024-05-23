package strategy;

import java.util.List;

public abstract class WorkoutProgram implements WorkoutProgramStrategy {

    protected static final double COST_PER_MINUTE = 0.1;

    private final String name;

    private final String description;

    private final int durationInMinutes;

    private final String difficultyLevel;

    private final String targetArea;

    private final List<String> exercises;

    private final List<String> guidanceTips;

    private final List<String> equipmentNeeded;

    public WorkoutProgram(String name, String description, int durationInMinutes, String difficultyLevel, String targetArea,
                          List<String> equipmentNeeded, List<String> exercises, List<String> guidanceTips) {
        this.name = name;
        this.description = description;
        this.durationInMinutes = durationInMinutes;
        this.difficultyLevel = difficultyLevel;
        this.targetArea = targetArea;
        this.exercises = exercises;
        this.guidanceTips = guidanceTips;
        this.equipmentNeeded = equipmentNeeded;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public String getTargetArea() {
        return targetArea;
    }

    public List<String> getEquipmentNeeded() {
        return equipmentNeeded;
    }

    public List<String> getExercises() {
        return exercises;
    }

    public List<String> getGuidanceTips() {
        return guidanceTips;
    }

    public void addExercise(String exercise) {
        exercises.add(exercise);
        System.out.println("Adding " + exercise + " to exercises list");
    }

    public void removeExercise(String exercise) {
        exercises.remove(exercise);
        System.out.println("Removing " + exercise + " from exercises list");
    }
}
