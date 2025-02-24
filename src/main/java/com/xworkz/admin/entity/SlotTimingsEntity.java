package com.xworkz.admin.entity;

import lombok.Data;


import javax.persistence.*;

@Data
@Entity
@Table(name = "trainerslots")
@NamedQuery(name = "GetslotList", query = "SELECT e FROM SlotTimingsEntity e")
@NamedQuery(name = "getslotEntityCount", query = "SELECT COUNT(a) FROM SlotTimingsEntity a WHERE a.startTimings = :startTimings")
@NamedQuery(name = "getslotendTimeEntityCount", query = "SELECT COUNT(a) FROM SlotTimingsEntity a WHERE a.endTimings = :endTimings")


public class SlotTimingsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "StartTime")
    private String startTimings;

    @Column(name = "EndTime")
    private String endTimings;

    @Column(name = "Duration")
    private String duration;
}

