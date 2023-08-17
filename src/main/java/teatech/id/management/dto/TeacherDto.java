package teatech.id.management.dto;

import lombok.Data;

import java.util.List;

@Data
public class TeacherDto {
    private String id;
    private String firstName;
    private String lastName;
    private String teacherNumber;
    List<TeacherClassroomDto> teacherClassroomDtoList;
}
