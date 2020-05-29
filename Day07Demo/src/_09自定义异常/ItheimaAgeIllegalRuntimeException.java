package _09自定义异常;

public class ItheimaAgeIllegalRuntimeException extends RuntimeException {
    public ItheimaAgeIllegalRuntimeException() {
    }

    public ItheimaAgeIllegalRuntimeException(String message) {
        super(message);
    }

    public ItheimaAgeIllegalRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ItheimaAgeIllegalRuntimeException(Throwable cause) {
        super(cause);
    }

    public ItheimaAgeIllegalRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
