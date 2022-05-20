import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { proyecto } from '../models/proyecto.model';

@Injectable({
  providedIn: 'root'
})
export class ProyectoService {
  private baseUrl="http://localhost:8080/proyecto/";
  constructor(private httpClient: HttpClient) { }

  obtenerListaDeProyectos():Observable<proyecto[]>{
    return this.httpClient.get<proyecto[]>(`${this.baseUrl}traer`);
  }
}
