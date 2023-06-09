package models;

import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.ToString;

@Setter
@Getter
@Builder
@ToString


public class User {

    private String email;
    private String password;
}
