import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {environment} from 'src/environments/environment';
import { persona } from '../models/persona.model';

@Injectable({
  providedIn: 'root'
})
export class HeaderService {
  URL='http://localhost:8080/personas/';

  constructor(private http: HttpClient) { }

  public getPersona(): Observable<persona> {
    return this.http.get<persona>(this.URL+'traer/perfil/2');
  }

  public addPersona(): Observable<persona> {
    return this.http.post<persona>(this.URL+'crear',persona);
  }

  public updatePersona(persona: persona): Observable<persona> {
    return this.http.put<persona>(this.URL+'editar/2',persona);
  }

  public deletePersona(): Observable<persona> {
    return this.http.delete<persona>(this.URL+'eliminar/${persona_id}');
  }
}
