package com.school.smart.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table
public class Student {
@Id
@GeneratedValue

private int id;
@Column
private String name;
@Column
private String classname;
}
