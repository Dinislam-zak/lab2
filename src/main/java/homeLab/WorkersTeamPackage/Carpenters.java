package homeLab.WorkersTeamPackage;

import homeLab.WorkersTeam;

public class Carpenters extends WorkersTeam {
    public Carpenters() {
        this.addiction = new int[]{2,3,7,8,9};
    }

    @Override
    public String name() {
        return "Плотники";
    }
}
