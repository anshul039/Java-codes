package pkg1;

import javax.xml.ws.Endpoint;
import pkg.ImageService;

public class ImagePublisher 
{
	public static void main(String[] args) 
	{

		Endpoint.publish("http://localhost:8080/ws/image", new ImageService());

		System.out.println("Server is published!");
	}
}
