package co.com.foodbank.contribution.dao;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import co.com.foodbank.contribution.dto.IContribution;
import co.com.foodbank.contribution.state.IStateContribution;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.contribution.dto
 *         18/06/2021
 */
@JsonAutoDetect(fieldVisibility = Visibility.DEFAULT)
public class DetailContributionData implements IContribution, Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String id;
    private String description;
    private Date date;

    private IStateContribution state;

    private String codeBar;
    private Long numOfPackage;



    /**
     * Default constructor.
     */
    public DetailContributionData() {}

    public static long getSerialversionuid() {
        return serialVersionUID;
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
