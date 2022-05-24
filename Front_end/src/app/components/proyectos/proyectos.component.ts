import { Component, OnInit } from '@angular/core';
import { proyecto } from 'src/app/models/proyecto.model';
import { AutenticacionService } from 'src/app/servicios/autenticacion.service';
import { ProyectoService } from 'src/app/servicios/proyecto.service';

@Component({
  selector: 'app-proyectos',
  templateUrl: './proyectos.component.html',
  styleUrls: ['./proyectos.component.css']
})
export class ProyectosComponent implements OnInit {

  proyect:proyecto[];
  isUserLoggedIn:boolean = false;
  constructor(private proyectoServicio:ProyectoService,
              private autenticacionServicio:AutenticacionService) { }

  ngOnInit(): void {
    this.isUserLoggedIn=this.autenticacionServicio.isUserLoggedIn();
    this.obtenerProyectos();
  }

  obtenerProyectos(){
    this.proyectoServicio.obtenerListaDeProyectos().subscribe(dato=>{
      this.proyect=dato;
    })
  }
}
