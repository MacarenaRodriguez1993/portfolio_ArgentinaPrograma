import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {environment} from 'src/environments/environment';
import { persona } from '../models/persona.model';

@Injectable({
  providedIn: 'root'
})
export class HeaderService {
  URL="https://portfolio-argentinaprograma.herokuapp.com";

  constructor(private http: HttpClient) { }

  public getPersona(): Observable<persona> {
    return this.http.get<persona>(this.URL);
  }

  public addPersona(): Observable<persona> {
    return this.http.post<persona>(this.URL+'/api/personas/crear',persona);
  }

  public updatePersona(persona: persona): Observable<persona> {
    return this.http.put<persona>(this.URL+'/api/personas/editar/2',persona);
  }

  public deletePersona(): Observable<persona> {
    return this.http.delete<persona>(this.URL+'/api/personas/eliminar/${persona_id}');
  }
}
