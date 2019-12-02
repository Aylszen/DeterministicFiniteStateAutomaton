import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Transitions {
	Integer input;
	Map<String, State> listAllTransitionsMap = new HashMap<String, State>();

	public Transitions(String Value) {
		String[] stringAfterSplit = Value.split(";");
		for (String stringElem : stringAfterSplit) {
			String[] stringAfterSplit2 = stringElem.split(" ");
			listAllTransitionsMap.put(stringAfterSplit2[0], Data.listAllStatesMap.get(stringAfterSplit2[1]));
		}
	}

	public State selectNextState(String value) {
		System.out.println("Lista tranzycji:");
		System.out.println(listAllTransitionsMap);
		return listAllTransitionsMap.get(value);
	}
}