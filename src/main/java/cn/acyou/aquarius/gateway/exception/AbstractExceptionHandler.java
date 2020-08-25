package cn.acyou.aquarius.gateway.exception;

import org.springframework.cloud.gateway.support.NotFoundException;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;
import java.util.Map;

/**
 * @author youfang
 * @version [1.0.0, 2020/8/25]
 **/
public abstract class AbstractExceptionHandler {

    protected String formatMessage(Throwable ex) {
        String errorMessage = null;
        if (ex instanceof NotFoundException) {
            String reason = ((NotFoundException) ex).getReason();
            errorMessage = reason;
        } else if (ex instanceof ResponseStatusException) {
            ResponseStatusException responseStatusException = (ResponseStatusException) ex;
            errorMessage = responseStatusException.getMessage();
        } else {
            errorMessage = ex.getMessage();
        }
        return errorMessage;
    }

    protected Map<String, Object> buildErrorMap(String errorMessage) {
        Map<String, Object> resMap = new HashMap<>();
        resMap.put("success", false);
        resMap.put("code", 570);
        resMap.put("message", errorMessage);
        resMap.put("data", null);
        return resMap;
    }

}