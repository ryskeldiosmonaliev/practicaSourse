package proselyte.basepatterns.creational.abstractfactory.website;

import proselyte.basepatterns.creational.abstractfactory.Developer;
import proselyte.basepatterns.creational.abstractfactory.ProjectManger;
import proselyte.basepatterns.creational.abstractfactory.ProjectTeamFactory;
import proselyte.basepatterns.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory{
    @Override
    public Developer getFirstDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Developer getSecondDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManger getProjectManager() {
        return new WebsitePM();
    }
}
