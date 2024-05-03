package homeLab;

import homeLab.WorkClasses.*;

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
    }
}
