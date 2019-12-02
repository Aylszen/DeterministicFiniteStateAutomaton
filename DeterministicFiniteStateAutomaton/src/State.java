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
		return transition.selectNextState(inputData);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}
