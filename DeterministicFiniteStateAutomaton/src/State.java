public class State {
	Transition transition;
	private String name;

	public State() {

	}

	public State(String name) {
		this.name = name;
	}

	public void setTransitions(String value) {
		transition = new Transition(value);
	}

	public State goToNextState(String inputData) {
		if(Data.availableSymbols.contains(inputData))
		{
			return transition.selectNextState(inputData);
		}
		System.out.println("Symbol does not belong to the list of available symbols!");
		return this;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}
