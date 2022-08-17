package FactoryMethod;

public class HLDCourse extends Course{
    @Override
    public void createCourse() {
        modules.add(new IntroModule());
        modules.add(new ExerciseModule());
        modules.add(new SummaryModule());
    }
}
