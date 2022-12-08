package org.sid.billingservice.entites;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.billingservice.model.Product;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id ;
    private double quantity;
    private double price ;
    private long prductId ;
    @ManyToOne
    @JoinColumn(name = "productItem_id")
    @JsonIncludeProperties(value = {"id","billingDate","customerID","customer"})
    private Bill bill ;
    @Transient
    private Product products ;
    @Transient
    private String productName;

}
