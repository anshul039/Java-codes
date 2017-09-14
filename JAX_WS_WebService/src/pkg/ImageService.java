package pkg;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.jws.WebService;
import javax.xml.ws.WebServiceException;

@WebService(endpointInterface = "pkg.ImageServer")
public class ImageService implements ImageServer
{

	@Override
	public Image downloadImage(String name) 
	{
		// TODO Auto-generated method stub
		try 
		{

			File image = new File("c:\\images\\" + name);
			return ImageIO.read(image);

		} 
		catch (IOException e) 
		{
			e.printStackTrace();
			return null;

		}
	}
	
}
