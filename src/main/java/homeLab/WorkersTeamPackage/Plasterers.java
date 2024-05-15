package homeLab.WorkersTeamPackage;

import homeLab.WorkersTeam;

public class Plasterers extends WorkersTeam {
    public Plasterers() {
        this.addiction = new int[]{12,13};
    }

    @Override
    public String name() {
        return "Штукатуры";
    }
}
