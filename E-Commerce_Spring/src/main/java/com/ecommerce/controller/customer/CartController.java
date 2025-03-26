package com.ecommerce.controller.customer;

import com.ecommerce.dto.CartItemsDto;
import com.ecommerce.dto.OrderDto;
import com.ecommerce.dto.QuantityChangeProductDto;
import com.ecommerce.service.customer.cart.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    
    public CartController(CartService cartService) {
		super();
		this.cartService = cartService;
	}

	@PostMapping("/cart")
    public ResponseEntity<?> addProductToCart(@RequestBody CartItemsDto cartItemsDto) {
        return cartService.addProductToCart(cartItemsDto);
    }

    @GetMapping("/cart/{userId}")
    public ResponseEntity<OrderDto> getCartByUserId(@PathVariable Long userId) {
        OrderDto orderDto = cartService.getCartByUserId(userId);
        return ResponseEntity.status(HttpStatus.OK).body(orderDto);
    }

    @PostMapping("/deduction")
    public ResponseEntity<OrderDto> addMinusOnProduct(@RequestBody QuantityChangeProductDto quantityChangeProductDto) {
        OrderDto orderDto = cartService.decreaseProductQuantity(quantityChangeProductDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(orderDto);
    }

    @PostMapping("/addition")
    public ResponseEntity<OrderDto> increaseProductQuantity(@RequestBody QuantityChangeProductDto quantityChangeProductDto) {
        OrderDto OrderDto = cartService.increaseProductQuantity(quantityChangeProductDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(OrderDto);
    }
    
    @DeleteMapping("/cart/remove/{userId}/{productId}")
    public ResponseEntity<OrderDto> removeFromCart(@PathVariable Long userId, @PathVariable Long productId) {
        try {
            OrderDto updatedCart = cartService.removeProductFromCart(userId, productId);
            return ResponseEntity.ok(updatedCart);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

}
