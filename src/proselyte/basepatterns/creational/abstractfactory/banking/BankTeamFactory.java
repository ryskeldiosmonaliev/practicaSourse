package proselyte.basepatterns.creational.abstractfactory.banking;

import proselyte.basepatterns.creational.abstractfactory.Developer;
import proselyte.basepatterns.creational.abstractfactory.ProjectManger;
import proselyte.basepatterns.creational.abstractfactory.ProjectTeamFactory;
import proselyte.basepatterns.creational.abstractfactory.Tester;

public class BankTeamFactory implements ProjectTeamFactory{
    @Override
    public Developer getFirstDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Developer getSecondDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManger getProjectManager() {
        return new BankingPM();
    }
}
