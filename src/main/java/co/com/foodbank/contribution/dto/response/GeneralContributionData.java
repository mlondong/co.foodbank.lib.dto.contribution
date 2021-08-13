package co.com.foodbank.contribution.dto.response;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import co.com.foodbank.contribution.dto.interfaces.IContribution;
import co.com.foodbank.contribution.state.IStateContribution;
import co.com.foodbank.vehicule.dto.VolumeDTO;

@JsonAutoDetect(fieldVisibility = Visibility.DEFAULT)
public class GeneralContributionData implements IContribution, Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String id;
    private String description;
    private Date date;

    private IStateContribution state;

    public VolumeDTO volume;



    /**
     * Default constructor.
     */
    public GeneralContributionData() {}



    public static long getSerialversionuid() {
        return serialVersionUID;
    }



    public void setId(String id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setState(IStateContribution state) {
        this.state = state;
    }

    public void setVolume(VolumeDTO volume) {
        this.volume = volume;
    }

    public VolumeDTO getVolume() {
        return volume;
    }

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
