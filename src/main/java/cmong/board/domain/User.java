package cmong.board.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class User {

    @Id
    private Long id;

    private String userId;
    private String userPw;
    private String userName;
    private String userEmail;
}
