package com.practice.todoServerSecond.domain.practice01.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Data
@Entity
@NoArgsConstructor
public class Practice01Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="owner_id", referencedColumnName = "id")
    private Owner owner;

    private long salesPrice;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "sales_id")
    private List<Payment> paymentList = new ArrayList<>();

    private LocalDateTime paymentDate;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @CreationTimestamp
    private LocalDateTime createdDate;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @UpdateTimestamp
    private LocalDateTime updatedDate;

    private String deleted;

}