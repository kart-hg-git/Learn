package in.swf.react.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private Long empId;
    private String name;
    private String dept;
    private Long salary;

}
