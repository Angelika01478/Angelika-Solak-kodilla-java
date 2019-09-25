package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;


@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
@Autowired
private ProductDao productDao;
@Autowired
private InvoiceDao invoiceDao;

    @Test
    public void testItemDaoSave(){

        //given
        Product product = new Product("product1");
        Item item1 = new Item( new BigDecimal(10), 5);
        Item item2 = new Item( new BigDecimal(10), 2);
        productDao.save(product);
        product.getItems().add(item1);
        product.getItems().add(item2);
        item1.setProduct(product);
        item2.setProduct(product);

        Invoice invoice = new Invoice("Invoice1");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        //when

        invoiceDao.save(invoice);
        int id = invoice.getId();
        //then
        Assert.assertNotEquals(0, id);

        //clenUp
        invoiceDao.deleteById(id);
    }







}
