package com.ecommerce.controller.customer;

import com.ecommerce.dto.ProductDto;
import com.ecommerce.dto.WishlistDto;
import com.ecommerce.service.customer.wishlist.WishlistService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/customer")
@RequiredArgsConstructor
public class WishlistController {

    private final WishlistService wishlistService;

    
    
    public WishlistController(WishlistService wishlistService) {
		super();
		this.wishlistService = wishlistService;
	}

	@PostMapping("/wishlist")
    public ResponseEntity<?> addProductToWishlist(@RequestBody WishlistDto wishlistDto) throws IOException {
        WishlistDto postedWishlistDto = wishlistService.addProductToWishlist(wishlistDto);
        if (postedWishlistDto == null)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Something went wrong");
        return ResponseEntity.status(HttpStatus.CREATED).body(postedWishlistDto);
    }

    @GetMapping("/wishlist/{userId}")
    public ResponseEntity<List<WishlistDto>> getWishlistByUserId(@PathVariable Long userId) {
        List<WishlistDto> wishlistDtos = wishlistService.getWishlistByUserId(userId);
        return ResponseEntity.ok(wishlistDtos);
    }
    
    @DeleteMapping("/wishlist/remove/{wishlistId}")
    public ResponseEntity<Map<String, String>> removeFromWishlist(@PathVariable Long wishlistId) {
        wishlistService.removeFromWishlist(wishlistId);
        Map<String, String> response = new HashMap<>();
        response.put("message", "Item removed from wishlist");
        return ResponseEntity.ok(response);
    }
}
