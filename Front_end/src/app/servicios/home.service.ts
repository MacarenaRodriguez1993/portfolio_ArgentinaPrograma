import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class HomeService {
  url: String =
    'https://portfolioargentinaprograma-production.up.railway.app/api/';
  constructor(private http: HttpClient) {}
}
