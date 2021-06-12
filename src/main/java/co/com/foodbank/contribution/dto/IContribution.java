package co.com.foodbank.contribution.dto;

import java.util.Date;



/**
 * @author mauricio.londono@gmail.com co.com.foodbank.vault.v1.model 31/05/2021
 */
public interface IContribution {

    String getDescription();

    Date getDate();

    IStateContribution getState();

    String getId();

}