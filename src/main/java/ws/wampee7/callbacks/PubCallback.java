package ws.wampee7.callbacks;

import org.codehaus.jackson.JsonNode;


public abstract class PubCallback {
	protected abstract JsonNode onPublish(String sessionID, JsonNode eventJson);
}
