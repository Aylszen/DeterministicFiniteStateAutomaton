import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Data {

	static Map<String, State> listAllStatesMap = new  HashMap<String, State>();
	static String startingState = new String();
	static ArrayList<State> acceptingStates = new ArrayList<State>();
	static ArrayList<String> availableSymbols = new ArrayList<String>();
	
	public void setInitialValues()
	{
		for (int i = 0; i < 20; i++)
		{
			String stateName = "q" + i;
			listAllStatesMap.put(stateName, new State(stateName));
		}
		System.out.print(listAllStatesMap);
		
		listAllStatesMap.get("q0").setTransitions("1 q1;2 q2;5 q5");
		listAllStatesMap.get("q1").setTransitions("1 q2;2 q3;5 q6");
		listAllStatesMap.get("q2").setTransitions("1 q3;2 q4;5 q7");
		listAllStatesMap.get("q3").setTransitions("1 q4;2 q5;5 q8");
		listAllStatesMap.get("q4").setTransitions("1 q5;2 q6;5 q9");
		listAllStatesMap.get("q5").setTransitions("1 q6;2 q7;5 q10");
		listAllStatesMap.get("q6").setTransitions("1 q7;2 q8;5 q11");
		listAllStatesMap.get("q7").setTransitions("1 q8;2 q9;5 q12");
		listAllStatesMap.get("q8").setTransitions("1 q9;2 q10;5 q13");
		listAllStatesMap.get("q9").setTransitions("1 q10;2 q11;5 q14");
		listAllStatesMap.get("q10").setTransitions("1 q11;2 q12;5 q15");
		listAllStatesMap.get("q11").setTransitions("1 q12;2 q13;5 q16");
		listAllStatesMap.get("q12").setTransitions("1 q13;2 q14;5 q17");

		listAllStatesMap.get("q13").setTransitions("1 q0;2 q0;5 q0");
		listAllStatesMap.get("q14").setTransitions("1 q0;2 q0;5 q0");
		listAllStatesMap.get("q17").setTransitions("1 q0;2 q0;5 q0");
		
		startingState = "q0";
		
		availableSymbols.add("1");
		availableSymbols.add("2");
		availableSymbols.add("5");
		
		acceptingStates.add(listAllStatesMap.get("q9"));
		acceptingStates.add(listAllStatesMap.get("q12"));
	}
}
