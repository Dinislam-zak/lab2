package homeLab;

import homeLab.WorkClasses.*;
import homeLab.WorkersTeamPackage.*;

public class WorkProcess {
    public static void main(String[] args) {
        WorkingProcessArray [] ListToDo = new WorkingProcessArray[]{
                new BeginningOfWork(),//0
                new Project(),//1
                new ManufactoringOfWindows(),//2
                new ManufactoringOfDoors(),//3
                new FoundationConstruction(),//4
                new LayingСommunications(),//5
                new Walling(),//6
                new RoofConstruction(),//7
                new InstallationOfWindows(),//8
                new DoorInstallation(),//9
                new InstallationOfHeatingDevices(),//10
                new ElectricalWiring(),//11
                new FinishingOfWallsAndCeilings(),//12
                new FloorFinishing(),//13
                new InstallationOfLightingFixtures(),//14
                new InstallationOfPlumbing(),//15
                new CompletionOfConstruction()//16
        };

        for (WorkingProcessArray cl : ListToDo){
            new Thread(cl).start();
        }

        Thread resultThreads = new Thread(ListToDo[16]);
        resultThreads.start();
        try {
            resultThreads.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        int duration = ListToDo[16].getDays();
        System.out.println("\nКоличество дней работы: " + duration);

        System.out.println("\nБригады:\n");
        WorkersTeam[] teams = new WorkersTeam[]{
                new Bricklayers(),
                new Carpenters(),
                new Electricians(),
                new Plasterers(),
                new Plumbers()
        };
        for (WorkersTeam team : teams) {
            System.out.println(team.name() + " проиграли в домино: " + team.numberDominoDays(ListToDo) + " дней");
        }
    }
}
