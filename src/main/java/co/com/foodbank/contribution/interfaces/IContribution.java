package co.com.foodbank.contribution.interfaces;

import java.util.Date;
import co.com.foodbank.contribution.state.IStateContribution;



/**
 * @author mauricio.londono@gmail.com co.com.foodbank.vault.v1.model 31/05/2021
 */
public interface IContribution {

    String getDescription();

    Date getDate();

    IStateContribution getState();

    String getId();

}
