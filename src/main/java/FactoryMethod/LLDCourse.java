package FactoryMethod;

public class LLDCourse extends Course{
    @Override
    public void createCourse() {
        modules.add(new IntroModule());
        modules.add(new ConceptModule());
        modules.add(new SummaryModule());
    }
}
