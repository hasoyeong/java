package com.example.exception;

class PackingException extends Exception {
    public PackingException(String message) {
        super(message);
    }
}
// 영수증 발행 예외 클래스
class ReceiptPrintingException extends Exception {
    public ReceiptPrintingException(String message) {
        super(message);
    }
}
// 상품 발송 클래스
class ProductShipping {
    //상품 발송 메서드
    public void shipProduct() throws PackingException, ReceiptPrintingException {
        performPacking(); // 포장작업
        printReceipt(); //영수증발행
        sendProduct(); // 발송
    }
    // 포장 작업
    private void performPacking() throws PackingException {
        // 포장작업 수행
        System.out.println("상품을 포장합니다.");
        // 포장과정에서 문제가 발생하면
        if (Math.random() < 0.2) {
            throw new PackingException("포장과정에서 문제 발생했습니다.");
        }
    }
    // 영수증 발행 작업
    public void printReceipt() throws ReceiptPrintingException {
        // 영수증 발행 작업 수행
        System.out.println("영수증을 발행 합니다.");
        // 예외 발생시
        if (Math.random() < 0.2) {
            throw new ReceiptPrintingException("영수증 발행과정에 문제 발생했습니다.");
        }
    }
    // 상품발송 작업
    private void sendProduct() {
        //상품발송작업 수행
        System.out.println("상품을 발송합니다.");
    }
}
public class TranscationMain {
    public static void main(String[] args) {
        ProductShipping productShipping = new ProductShipping();

        try {
            productShipping.shipProduct();
            System.out.println("상품발송이 완료되었습니다.");
        } catch (PackingException | ReceiptPrintingException e) {
            System.out.println("상품발송 중에 문제가 발생하여 발송을 취소 합니다.");
            System.out.println("발생한 문제 : " + e.getMessage());
        }
    }// main
}
