package command;

import mvc.Model;
import geometry.Shape;

public class Select implements Command{

	private Model model;
	private Shape shape;
	
	public Select(Model model,Shape shape) {
		this.model=model;
		this.shape=shape;
	}
	
	@Override
	public void execute() {
		model.selectObject(shape);
	}

	@Override
	public void unexecute() {
		model.deselectObject(shape);
	}

}
