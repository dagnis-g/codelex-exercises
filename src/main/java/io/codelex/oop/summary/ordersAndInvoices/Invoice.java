package io.codelex.oop.summary.ordersAndInvoices;

public class Invoice {
    private final Order order;
    private final String invoiceNumber;
    private InvoiceStatus status = InvoiceStatus.APPROVED;

    public Invoice(String invoiceNumber, Order order) {
        this.order = order;
        this.invoiceNumber = invoiceNumber;
    }

    public Invoice(String invoiceNumber) throws WrongOrderException {
        throw new WrongOrderException();
    }

    public void send() {
        this.status = InvoiceStatus.SENT;
    }

    public String printInvoice() {
        return "===================================================\n" +
                String.format("%-50s%s", ("= INVOICE NUMBER: " + invoiceNumber), "=") + "\n" +
                String.format("%-50s%s", ("= STATUS: " + status.toString()), "=") + "\n" +
                order.getOrderListString() + "\n" +
                String.format("%-50s%s", ("= SUM: " + order.getPriceWithoutVAT()), "=") + "\n" +
                String.format("%-50s%s", ("= VAT: " + order.calculateVat()), "=") + "\n" +
                String.format("%-50s%s", ("= TOTAL: " + order.getPriceWithVAT()), "=") + "\n" +
                "===================================================";
    }
}
