import { Component } from '@angular/core';
import { CustomerService } from '../../service/customer.service';
import { MatSnackBar } from '@angular/material/snack-bar';

@Component({
  selector: 'app-get-my-wishlist',
  templateUrl: './get-my-wishlist.component.html',
  styleUrls: ['./get-my-wishlist.component.scss']
})
export class GetMyWishlistComponent {

  products: any[] = [];

  constructor(
    private customerService: CustomerService,
    private snackBar: MatSnackBar
  ) { }

  ngOnInit() {
    this.getWishlistByUserId();
  }

  getWishlistByUserId() {
    this.customerService.getWishlistByUserId().subscribe(
      (res) => {
        console.log(res);
        // this.products = res;
        res.forEach(element => {
          element.processedImg = 'data:image/jpeg;base64,' + element.returnedImg;
          this.products.push(element);
        });
      }
    )
  }
  removeFromWishlist(wishlistId: number): void {
    this.customerService.removeFromWishlist(wishlistId).subscribe({
      next: () => {
        // Update your list of products/wishlist items by filtering out the removed item.
        this.products = this.products.filter(p => p.id !== wishlistId);
      },
      error: (err) => console.error('Error removing from wishlist:', err)
    });
  }
  addToCart(productId: any) {
    this.customerService.addToCart(productId).subscribe((res) => {
      console.log(res);
      if (res.id != null) {
        this.snackBar.open("Product added to cart successfully", "Close", { duration: 5000 })
      } else if (res.id == null) {
        this.snackBar.open("Product already exist in the cart", "Close", { duration: 5000 })
      }
    });
  }
}
