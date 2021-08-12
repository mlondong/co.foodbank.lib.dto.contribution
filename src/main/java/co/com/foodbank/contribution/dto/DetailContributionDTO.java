package co.com.foodbank.contribution.dto;

import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.contribution.dto
 *         11/08/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetailContributionDTO {

    @NotNull(message = "Descriptions must be declared.")
    @Size(min = 2, max = 32,
            message = "Description must be between 2 and 32 characters long")
    private String description;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;


    @NotNull
    @Size(min = 3, max = 12, message = "Code Bar may not be empty")
    private String codeBar;

    @NotNull
    @Pattern(regexp = "^[0-9]{1,4}$",
            message = "Num of package must be numeric between 1-4 digits.")
    private String numOfPackage;



}
