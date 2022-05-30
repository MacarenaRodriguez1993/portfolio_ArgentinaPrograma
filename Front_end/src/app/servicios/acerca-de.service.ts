import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { persona } from '../models/persona.model';

@Injectable({
  providedIn: 'root'
})
export class AcercaDeService {

  private baseUrl="https://portfolio-argentinaprograma.herokuapp.com";

  constructor(private httpClient:HttpClient) { }


  //Obtener persona
  verpersona(): Observable<persona[]> {
    return this.httpClient.get<persona[]>(`${this.baseUrl}/api/persona`);
    }
  //obtener Perfil por id
  obtenerPersonaPorId(id:number): Observable<persona>{
    return this.httpClient.get<persona>(`${this.baseUrl}/api/persona/${id}`);

  }
  //editar una persona
  editarPersona(id:number,persona:persona): Observable<persona>{
    return this.httpClient.put<persona>(`${this.baseUrl}/api/persona/${id}`,persona);
  }
  
}
