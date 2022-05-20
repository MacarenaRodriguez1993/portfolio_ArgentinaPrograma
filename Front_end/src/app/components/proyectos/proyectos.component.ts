import { Component, OnInit } from '@angular/core';
import { proyecto } from 'src/app/models/proyecto.model';
import { ProyectoService } from 'src/app/servicios/proyecto.service';

@Component({
  selector: 'app-proyectos',
  templateUrl: './proyectos.component.html',
  styleUrls: ['./proyectos.component.css']
})
export class ProyectosComponent implements OnInit {

  proyect:proyecto[];

  constructor(private proyectoServicio:ProyectoService) { }

  ngOnInit(): void {
    this.obtenerProyectos();
  }

  obtenerProyectos(){
    this.proyectoServicio.obtenerListaDeProyectos().subscribe(dato=>{
      this.proyect=dato;
    })
  }
}
