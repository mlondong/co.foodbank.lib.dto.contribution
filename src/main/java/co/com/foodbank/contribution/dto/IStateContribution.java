package co.com.foodbank.contribution.dto;

/**
 * Interface to handle all states in Contributions.
 * 
 * @author mauricio.londono@gmail.com co.com.foodbank.contribution.dto
 *         10/06/2021
 */
public interface IStateContribution {

    /*
     * 1. STATE PENDING (PROVIDER) 2. STATE PICKED (PROVIDER) 3. STATE INHOUSE
     * (THE CONTRIBUTION IS IN FOOD BANK) 4. STATE SHIP (BENEFIACIARY) 5. STATE
     * DELIVERED(NENEFICIARY)
     */

    /* WHEN THE CONTRIBUTIONS IS IN FOOD BANK */
    void inHouse(ContributionData contribution);

    /* WHEN THE CONTRIBUTIONS IS PICKED IN PROVIDER */
    void picked(ContributionData contribution);

    /* WHEN THE CONTRIBUTIONS IS PENDING TP PICK UP OR DELIVER */
    void pending(ContributionData contribution);

    /* WHEN THE CONTRIBUTIONS IS DELIVERED IN BENEFICIARY */
    void delyvered(ContributionData contribution);

    /* WHEN THE CONTRIBUTIONS IS SHIPMENT IN PROVIDER OR BENEFICIARY */
    void ship(ContributionData contribution);
}
