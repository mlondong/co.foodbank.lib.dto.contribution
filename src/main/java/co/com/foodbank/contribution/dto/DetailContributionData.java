package co.com.foodbank.contribution.dto;

import java.util.Date;
import co.com.foodbank.contribution.interfaces.IContribution;
import co.com.foodbank.contribution.state.IStateContribution;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.contribution.dto
 *         18/06/2021
 */
@Data
@NoArgsConstructor
public class DetailContributionData implements IContribution {

    private String id;
    private String description;
    private Date date;

    private IStateContribution state;

    private String codeBar;
    private Long numOfPackage;


    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return description;
    }

    @Override
    public Date getDate() {
        // TODO Auto-generated method stub
        return date;
    }

    @Override
    public IStateContribution getState() {
        // TODO Auto-generated method stub
        return state;
    }

    @Override
    public String getId() {
        // TODO Auto-generated method stub
        return id;
    }

}
