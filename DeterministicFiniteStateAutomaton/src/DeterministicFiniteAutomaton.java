public class DeterministicFiniteAutomaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data data = new Data();
		data.setInitialValues();
		start();
	}
	static public void start()
	{
		String[] symbols = {"2", "2", "5", "1"};
		State state = Data.listAllStatesMap.get(Data.startingState);
		System.out.println("Current state: " + state);
		boolean isInAcceptingState = false;
		for (String symbol : symbols)
		{
			state = state.goToNextState(symbol);
			System.out.println("Current state: " + state);
			isInAcceptingState = Data.acceptingStates.contains(state);
		}
		System.out.println("isInAcceptingState:");
		System.out.println(isInAcceptingState);
	}
}
