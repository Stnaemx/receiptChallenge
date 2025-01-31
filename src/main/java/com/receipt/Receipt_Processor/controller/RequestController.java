package com.receipt.Receipt_Processor.controller;

import com.receipt.Receipt_Processor.dto.ReceiptDto;
import com.receipt.Receipt_Processor.dto.ResponseIdDto;
import com.receipt.Receipt_Processor.dto.ResponsePointsDto;
import com.receipt.Receipt_Processor.service.ReceiptService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/receipts")
@RequiredArgsConstructor
public class RequestController {

    private final ReceiptService receiptService;

    @PostMapping("/process")
    public ResponseEntity<ResponseIdDto> uploadReceipt(@RequestBody ReceiptDto receiptDto) {
        ResponseIdDto response = receiptService.saveReceipt(receiptDto);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}/points")
    public ResponseEntity<ResponsePointsDto> getPoints(@PathVariable String id) {
        return ResponseEntity.ok(receiptService.getReceiptPoints(id));
    }
}
