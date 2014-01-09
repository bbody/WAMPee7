package ws.wampee7.controllers.messageHandlers;

import org.codehaus.jackson.JsonNode;
import ws.wampee7.models.WAMPee7Client;


public interface MessageHandler {
	public void process(WAMPee7Client client, JsonNode message);
        
        
}
