import { Component, OnInit } from '@angular/core';
import { educacion } from 'src/app/models/educacion.model';
import { EducacionService } from 'src/app/servicios/educacion.service';

@Component({
  selector: 'app-educacion',
  templateUrl: './educacion.component.html',
  styleUrls: ['./educacion.component.css']
})
export class EducacionComponent implements OnInit {

    edu:educacion[];
  
  constructor(private educacionServicio:EducacionService) { }

  ngOnInit(): void {
    this.obtenerEducaciones();
  }
  private obtenerEducaciones(){
    this.educacionServicio.obtenerListaDeEducacion().subscribe(dato=>{
      this.edu=dato;
    })
  }

}
