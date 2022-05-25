import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { educacion } from '../models/educacion.model';

@Injectable({
  providedIn: 'root'
})
export class EducacionService {

  private baseUrl="http://localhost:8080/api/educacion";

  constructor(private httpClient:HttpClient) { }

  obtenerListaDeEducacion(): Observable<educacion[]>{
    return this.httpClient.get<educacion[]>(`${this.baseUrl}`);
  }

  eliminarEducacionPorId(educacion_id:number):Observable<educacion>{
    return this.httpClient.delete<educacion>(`${this.baseUrl}/${educacion_id}`);
  }
}
