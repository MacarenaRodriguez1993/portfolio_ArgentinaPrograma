import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { experiencia } from '../models/experiencia.model';

@Injectable({
  providedIn: 'root'
})
export class ExperienciaService {

  private baseUrl = "http://localhost:8080/experiencia/";

  constructor(private httpClient: HttpClient) { }

  obtenerListaDeExperiencias(): Observable<experiencia[]>{
    return this.httpClient.get<experiencia[]>(`${this.baseUrl}traer`);
  }

  
}
