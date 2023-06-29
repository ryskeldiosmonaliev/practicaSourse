package proselyte.basepatterns.creational.abstractfactory.banking;

import proselyte.basepatterns.creational.abstractfactory.Developer;

public class JavaDeveloper implements Developer{

    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
