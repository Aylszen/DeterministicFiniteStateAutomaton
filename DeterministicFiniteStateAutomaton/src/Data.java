import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Data {

	static Map<String, State> listAllStatesMap;
	static ArrayList<String> startingState;
	static ArrayList<String> acceptingStates;
	static ArrayList<String> availableSymbols;
	
	public Data()
	{
		listAllStatesMap = new HashMap<String, State>();
		startingState = new ArrayList<String>();
		acceptingStates = new ArrayList<String>();
		availableSymbols = new ArrayList<String>();
		
		for (int i = 0; i < 14; i++)
		{
			String stateName = "q" + i;
			listAllStatesMap.put(stateName, new State(stateName));
		}
		System.out.print(listAllStatesMap);
		
		listAllStatesMap.get("q0").setTransitions("1 q1;2 q2;5 q5");
		listAllStatesMap.get("q1").setTransitions("1 q2;2 q3;5 q6");
		listAllStatesMap.get("q2").setTransitions("1 q3;2 q4;5 q7");
		startingState.add("qo");
		
		availableSymbols.add("1");
		availableSymbols.add("2");
		availableSymbols.add("3");
	}
}
