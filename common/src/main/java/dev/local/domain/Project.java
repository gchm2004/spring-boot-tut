package dev.local.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

@Data
public class Project {
    @Id private String id;
    private String name;
    private String desc;
    private boolean enabled;
    private boolean archived;
    @DBRef(lazy = true)
    private User owner;
    @DBRef(lazy = true)
    private List<User> members;
    @DBRef(lazy = true)
    private List<TaskList> groups;
}
