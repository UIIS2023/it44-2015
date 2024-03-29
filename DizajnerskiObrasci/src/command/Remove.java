package command;


import mvc.Model;
import geometry.Shape;

public class Remove implements Command{

	private Model model;
	private Shape shape;
	private int index;
	
	
	public Remove() {
		
	}
	
	public Remove(Model model, Shape shape,int index) {
		this.model=model;
		this.shape=shape;
		this.index=index;
	}
	
	
	@Override
	public void execute() {
		model.remove(shape);
	}

	@Override
	public void unexecute() {
		for(int i=0;i<model.getShapes().size();i++) {
			if(i==index) {
				for(int j=model.getShapes().size()-1;j>=index;j--) {
					if(j==index) {
						if(j==model.getShapes().size()-1) {
							Shape current = model.getShapes().get(j);
							model.getShapes().add(j+1, current);
							model.change(index, shape);
						}
						else {
						Shape current = model.getShapes().get(j);
						model.change(j+1, current);
						model.change(index, shape);
						}
						return;
					}
					else if(j==model.getShapes().size()-1) {
						Shape current = model.getShapes().get(j);
						model.getShapes().add(j+1,current);
					}
					else {
						Shape current = model.getShapes().get(j);
						model.change(j+1, current);
					}
				}
			}
		}
		model.add(shape);
	}

	
}
