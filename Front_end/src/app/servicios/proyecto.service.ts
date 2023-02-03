import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { proyecto } from '../models/proyecto.model';

@Injectable({
  providedIn: 'root',
})
export class ProyectoService {
  private baseUrl =
    'https://portfolioargentinaprograma-production.up.railway.app';

  constructor(private httpClient: HttpClient) {}

  //OBTENER UN PROYECTO
  obtenerListaDeProyectos(): Observable<proyecto[]> {
    return this.httpClient.get<proyecto[]>(`${this.baseUrl}/api/proyecto`);
  }

  //OBTENER UN PROYECTO POR MEDIO DE SU ID
  obtenerProyectoPorId(id: number): Observable<proyecto> {
    return this.httpClient.get<proyecto>(`${this.baseUrl}/api/proyecto/${id}`);
  }

  //ELIMINAR PROYECTO POR ID
  eliminarProyectoPorId(id: number): Observable<proyecto> {
    return this.httpClient.delete<proyecto>(
      `${this.baseUrl}/api/proyecto/${id}`
    );
  }

  //EDITAR PROYECTO
  editarProyectoPorId(id: number, proyecto: proyecto): Observable<proyecto> {
    return this.httpClient.put<proyecto>(
      `${this.baseUrl}/api/proyecto/${id}`,
      proyecto
    );
  }

  //AGREGAR UN NUEVO PROYECTO
  agregarNuevoProyeto(proyecto: proyecto): Observable<proyecto> {
    return this.httpClient.post<proyecto>(
      `${this.baseUrl}/api/proyecto`,
      proyecto
    );
  }
}
