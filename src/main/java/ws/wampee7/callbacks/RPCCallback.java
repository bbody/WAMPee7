package ws.wampee7.callbacks;

import org.codehaus.jackson.JsonNode;


public abstract class RPCCallback {
	public abstract JsonNode call(String string, JsonNode... args) throws Throwable;
}
