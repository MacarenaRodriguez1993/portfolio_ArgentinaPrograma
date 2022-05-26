import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { proyecto } from '../models/proyecto.model';

@Injectable({
  providedIn: 'root'
})
export class ProyectoService {
  private baseUrl="http://localhost:8080/api/proyecto";
  constructor(private httpClient: HttpClient) { }

  obtenerListaDeProyectos():Observable<proyecto[]>{
    return this.httpClient.get<proyecto[]>(`${this.baseUrl}`);
  }

  eliminarProyectoPorId(id:number):Observable<proyecto>{
    return this.httpClient.delete<proyecto>(`${this.baseUrl}/${id}`);
  }

  //OBTENER UN PROYECTO POR MEDIO DE SU ID
  obtenerProyectoPorId(id:number):Observable<proyecto>{
    return this.httpClient.get<proyecto>(`${this.baseUrl}/${id}`);


  }

  //EDITAR PROYECTO
  editarProyectoPorId(id:number,proyecto:proyecto):Observable<proyecto>{
    return this.httpClient.put<proyecto>(`${this.baseUrl}/${id}`,proyecto);
  }

  //AGREGAR UN NUEVO PROYECTO
  agregarNuevoProyeto(proyecto:proyecto): Observable<proyecto>{
    return this.httpClient.post<proyecto>(`${this.baseUrl}/crear`,proyecto);

  }
}
