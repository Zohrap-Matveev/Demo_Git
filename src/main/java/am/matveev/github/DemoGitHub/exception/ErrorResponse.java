package am.matveev.github.DemoGitHub.exception;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ErrorResponse{

    private String message;

    private LocalDateTime timestamp;

    public ErrorResponse(String message, LocalDateTime timestamp){
        this.message = message;
        this.timestamp = timestamp;
    }
}
