import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { educacion } from '../models/educacion.model';

@Injectable({
  providedIn: 'root',
})
export class EducacionService {
  private baseUrl =
    'https://portfolioargentinaprograma-production.up.railway.app';

  constructor(private httpClient: HttpClient) {}

  //OBTENER UNA EDUCACION
  obtenerListaDeEducacion(): Observable<educacion[]> {
    return this.httpClient.get<educacion[]>(`${this.baseUrl}/api/educacion`);
  }

  //OBTENER UNA EDUCACION POR ID
  obtenerEducacionPorId(id: number): Observable<educacion> {
    return this.httpClient.get<educacion>(
      `${this.baseUrl}/api/educacion/${id}`
    );
  }

  //ELIMINAR EDUCACION POR ID
  eliminarEducacionPorId(educacion_id: number): Observable<educacion> {
    return this.httpClient.delete<educacion>(
      `${this.baseUrl}/api/educacion/${educacion_id}`
    );
  }
  //EDITAR UNA EDUCACION
  editarEducacionPorId(
    id: number,
    educacion: educacion
  ): Observable<educacion> {
    return this.httpClient.put<educacion>(
      `${this.baseUrl}/api/educacion/${id}`,
      educacion
    );
  }

  //AGREGAR NUEVA EDUCACION
  agregarNuevaEducacion(educacion: educacion): Observable<educacion> {
    return this.httpClient.post<educacion>(
      `${this.baseUrl}/api/educacion`,
      educacion
    );
  }
}
