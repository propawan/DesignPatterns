package FactoryMethod;

import lombok.ToString;

@ToString
public class DemoModule extends Module{
    public DemoModule(){
        this.type = "Demo";
    }
}
