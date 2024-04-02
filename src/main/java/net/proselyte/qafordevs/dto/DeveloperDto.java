package net.proselyte.qafordevs.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.proselyte.qafordevs.entity.DeveloperEntity;
import net.proselyte.qafordevs.entity.Status;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public class DeveloperDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String specialty;
    private Status status;

    public DeveloperEntity toEntity() {
        return DeveloperEntity.builder()
                .id(id)
                .firstName(firstName)
                .lastName(lastName)
                .specialty(specialty)
                .status(status)
                .build();
    }

    public static DeveloperDto fromEntity(DeveloperEntity developer) {
        return DeveloperDto.builder()
                .id(developer.getId())
                .firstName(developer.getFirstName())
                .lastName(developer.getLastName())
                .specialty(developer.getSpecialty())
                .status(developer.getStatus())
                .build();
    }
}
