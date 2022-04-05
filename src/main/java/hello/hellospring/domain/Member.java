package hello.hellospring.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Member {

    private Long id; //index
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

}
