import { Component, OnInit } from '@angular/core';
import { tecnologia } from 'src/app/models/tecnologia.model';
import { AutenticacionService } from 'src/app/servicios/autenticacion.service';
import { SkillsService } from 'src/app/servicios/skills.service';

@Component({
  selector: 'app-skills',
  templateUrl: './skills.component.html',
  styleUrls: ['./skills.component.css']
})
export class SkillsComponent implements OnInit {

  tecnologia:tecnologia[];
  isUserLoggedIn:boolean=false;

  constructor(private skillServicios:SkillsService,
              private autenticacionServicio:AutenticacionService) { }

  ngOnInit(): void {
    this.isUserLoggedIn=this.autenticacionServicio.isUserLoggedIn();
    this.obtenerTecnologias();
  }

  private obtenerTecnologias(){
    this.skillServicios.obtenerListaDeTecnologia().subscribe(dato => {
      this.tecnologia=dato;
    })
  }

  eliminarTecnologia(id:number){
    this.skillServicios.eliminarTecnologiaPorId(id).subscribe(dato => {
      this.obtenerTecnologias();
    })
  }

}
