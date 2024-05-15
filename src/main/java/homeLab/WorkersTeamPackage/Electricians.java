package homeLab.WorkersTeamPackage;

import homeLab.WorkersTeam;

public class Electricians extends WorkersTeam {
    public Electricians() {
        this.addiction = new int[]{5,10,15};
    }

    @Override
    public String name() {
        return "Электрики";
    }
}
