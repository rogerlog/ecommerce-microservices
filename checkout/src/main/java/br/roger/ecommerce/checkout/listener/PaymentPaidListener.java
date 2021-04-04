package br.roger.ecommerce.checkout.listener;

import br.roger.ecommerce.checkout.entity.CheckoutEntity;
import br.roger.ecommerce.checkout.service.CheckoutService;
import br.roger.ecommerce.checkout.streaming.PaymentPaidSink;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentPaidListener {

    private final CheckoutService checkoutService;

    public PaymentPaidListener(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @StreamListener(PaymentPaidSink.INPUT)
    public void handler(PaymentCreatedEvent paymentCreatedEvent) {
        checkoutService.updateStatus(paymentCreatedEvent.getCheckoutCode().toString(), CheckoutEntity.Status.APPROVED);
    }
}
