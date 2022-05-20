import { Component, OnInit } from '@angular/core';
import { experiencia } from 'src/app/models/experiencia.model';
import { ExperienciaService } from 'src/app/servicios/experiencia.service';

@Component({
  selector: 'app-experiencia',
  templateUrl: './experiencia.component.html',
  styleUrls: ['./experiencia.component.css']
})
export class ExperienciaComponent implements OnInit {
  experiencia:experiencia[];

  constructor(private experienciaServicio:ExperienciaService) { }

  ngOnInit(): void {
    this.obtenerExperiencia();
  }
  private obtenerExperiencia(){
    this.experienciaServicio.obtenerListaDeExperiencias().subscribe(dato => {
      this.experiencia=dato;
    });
  }
 
}
