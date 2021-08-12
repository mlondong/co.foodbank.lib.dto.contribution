package co.com.foodbank.contribution.dao;

import java.util.Date;
import co.com.foodbank.contribution.state.IStateContribution;
import co.com.foodbank.vehicule.dto.VolumeDTO;

public class ContributionData {

    private String id;
    private String description;
    private Date date;
    private IStateContribution state;

    /* parameters for detail contribution */
    private String codeBar;
    private Long numOfPackage;

    /* parameters for general contribution */
    public VolumeDTO volume;


    /**
     * Default constructor.
     */
    public ContributionData() {}


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public Date getDate() {
        return date;
    }


    public void setDate(Date date) {
        this.date = date;
    }


    public IStateContribution getState() {
        return state;
    }


    public void setState(IStateContribution state) {
        this.state = state;
    }


    public String getCodeBar() {
        return codeBar;
    }


    public void setCodeBar(String codeBar) {
        this.codeBar = codeBar;
    }


    public Long getNumOfPackage() {
        return numOfPackage;
    }


    public void setNumOfPackage(Long numOfPackage) {
        this.numOfPackage = numOfPackage;
    }


    public VolumeDTO getVolume() {
        return volume;
    }


    public void setVolume(VolumeDTO volume) {
        this.volume = volume;
    }


}
