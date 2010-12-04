package ngap;

import ngap.actions.DontLikeAtAll;
import ngap.actions.Learn;
import ngap.actions.Like;
import ngap.targets.DotNet;
import ngap.targets.Git;
import ngap.targets.Java;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IActionTarget target1, target2, target3;
		IDoAction action1, action2, action3;
		System.out.println("Kombinationen in diesem Programm wurden willkürlich gewählt und wiederspiegeln nicht zwingend die Meinung des Autors");
		System.out.println("Decorator und Strategy pattern demo.");
		System.out.println("--------------------------------------------------------------------------------------------------------");
		target1 = new Java();
		target2 = new DotNet();
		target3 = new Git();
		action1 = new Learn(target1);
		action2 = new Like(target2);
		action3 = new DontLikeAtAll(target3);
		ActionExecutor executor = new ActionExecutor();
		executor.setAction(action1);
		executor.DoAction();
		executor.setAction(action2);
		executor.DoAction();
		executor.setAction(action3);
		executor.DoAction();
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println("Naja.. möglicherweise tun sie dies doch...");
	}

}
