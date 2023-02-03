import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { tecnologia } from '../models/tecnologia.model';

@Injectable({
  providedIn: 'root',
})
export class SkillsService {
  private baseUrl =
    'https://portfolioargentinaprograma-production.up.railway.app';
  constructor(private httpClient: HttpClient) {}

  //METODO GET PARA VER LAS SKILLS
  obtenerListaDeTecnologia(): Observable<tecnologia[]> {
    return this.httpClient.get<tecnologia[]>(`${this.baseUrl}/api/tecnologia`);
  }
  //METODO DELETE PARA ELIMINAR UNA SKILLS POR ID
  eliminarTecnologiaPorId(id: number): Observable<tecnologia> {
    return this.httpClient.delete<tecnologia>(
      `${this.baseUrl}/api/tecnologia/${id}`
    );
  }
  //METODO GET PARA OBTENER UNA SKILLS POR ID
  obtenerSkillsPorId(id: number): Observable<tecnologia> {
    return this.httpClient.get<tecnologia>(
      `${this.baseUrl}/api/tecnologia/${id}`
    );
  }

  //METODO POST PARA AGREGAR NUEVA SKILLS
  agregarNuevaSkill(skill: tecnologia): Observable<tecnologia> {
    return this.httpClient.post<tecnologia>(
      `${this.baseUrl}/api/tecnologia`,
      skill
    );
  }
  //METODO PUT PARA EDITAR UNA SKILLS POR ID
  editarSkillPorId(id: number, skill: tecnologia): Observable<tecnologia> {
    return this.httpClient.put<tecnologia>(
      `${this.baseUrl}/api/tecnologia/${id}`,
      skill
    );
  }
}
