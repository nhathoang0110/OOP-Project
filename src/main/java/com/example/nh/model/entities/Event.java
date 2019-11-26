package com.example.nh.model.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString(callSuper=true, includeFieldNames=true)
@NoArgsConstructor
@AllArgsConstructor
@Table(name="event")
public class Event extends entity {
	private String field;
}
