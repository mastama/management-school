package teatech.id.management.dto;

import lombok.Data;

import java.util.List;

@Data
public class ClassroomDto {
    private String id;
    private String name;
    private String description;
    private String teacherId;
    List<ClassroomStudentDto> classroomStudentDtoList;
}
