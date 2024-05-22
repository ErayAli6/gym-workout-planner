package strategy;

import observer.TrainerObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class WorkoutProgram {

    protected static final double COST_PER_MINUTE = 0.1;

    private String name;

    private String description;

    private int durationInMinutes;

    private String difficultyLevel;

    private String targetArea;

    private final List<String> exercises;

    private final List<String> guidanceTips;

    private final List<String> equipmentNeeded;

    private final List<TrainerObserver> observers;

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
        this.observers = new ArrayList<>();
    }

    public abstract void print();

    public abstract double getCost();

    public void addObserver(TrainerObserver observer) {
        observers.add(observer);
        System.out.println("Adding " + observer.getName() + " to observers list");
    }

    public void removeObserver(TrainerObserver observer) {
        observers.remove(observer);
        System.out.println("Removing " + observer.getName() + " from observers list");
    }

    protected void notifyObservers() {
        for (TrainerObserver observer : observers) {
            observer.update(this);
        }
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

    public void setName(String name) {
        this.name = name;
        System.out.println("Setting name to " + name);
    }

    public void setDescription(String description) {
        this.description = description;
        System.out.println("Setting description to " + description);
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
        System.out.println("Setting duration in minutes to " + durationInMinutes);
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
        System.out.println("Setting difficulty level to " + difficultyLevel);
    }

    public void setTargetArea(String targetArea) {
        this.targetArea = targetArea;
        System.out.println("Setting target area to " + targetArea);
    }

    public void addExercise(String exercise) {
        exercises.add(exercise);
        System.out.println("Adding " + exercise + " to exercises list");
    }

    public void removeExercise(String exercise) {
        exercises.remove(exercise);
        System.out.println("Removing " + exercise + " from exercises list");
    }

    public void addGuidanceTip(String tip) {
        guidanceTips.add(tip);
        System.out.println("Adding " + tip + " to guidance tips list");
    }

    public void removeBeginnerExercise(String exercise) {
        exercises.remove(exercise);
        System.out.println("Removing " + exercise + " from exercises list");
    }

    public void removeGuidanceTip(String tip) {
        guidanceTips.remove(tip);
        System.out.println("Removing " + tip + " from guidance tips list");
    }

    public void addEquipmentNeeded(String equipment) {
        equipmentNeeded.add(equipment);
        System.out.println("Adding " + equipment + " to equipment needed list");
    }

    public void removeEquipmentNeeded(String equipment) {
        equipmentNeeded.remove(equipment);
        System.out.println("Removing " + equipment + " from equipment needed list");
    }
}
