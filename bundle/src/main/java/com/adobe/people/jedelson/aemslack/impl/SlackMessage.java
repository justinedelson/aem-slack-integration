package com.adobe.people.jedelson.aemslack.impl;

import org.apache.sling.commons.json.JSONException;
import org.apache.sling.commons.json.JSONObject;

public class SlackMessage extends JSONObject {

    private static final String TEXT = "text";

    private static final String CHANNEL = "channel";

    public SlackMessage(String text) throws JSONException {
        super();
        put(TEXT, text);
    }

    public String toJsonString() {
        return super.toString();
    }

    public void setChannel(String channel) throws JSONException {
        put(CHANNEL, channel);
    }

}
