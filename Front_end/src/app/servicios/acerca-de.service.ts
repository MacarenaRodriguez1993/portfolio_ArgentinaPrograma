import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { persona } from '../models/persona.model';

@Injectable({
  providedIn: 'root'
})
export class AcercaDeService {

  private baseUrl="http://localhost:8080/personas/";

  constructor(private httpClient:HttpClient) { }

  public verpersona(): Observable<persona[]> {
    return this.httpClient.get<persona[]>(`${this.baseUrl}traer`);
  }

  public editarPersona(id:number,persona:persona): Observable<persona>{
    return this.httpClient.put<persona>(`${this.baseUrl}editar/${id}`,persona);
  }
  
}
