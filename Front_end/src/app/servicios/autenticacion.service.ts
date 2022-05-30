import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject , Observable } from 'rxjs';
import { map } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class AutenticacionService {
  url="https://portfolio-argentinaprograma.herokuapp.com/api/iniciarsesion";
  currentUserSubject: BehaviorSubject<any>;
  


  constructor(private http:HttpClient) { 
    console.log("El servicio de autenticacion esta corriendo");
    this.currentUserSubject = new BehaviorSubject<any>(JSON.parse(sessionStorage.getItem('currentUser')||'{}'))

  }
  IniciarSesion(credenciales:any): Observable<any> {
      return this.http.post(this.url,credenciales).pipe(map(data=>{
        sessionStorage.setItem('currentUser',JSON.stringify(data));
        this.currentUserSubject.next(data);
        return data;
      }))
  }

  

  public isUserLoggedIn(): boolean {
    return sessionStorage.getItem('currentUser')!==null;
  }
  public logout(){
    sessionStorage.removeItem('currentUser');
  }

  get UsuarioAutenticado(){
    return this.currentUserSubject.value;
  }
}
