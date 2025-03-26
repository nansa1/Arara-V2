import { Component } from '@angular/core';
import { AdminService } from '../../service/admin.service';

@Component({
  selector: 'app-orders',
  templateUrl: './orders.component.html',
  styleUrls: ['./orders.component.scss']
})
export class OrdersComponent {

  isSpinning = false;
  Orders: any;
  notificationMessage: string = "";
  showNotification: boolean = false;

  constructor(private adminService: AdminService) {}

  ngOnInit(): void {
    this.getPlacedOrders();
  }

  getPlacedOrders() {
    this.adminService.getPlacedOrders().subscribe((res) => {
      this.Orders = res;
      console.log(res);
    });
  }

  changeOrderStatus(orderId: number, status: string) {
    console.log('Status is:', status);
    this.adminService.changeOrderStatus(orderId, status).subscribe(
      (res) => {
        console.log(res);
        if (res.id != null) {
          this.showToast("Order Status changed successfully");
          this.getPlacedOrders();
        } else {
          this.showToast("Something went wrong");
        }
      }
    );
  }

  showToast(message: string) {
    this.notificationMessage = message;
    this.showNotification = true;
    setTimeout(() => {
      this.showNotification = false;
    }, 5000);
  }
}
