import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { educacion } from 'src/app/models/educacion.model';
import { AutenticacionService } from 'src/app/servicios/autenticacion.service';
import { EducacionService } from 'src/app/servicios/educacion.service';

@Component({
  selector: 'app-educacion',
  templateUrl: './educacion.component.html',
  styleUrls: ['./educacion.component.css']
})
export class EducacionComponent implements OnInit {

    edu:educacion[];
    isUserLoggedIn:Boolean = false;
  
  constructor(private educacionServicio:EducacionService,
            private autenticacionServicio:AutenticacionService,
            private router:Router) { }

  ngOnInit(): void {
    this.isUserLoggedIn=this.autenticacionServicio.isUserLoggedIn();
    this.obtenerEducaciones();
  }
  obtenerEducaciones(){
    this.educacionServicio.obtenerListaDeEducacion().subscribe(dato=>{
      this.edu=dato;
    })
  }
  //METODO PARA ELIMINAR
  eliminarEducacion(id:number){
    alert("Estas seguro de eliminar?");
    this.educacionServicio.eliminarEducacionPorId(id).subscribe(dato=>{
    this.obtenerEducaciones();
  })
  }

  //REDIRECCION PARA EDITAR UNA EDUCACION 
  editarEducacion(id:number){
    this.router.navigate(['/editar-educacion',id]);
  }
  
  //REDIRECCION PARA AGREGAR NUEVA EDUCACION
  agrergarNuevaEducacion(){
    this.router.navigate(['/agregar-educacion'])
  }

}
