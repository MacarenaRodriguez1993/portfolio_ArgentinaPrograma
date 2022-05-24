import { Component, OnInit } from '@angular/core';
import { experiencia } from 'src/app/models/experiencia.model';
import { AutenticacionService } from 'src/app/servicios/autenticacion.service';
import { ExperienciaService } from 'src/app/servicios/experiencia.service';

@Component({
  selector: 'app-experiencia',
  templateUrl: './experiencia.component.html',
  styleUrls: ['./experiencia.component.css']
})
export class ExperienciaComponent implements OnInit {
  experiencia:experiencia[];
  isUserLoggedIn:boolean=false;
  constructor(private experienciaServicio:ExperienciaService,
              private autenticacionServicio:AutenticacionService) { }

  ngOnInit(): void {
    this.isUserLoggedIn=this.autenticacionServicio.isUserLoggedIn();
    this.obtenerExperiencia();
  }
  private obtenerExperiencia(){
    this.experienciaServicio.obtenerListaDeExperiencias().subscribe(dato => {
      this.experiencia=dato;
    });
  }
 
}
