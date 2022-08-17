package FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Course {
    protected List<Module> modules;

    public Course(){
        this.modules = new ArrayList<>();
        this.createCourse();
    }

    public List<Module> getModules(){
        return modules;
    }

    public abstract void createCourse();
}
