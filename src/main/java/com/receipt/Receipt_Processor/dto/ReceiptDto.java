package com.receipt.Receipt_Processor.dto;

import lombok.*;

import java.util.List;

@Getter
@AllArgsConstructor
public class ReceiptDto {

    private String retailer;
    private String purchaseDate;
    private String purchaseTime;
    private String total;
    private List<Item> items;
}