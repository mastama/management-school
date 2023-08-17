package teatech.id.management.dto;

import lombok.Data;

@Data
public class AddressDto {
    private String id;
    private String street;
    private String city;
    private String state;
    private String zipCode;
}
