import {Component, OnInit} from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-products',
  imports: [],
  templateUrl: './products.component.html',
  styleUrl: './products.component.css'
})
export class ProductsComponent{

  constructor(private http:HttpClient) {
    ngOnInit(): void{
      this.http.get()
    }

  }

}
