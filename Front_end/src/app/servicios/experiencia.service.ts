import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { experiencia } from '../models/experiencia.model';

@Injectable({
  providedIn: 'root',
})
export class ExperienciaService {
  private baseUrl =
    'https://portfolioargentinaprograma-production.up.railway.app';

  constructor(private httpClient: HttpClient) {}

  obtenerListaDeExperiencias(): Observable<experiencia[]> {
    return this.httpClient.get<experiencia[]>(
      `${this.baseUrl}/api/experiencia`
    );
  }
  //Obtener experiencia por id
  obtenerExperienciaPorId(id: number): Observable<experiencia> {
    return this.httpClient.get<experiencia>(
      `${this.baseUrl}/api/experiencia/${id}`
    );
  }
  //Eliminar experiencia por id
  eliminarExperienciaPorId(id: number): Observable<experiencia> {
    return this.httpClient.delete<experiencia>(
      `${this.baseUrl}/api/experiencia/${id}`
    );
  }

  //METODO PARA AGREGAR NUEVA EXPERIENCIA
  agregarNuevoProyecto(experiencia: experiencia): Observable<experiencia> {
    return this.httpClient.post<experiencia>(
      `${this.baseUrl}/api/experiencia`,
      experiencia
    );
  }

  editarExperienciaPorId(
    id: number,
    experiencia: experiencia
  ): Observable<experiencia> {
    return this.httpClient.put<experiencia>(
      `${this.baseUrl}/api/experiencia/${id}`,
      experiencia
    );
  }
}
