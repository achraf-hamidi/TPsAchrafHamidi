package org.sid.billingservice.web;


import lombok.extern.slf4j.Slf4j;
import org.sid.billingservice.entites.Bill;
import org.sid.billingservice.feign.CustomerRestClient;
import org.sid.billingservice.feign.ProductItemRestClient;
import org.sid.billingservice.model.Product;
import org.sid.billingservice.repositories.BillRepository;
import org.sid.billingservice.repositories.ProductItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableFeignClients
@Slf4j
public class BillRestController {
    @Autowired
    private BillRepository billRepository;
    @Autowired
    private ProductItemRepository productItemRepository;
    @Autowired
    private CustomerRestClient customerServiceClient;
    @Autowired
    private ProductItemRestClient productItemRestClient;

    @GetMapping("/fullbill/{id}")
    Bill getBill(@PathVariable(name = "id") Long id){
        Bill bill=billRepository.findById(id).get();
        bill.setCustomer(customerServiceClient.getCustomerById(bill.getCustomerID()));
       bill.setProductItems(productItemRepository.findByBillId(bill.getId()));
        /*bill.getProductItems().forEach(
                pi -> {
                    Product product =productItemRestClient.getProductById(pi.getPrductId());
                    pi.setProducts(product);
                    pi.setProductName(product.getName());
                }
        );*/
        return bill;
    }
}