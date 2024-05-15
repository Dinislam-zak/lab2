package homeLab.WorkersTeamPackage;

import homeLab.WorkersTeam;

public class Bricklayers extends WorkersTeam {
    public Bricklayers() {
        this.addiction = new int[]{4,6};
    }

    @Override
    public String name() {
        return "Каменщики";
    }
}
