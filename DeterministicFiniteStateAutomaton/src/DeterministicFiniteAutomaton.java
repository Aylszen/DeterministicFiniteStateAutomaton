import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class DeterministicFiniteAutomaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data data = new Data();
		start();
		
		
	}
	static public void start()
	{
		String[] symbols = {"2", "2", "5", "1"};
		State state = Data.listAllStatesMap.get(Data.startingState);
		boolean isInAcceptingState = false;
		for (String symbol : symbols)
		{
			System.out.println("Current state: " + state);
			state = state.goToNextState(symbol);
			isInAcceptingState = Data.acceptingStates.contains(state);
		}
		System.out.println("isInAcceptingState:");
		System.out.println(isInAcceptingState);
	}
}
