package co.com.foodbank.contribution.dto;

import java.util.Date;
import co.com.foodbank.contribution.interfaces.IContribution;
import co.com.foodbank.contribution.state.IStateContribution;
import co.com.foodbank.vehicule.dto.VolumeDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GeneralContributionData implements IContribution {

    private String id;
    private String description;
    private Date date;

    private IStateContribution state;

    public VolumeDTO volume;



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
