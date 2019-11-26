package com.example.nh.model.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString(callSuper=true, includeFieldNames=true)
@Table(name="location")
public class Location extends entity {
	
	@ManyToOne 
    @JoinColumn(name = "countryid",nullable=false) // thông qua khóa ngoại
    private Country country;
	
	
}
