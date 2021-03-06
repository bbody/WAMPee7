package ws.wampee7.controllers;


import org.codehaus.jackson.JsonNode;
import ws.wampee7.annotations.URIPrefix;
import ws.wampee7.callbacks.PubSubCallback;

public class WAMPee7Contoller {

	/**
	 * Registers a topic for this controller without using annotations. If @URIPrefix
	 * is present it will be put at the beginning of topicSuffix.
	 *
	 * Same as calling WAMPee7Server.addTopic(URIPrefix.value() + topicSuffix);
	 *
	 * @param topicSuffix
	 */
	public void addTopic(String topicSuffix) {
		URIPrefix prefix = this.getClass().getAnnotation(URIPrefix.class);
		if (prefix != null) {
			topicSuffix = prefix.value() + topicSuffix;
		}
		WAMPee7Server.addTopic(topicSuffix);
	}

	/**
	 * Registers a topic for this controller without using annotations. If @URIPrefix
	 * is present it will be put at the beginning of topicSuffix.
	 *
	 * This version allows for a supplied callback.
	 *
	 * Same as calling WAMPee7Server.addTopic(URIPrefix.value() + topicSuffix, cb);
	 *
	 * @param topicSuffix
	 */
	public void addTopic(String topicSuffix, PubSubCallback cb) {
		URIPrefix prefix = this.getClass().getAnnotation(URIPrefix.class);
		if (prefix != null) {
			topicSuffix = prefix.value() + topicSuffix;
		}
		WAMPee7Server.addTopic(topicSuffix, cb);
	}

	public static JsonNode cancel() {
		return null;
	}
}
