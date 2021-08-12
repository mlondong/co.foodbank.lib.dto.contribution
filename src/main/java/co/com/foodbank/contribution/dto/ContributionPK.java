package co.com.foodbank.contribution.dto;

import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.contribution.dto 8/07/2021
 */

@Data
@NoArgsConstructor
public class ContributionPK {

    @NotNull(message = "Complete contribution number.")
    private String contribution;


}
