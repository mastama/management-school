package teatech.id.management.dto;

import lombok.Data;

import java.util.List;

@Data
public class StudentDto {
    private String Id;
    private String firstName;
    private String lastName;
    private String studentNumber;
    private List<AddressDto> addressDtoList;
    private String classroomId;
}
