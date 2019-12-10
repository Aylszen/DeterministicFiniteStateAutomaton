public class DeterministicFiniteAutomaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data data = new Data();
		data.setInitialValues();
		start();
	}

	static public void start() {
		String[] symbols = { "2", "2", "5", "1", "2", "K" };
		State state = Data.listAllStatesMap.get(Data.startingState);
		System.out.println("Current state: " + state);
		String automatonPath = new String();
		automatonPath += "(" + state.toString() + ")-->";
		for (String symbol : symbols) {
			state = state.goToNextState(symbol);
			System.out.println("Current state: " + state + " , current value: " + state.getValue());
			if (Data.acceptingStates.contains(state)) {
				automatonPath += "((" + state.toString() + "))";
				System.out.println(automatonPath);
				return;
			} else {
				automatonPath += "(" + state.toString() + ")-->";
			}
		}
		System.out.println(automatonPath);
	}
}