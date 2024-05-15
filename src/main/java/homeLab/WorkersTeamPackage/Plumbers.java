package homeLab.WorkersTeamPackage;

import homeLab.WorkersTeam;

public class Plumbers extends WorkersTeam {
    public Plumbers() {
        this.addiction = new int[]{11,14};
    }

    @Override
    public String name() {
        return "Сантехники";
    }
}
