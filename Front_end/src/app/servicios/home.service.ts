import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HomeService {
  url:String="http://localhost:8080/api/";
  constructor(private http:HttpClient) { }

  obtenerDatos():Observable<any>(this.url);
}
