import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Data {

	static Map<String, State> listAllStatesMap = new HashMap<String, State>();
	static String startingState = new String();
	static ArrayList<State> acceptingStates = new ArrayList<State>();
	static ArrayList<String> availableSymbols = new ArrayList<String>();

	public void setInitialValues() {
		createStates(20);
		startingState = "q0";
		String[] availableSymbols = {"1", "2", "5"};
		setAvailableSymbols(availableSymbols);
		addAcceptingStates(listAllStatesMap.get("q9"));
		addAcceptingStates(listAllStatesMap.get("q12"));
		
		setTransitions("q0", "1 q1;2 q2;5 q5");
		setTransitions("q1", "1 q2;2 q3;5 q6");
		setTransitions("q2", "1 q3;2 q4;5 q7");
		setTransitions("q3", "1 q4;2 q5;5 q8");
		setTransitions("q4", "1 q5;2 q6;5 q9");
		setTransitions("q5", "1 q6;2 q7;5 q10");
		setTransitions("q6", "1 q7;2 q8;5 q11");
		setTransitions("q7", "1 q8;2 q9;5 q12");
		setTransitions("q8", "1 q9;2 q10;5 q13");
		setTransitions("q9", "1 q10;2 q11;5 q14");
		setTransitions("q10", "1 q11;2 q12;5 q15");
		setTransitions("q11", "1 q12;2 q13;5 q16");
		setTransitions("q12", "1 q13;2 q14;5 q17");

		setTransitions("q13", "1 q0;2 q0;5 q0");
		setTransitions("q14", "1 q0;2 q0;5 q0");
		setTransitions("q17", "1 q0;2 q0;5 q0");
	}

	public void createStates(int numberOfStates) {
		for (int i = 0; i < numberOfStates; i++) {
			String stateName = "q" + i;
			listAllStatesMap.put(stateName, new State(stateName, i));
		}
		System.out.print(listAllStatesMap);
	}
	
	public void setAvailableSymbols(String[] symbols)
	{
		for (String symbol : symbols)
		{
			availableSymbols.add(symbol);
		}
	}
	
	public void setTransitions(String stateName, String allTransitions)
	{
		listAllStatesMap.get(stateName).setTransitions(allTransitions);
	}
	
	public void addAcceptingStates(State acceptingState)
	{
		acceptingStates.add(acceptingState);
	}
}
