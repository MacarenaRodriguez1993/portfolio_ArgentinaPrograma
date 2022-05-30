import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { persona } from 'src/app/models/persona.model';
import { AcercaDeService } from 'src/app/servicios/acerca-de.service';
import { AutenticacionService } from 'src/app/servicios/autenticacion.service';


@Component({
  selector: 'app-acerca-de',
  templateUrl: './acerca-de.component.html',
  styleUrls: ['./acerca-de.component.css']
})
export class AcercaDeComponent implements OnInit {

  persona:persona[];
  isUserLoggedIn:boolean=false;

  constructor(private acercaDeServicios:AcercaDeService,
              private router:Router,
              private autenticacionServicio:AutenticacionService) {  }

  ngOnInit(): void {
    
    this.isUserLoggedIn=this.autenticacionServicio.isUserLoggedIn();
    this.getpersona();
  }


  getpersona(){
    this.acercaDeServicios.verpersona().subscribe(dato=>{
      this.persona=dato;
    })
  }

  editarPerfil(id:number){
    this.router.navigate(['/editar-perfil',id]);
  }

}

