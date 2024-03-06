package command;

import mvc.Model;
import geometry.Shape;

public class Add implements Command {
	
	private Model model;
	private Shape shape;
	
	public Add(Model model,Shape shape) {
		this.model=model;
		this.shape=shape;
	}

	@Override
	public void execute() {
		model.add(shape);
		model.deselectObject(shape);
	}

	@Override
	public void unexecute() {
		model.remove(shape);
	}
}
