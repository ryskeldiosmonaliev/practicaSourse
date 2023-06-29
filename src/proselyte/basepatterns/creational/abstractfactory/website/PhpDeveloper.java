package proselyte.basepatterns.creational.abstractfactory.website;

import proselyte.basepatterns.creational.abstractfactory.Developer;

public class PhpDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
