package behaviourtests.merchant;

import behaviourtests.model.DTUPayAccount;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class MerchantService {
	private Entity<DTUPayAccount> e;
	public DTUPayAccount register(DTUPayAccount acc) {
		Client client = ClientBuilder.newClient();
		WebTarget r = client.target("http://localhost:8080/merchant");
		var response = r.path("/register").request().post(Entity.entity(acc, MediaType.APPLICATION_JSON), DTUPayAccount.class);
		return response;
	}
}
