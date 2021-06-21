package co.com.foodbank.contribution.dto;

import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonFormat;

public class DetailContributionDTO {


    @NotNull(message = "Descriptions must be declared.")
    @Size(min = 2, max = 32,
            message = "Description must be between 2 and 32 characters long")
    private String description;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;


    @NotNull
    @Size(min = 3, max = 12, message = "Code Bar may not be empty")
    private String codeBar;

    @NotNull
    @Pattern(regexp = "^[0-9]{1,4}$",
            message = "Num of package must be numeric between 1-4 digits.")
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
