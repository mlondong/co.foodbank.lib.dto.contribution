package co.com.foodbank.contribution.dto;

import javax.validation.constraints.NotNull;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.contribution.dto 8/07/2021
 */
public class ContributionPK {

    @NotNull(message = "Complete contribution number.")
    private String contribution;

    public ContributionPK() {}

    public String getContribution() {
        return contribution;
    }

    public void setContribution(String contribution) {
        this.contribution = contribution;
    }

}
