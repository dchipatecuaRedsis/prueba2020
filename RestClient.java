import java.awt.PageAttributes.MediaType;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import com.sun.jersey.api.client.Client;


public class RestClient {

	public static void main(String[] args) {
		String url = "https://securetransfer.redsis.com/rest/forms/v1/teamGoAny/payload";
		
		Client cliente = ClientBuilder.newClient();
		
		WebTarget target = cliente.target(url);
		
		System.out.println(target.request(javax.ws.rs.core.MediaType.TEXT_PLAIN).get(String.class));
	}

}
