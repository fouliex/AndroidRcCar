package com.bluebot.ui;

import java.util.Map;

/**
 * Created by Clifton Craig on 4/9/17.
 */

public interface ResponseHandler {
    void responseForRequest(String requestType, Map<String, Object> response);
}
