import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Transition {
	Integer input;
	Map<String, State> listAllTransitionsMap = new HashMap<String, State>();

	public Transition(String Value) {
		String[] stringAfterSplit = Value.split(";");
		for (String stringElem : stringAfterSplit) {
			String[] stringAfterSplit2 = stringElem.split(" ");
			listAllTransitionsMap.put(stringAfterSplit2[0], Data.listAllStatesMap.get(stringAfterSplit2[1]));
			System.out.println("Lista tranzycji:");
			System.out.println(listAllTransitionsMap);
		}
	}

	public State selectNextState(String value) {
		return listAllTransitionsMap.get(value);
	}
}