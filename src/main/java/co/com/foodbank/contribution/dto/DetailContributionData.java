package co.com.foodbank.contribution.dto;

import java.util.Date;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.contribution.dto
 *         18/06/2021
 */
public class DetailContributionData implements IContribution {

    private String id;
    private String description;
    private Date date;

    // @JsonIgnore(value = true)
    private IStateContribution state;

    private String codeBar;
    private Long numOfPackage;



    public DetailContributionData() {}

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
