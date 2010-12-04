package ngap;

public class ActionExecutor {
	private IDoAction action;
	public void setAction(IDoAction action){
		if (action == null){
			throw new NullPointerException("Action must not be null!!!!!!!");
		}
		
		this.action = action;
	}
	
	public void DoAction(){
		if (this.action == null){
			throw new NullPointerException("Define an Action first!");
		}
		
		this.action.DoAction();
	}
}
