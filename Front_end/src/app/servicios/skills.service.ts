import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {tecnologia } from '../models/tecnologia.model';

@Injectable({
  providedIn: 'root'
})
export class SkillsService {

  
  private baseUrl="http://localhost:8080/api/tecnologia";
  constructor(private httpClient:HttpClient) { }

  obtenerListaDeTecnologia(): Observable<tecnologia[]>{
    return this.httpClient.get<tecnologia[]>(`${this.baseUrl}`);
  }

  eliminarTecnologiaPorId(id:number):Observable<tecnologia>{
    return this.httpClient.delete<tecnologia>(`${this.baseUrl}/${id}`);
  }
}
