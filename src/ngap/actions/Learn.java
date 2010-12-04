package ngap.actions;

import ngap.IActionTarget;
import ngap.IDoAction;

public class Learn implements IDoAction {

	private IActionTarget target;
	public Learn(IActionTarget target){
		if (target == null){
			throw new NullPointerException("Target must not be null!!!!!!!");
		}
		this.target = target;
	}
	@Override
	public void DoAction() {
		System.out.println("Ich lerne " + this.target.getTargetName());

	}

}
