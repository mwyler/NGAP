package ngap.actions;

import ngap.IActionTarget;
import ngap.IDoAction;

public class DontLikeAtAll implements IDoAction {

	private IActionTarget target;
	public DontLikeAtAll(IActionTarget target){
		if (target == null){
			throw new NullPointerException("Target must not be null!!!!!!!");
		}
		
		this.target = target;
	}
	@Override
	public void DoAction() {
		System.out.println("Ich finde " + this.target.getTargetName() + " zum kotzen");

	}

}
