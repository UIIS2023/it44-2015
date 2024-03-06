package command;

import mvc.Model;
import geometry.Shape;

public class Deselect implements Command{

	private Model model;
	private Shape shape;
	
	public Deselect(Model model, Shape shape) {
		this.model=model;
		this.shape=shape;
	}
	
	@Override
	public void execute() {
		model.deselectObject(shape);
	}

	@Override
	public void unexecute() {
		model.selectObject(shape);
	}
}
