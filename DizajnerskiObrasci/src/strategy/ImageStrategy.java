package strategy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import mvc.Frame;

public class ImageStrategy implements Strategy {
	
private Frame frame;
	
	public ImageStrategy(Frame frame) {
		this.frame = frame;
	}
	
	public void saveFile(File selectedFile) {
		 
		try (FileOutputStream fos = new FileOutputStream(selectedFile)) {
			 byte[] imgByte = serialize(frame.getView().getModel().getShapes());
			 fos.write(imgByte);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public byte[] serialize(Object obj) throws IOException {
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(out);
		oos.writeObject(obj);
		return out.toByteArray();
	}
}
