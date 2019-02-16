package com.kodilla.stream.forum;

import org.junit.Assert;
import org.junit.Test;
import stream.invoice.simple.SimpleInvoice;
import stream.invoice.simple.SimpleItem;
import stream.invoice.simple.SimpleProduct;

public class SimpleInvoiceTestSuite {

    @Test

    public void testGetValueToPay() {

        SimpleProduct sp1 = new SimpleProduct("Pencil", 17.28);
        SimpleProduct sp2 = new SimpleProduct("Sticky Notes", 11.99);
        SimpleProduct sp3 = new SimpleProduct("Eraser", 6.49);
       // SimpleProduct sp4 = new SimpleProduct("Ruler", 1.33);

        SimpleItem inv1 = new SimpleItem(sp1, 2.0);
        SimpleItem inv2 = new SimpleItem(sp2, 3.5);
        SimpleItem inv3 = new SimpleItem(sp3, 5.0);
      //  SimpleItem inv4 = new SimpleItem(sp4, 45);

        SimpleInvoice simpleInvoice = new SimpleInvoice();

        simpleInvoice.addItem(inv1);
        simpleInvoice.addItem(inv2);
        simpleInvoice.addItem(inv3);
       // simpleInvoice.addItem(inv4);

        double result = simpleInvoice.getValueToPay();

        Assert.assertEquals(108.975,result,0);
        }


    }

