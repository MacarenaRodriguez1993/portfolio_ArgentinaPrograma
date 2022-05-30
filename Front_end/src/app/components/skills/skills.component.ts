import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { tecnologia } from 'src/app/models/tecnologia.model';
import { AutenticacionService } from 'src/app/servicios/autenticacion.service';
import { SkillsService } from 'src/app/servicios/skills.service';

@Component({
  selector: 'app-skills',
  templateUrl: './skills.component.html',
  styleUrls: ['./skills.component.css']
})
export class SkillsComponent implements OnInit {

  skill:tecnologia[];
  isUserLoggedIn:boolean=false;

  constructor(private skillServicios:SkillsService,
              private autenticacionServicio:AutenticacionService,
              private router:Router) { }

  ngOnInit(): void {
    this.isUserLoggedIn=this.autenticacionServicio.isUserLoggedIn();
    this.obtenerTecnologias();
  }
  //OBTENER LISTADO DE TECNOLOGIAS
  private obtenerTecnologias(){
    this.skillServicios.obtenerListaDeTecnologia().subscribe(dato => {
      this.skill=dato;
    })
  }
  //EliminarTecnologia
  eliminarTecnologia(id:number){
    this.skillServicios.eliminarTecnologiaPorId(id).subscribe(dato => {
      this.obtenerTecnologias();
    })
  }
  //AGREGAR UNA NUEVA TECNOLOGIA 
  agregarNuevaTecnologia(){
    this.router.navigate(['/agregar-tecnologia'])
  }
  //EDITAR TECNOLOGIA POR ID
  editarTecnologia(id:number){
    this.router.navigate(['/editar-tecnologia',id])
  }
  

}
