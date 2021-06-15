package co.com.foodbank.contribution.dto;

import java.util.Date;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonFormat;
import co.com.foodbank.vehicule.dto.VolumeDTO;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.contribution.dto
 *         31/05/2021
 */
public class GeneralContributionDTO {


    @NotNull
    @Size(min = 2, max = 32,
            message = "Description must be between 2 and 32 characters long")
    private String description;

    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;

    @Valid
    public VolumeDTO volume;



    public GeneralContributionDTO() {}


    public GeneralContributionDTO(String description, Date dateContribution,
            VolumeDTO volume) {
        this.description = description;
        this.date = dateContribution;
        this.volume = volume;
    }

    public VolumeDTO getVolume() {
        return volume;
    }


    public void setVolume(VolumeDTO volume) {
        this.volume = volume;
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


    @Override
    public String toString() {
        return "GeneralContributionDTO [description=" + description + ", date="
                + date + ", volume=" + volume + "]";
    }



}
