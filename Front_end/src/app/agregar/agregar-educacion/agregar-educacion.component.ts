import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { educacion } from 'src/app/models/educacion.model';
import { AutenticacionService } from 'src/app/servicios/autenticacion.service';
import { EducacionService } from 'src/app/servicios/educacion.service';

@Component({
  selector: 'app-agregar-educacion',
  templateUrl: './agregar-educacion.component.html',
  styleUrls: ['./agregar-educacion.component.css']
})
export class AgregarEducacionComponent implements OnInit {

  educacion:educacion = new educacion();
  isUserLoggedIn:boolean = false;
  constructor(private educacionServicio:EducacionService,
    private autenticacionServicio:AutenticacionService,
              private router: Router) { }

  ngOnInit(): void {
    this.isUserLoggedIn=this.autenticacionServicio.isUserLoggedIn();
  }

  agregarEducacion(){
    this.educacionServicio.agregarNuevaEducacion(this.educacion).subscribe(dato=>{
      console.log(dato);
      this.volverHome();
      
    });
  }
  volverHome(){
    this.router.navigate(['/home']);
  }
  onSubmit(){
    this.agregarEducacion();
    
  }

 
}
