public class State {
	Transitions transitions;
	private String name;

	public State() {

	}

	public State(String name) {
		this.name = name;
	}

	public void setTransitions(String value) {
		transitions = new Transitions(value);
	}

	public State goToNextState(String inputData) {
		if(Data.availableSymbols.contains(inputData))
		{
			return transitions.selectNextState(inputData);
		}
		System.out.println("Symbol does not belong to the list of available symbols!");
		return this;
	}

	@Override
	public String toString() {
		return name;
	}
}
