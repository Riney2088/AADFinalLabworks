package Activity_Selection_Problem;

import java.util.Comparator;

public class ASPComparator  implements Comparator<ActivitySelectionProblem>{
	public int compare(ActivitySelectionProblem o1, ActivitySelectionProblem o2) {
		// TODO Auto-generated method stub
		return o1.getFinish()- o2.getFinish();
	    }

}
