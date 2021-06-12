package co.com.foodbank.contribution.dto;

import java.util.Date;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonFormat;

public class DetailContributionDTO {


    @NotNull
    @NotBlank
    private String description;

    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;


    @NotNull
    @NotBlank
    private String codeBar;

    @NotNull
    @NotBlank
    private String numOfPackage;


    /**
     * Default constructor.
     */
    public DetailContributionDTO() {}


    public DetailContributionDTO(String description, Date dateContribution,
            String codeBar, String numOfPackage) {
        super();
        this.description = description;
        this.date = dateContribution;
        this.codeBar = codeBar;
        this.numOfPackage = numOfPackage;
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


    public String getCodeBar() {
        return codeBar;
    }


    public void setCodeBar(String codeBar) {
        this.codeBar = codeBar;
    }


    public String getNumOfPackage() {
        return numOfPackage;
    }


    public void setNumOfPackage(String numOfPackage) {
        this.numOfPackage = numOfPackage;
    }


    @Override
    public String toString() {
        return "DetailContributionDTO [description=" + description + ", date="
                + date + ", codeBar=" + codeBar + ", numOfPackage="
                + numOfPackage + "]";
    }


}
