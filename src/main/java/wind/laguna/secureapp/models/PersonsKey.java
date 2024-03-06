package wind.laguna.secureapp.models;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class PersonsKey implements Serializable {
    private String name;
    private String surname;
    private int age;

}
