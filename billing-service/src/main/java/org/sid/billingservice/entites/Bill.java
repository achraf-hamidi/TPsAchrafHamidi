package org.sid.billingservice.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.billingservice.model.Customer;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private Date billingDate;
    @OneToMany(targetEntity=ProductItem.class,cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private Collection<ProductItem> productItems ;
    private  Long customerID ;
    @Transient
    private Customer customer ;



}
