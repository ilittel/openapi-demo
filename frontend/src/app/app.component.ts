import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { Product, UsersService } from 'src/openapi';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  products$: Observable<Product[]>;

  constructor(private usersService: UsersService) {
    this.products$ = usersService.searchProducts();
  }
}
