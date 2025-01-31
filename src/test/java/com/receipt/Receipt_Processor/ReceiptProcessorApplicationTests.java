//package com.receipt.Receipt_Processor;
//
//import com.receipt.Receipt_Processor.dto.Item;
//import com.receipt.Receipt_Processor.dto.ReceiptDto;
//import com.receipt.Receipt_Processor.service.ReceiptService;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.boot.test.context.SpringBootTest;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//
//@SpringBootTest
//@ExtendWith(MockitoExtension.class)
//class ReceiptProcessorApplicationTests {
//
//	@Mock
//	private Map<String, Integer> dataStore;
//
//	@InjectMocks
//	private ReceiptService receiptService;
//
//	private ReceiptDto sampleReceipt;
//
////	@BeforeEach
////	void setUp() {
////		List<Item> items = Arrays.asList(
////				new Item("Mountain Dew 12PK", "6.49"),
////				new Item("Emils Cheese Pizza", "12.25"),
////				new Item("Knorr Creamy Chicken", "1.26"),
////				new Item("Doritos Nacho Cheese", "3.35"),
////				new Item("   Klarbrunn 12-PK 12 FL OZ  ", "12.00")
////		);
////
////		sampleReceipt = new ReceiptDto(
////				"Target",
////				"2022-01-01",
////				"13:01",
////				"35.35",
////				items
////		);
////	}
//
//	@BeforeEach
//	void setUp() {
//		List<Item> items = Arrays.asList(
//				new Item("Gatorade", "2.25"),
//				new Item("Gatorade", "2.25"),
//				new Item("Gatorade", "2.25"),
//				new Item("Gatorade", "2.25")
//		);
//
//		sampleReceipt = new ReceiptDto(
//				"M&M Corner Market",
//				"2022-03-20",
//				"14:33",
//				"9.00",
//				items
//		);
//	}
//
//	@Test
//	public void testAlphanumeric() {
//		assertEquals(14, receiptService.calculateAlphanumeric(sampleReceipt.getRetailer()));
//	}
//
//	@Test
//	public void testcalculateRoundDollar() {
//		assertEquals(50, receiptService.calculateRoundDollar(Double.parseDouble(sampleReceipt.getTotal())));
//	}
//
//	@Test
//	public void testcalculateRoundQuarter() {
//		assertEquals(25, receiptService.calculateRoundQuarter(Double.parseDouble(sampleReceipt.getTotal())));
//	}
//
//	@Test
//	public void testcalculateEveryTwo() {
//		assertEquals(10, receiptService.calculateEveryTwo(sampleReceipt.getItems().size()));
//	}
//
//	@Test
//	public void testcalculateTrim() {
//		assertEquals(6, receiptService.calculateTrim(sampleReceipt.getItems()));
//	}
//
//	@Test
//	public void testcalculateOddDate() {
//		assertEquals(6, receiptService.calculateOddDate(sampleReceipt.getPurchaseDate()));
//	}
//
//	@Test
//	public void testcalculatePurchaseTime() {
//		assertEquals(10, receiptService.calculatePurchaseTime(sampleReceipt.getPurchaseTime()));
//	}
//}
