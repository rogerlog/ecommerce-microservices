package br.roger.ecommerce.checkout.service;

import br.roger.ecommerce.checkout.entity.CheckoutEntity;
import br.roger.ecommerce.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

    Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}
