import { Component, OnInit } from '@angular/core';
import { tecnologia } from 'src/app/models/tecnologia.model';
import { SkillsService } from 'src/app/servicios/skills.service';

@Component({
  selector: 'app-skills',
  templateUrl: './skills.component.html',
  styleUrls: ['./skills.component.css']
})
export class SkillsComponent implements OnInit {

  tecnologia:tecnologia[];

  constructor(private skillServicios:SkillsService) { }

  ngOnInit(): void {
    this.obtenerTecnologias();
  }

  private obtenerTecnologias(){
    this.skillServicios.obtenerListaDeTecnologia().subscribe(dato => {
      this.tecnologia=dato;
    })
  }

}
