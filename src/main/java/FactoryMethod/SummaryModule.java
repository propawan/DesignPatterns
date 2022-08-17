package FactoryMethod;

import lombok.ToString;

@ToString
public class SummaryModule extends Module{
    public SummaryModule(){
        this.type = "Summary";
    }
}
