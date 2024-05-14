package dev.langchain4j.model.anthropic.internal.client;

// TODO remove in favour of HttpException?
public class AnthropicHttpException extends RuntimeException {

    private final Integer statusCode;

    public AnthropicHttpException(Integer statusCode, String message) {
        super(message);
        this.statusCode = statusCode;
    }

    /**
     * HTTP response status code. Can be {@code null}.
     */
    public Integer statusCode() {
        return statusCode;
    }
}