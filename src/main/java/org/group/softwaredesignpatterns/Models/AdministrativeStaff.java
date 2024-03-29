package org.group.softwaredesignpatterns.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Duration;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Appointments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appointment_id;
    private String appointment_date;
    private String start_date;
    private String end_date;
    private Duration duration;
    private String appointment_location;
    private String price;
    private String appointment_status;
    private String service_type;
    //added new field professional_id
    private String professional_id;
    private String note;
}