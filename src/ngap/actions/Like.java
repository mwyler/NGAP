package ngap.actions;

import ngap.IActionTarget;
import ngap.IDoAction;

public class Like implements IDoAction {

		private IActionTarget target;
		public Like(IActionTarget target){
			if (target == null){
				throw new NullPointerException("Target must not be null!!!!!!!");
			}
			this.target = target;
		}
		@Override
		public void DoAction() {
			System.out.println("Ich mag " + this.target.getTargetName());
	
		}

}
