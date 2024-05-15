package homeLab;

import java.util.HashSet;
import java.util.Set;

public abstract class WorkersTeam {
    protected int[] addiction;
        Set<Integer> workDays = new HashSet<>();

        protected void numberDaysOfWork(WorkingProcessArray[] arrayOfConstructionStages) {
            for (Integer i : addiction) {
                for (int j = arrayOfConstructionStages[i].getDayOfBegin(); j <= arrayOfConstructionStages[i].getDayOfEnd(); j++) {
                    workDays.add(j);
                }
            }
        }
        protected int numberDominoDays(WorkingProcessArray[] arrayOfConstructionStages) {
            numberDaysOfWork(arrayOfConstructionStages);
            return workDays.stream().max(Integer::compareTo).get() - workDays.size() - arrayOfConstructionStages[1].getDuration() + 1;
        }

        abstract public String name();
}
