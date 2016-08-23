package me.stevetan.sparkpoc.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by stevetan on 23/8/16.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "people")
public class People extends BaseModel {

    @Column(name = "name", length = 255)
    private String name;

}
