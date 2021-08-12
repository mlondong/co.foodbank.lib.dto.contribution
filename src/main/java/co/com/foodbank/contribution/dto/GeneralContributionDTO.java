package co.com.foodbank.contribution.dto;

import java.util.Date;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonFormat;
import co.com.foodbank.vehicule.dto.VolumeDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.contribution.dto
 *         31/05/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeneralContributionDTO {

    @NotNull
    @Size(min = 2, max = 32,
            message = "Description must be between 2 and 32 characters long")
    private String description;

    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;

    @Valid
    public VolumeDTO volume;



}
