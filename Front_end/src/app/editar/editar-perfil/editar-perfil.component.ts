import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { persona } from 'src/app/models/persona.model';
import { AcercaDeService } from 'src/app/servicios/acerca-de.service';

@Component({
  selector: 'app-editar-perfil',
  templateUrl: './editar-perfil.component.html',
  styleUrls: ['./editar-perfil.component.css']
})
export class EditarPerfilComponent implements OnInit {
  id :number;
  persona:persona =new persona();
  constructor(private acercaDeServicios:AcercaDeService,
              private router:Router,
              private route:ActivatedRoute) { }

  ngOnInit(): void {
    this.id=this.route.snapshot.params['id'];
    this.acercaDeServicios.obtenerPersonaPorId(this.id).subscribe(dato=>{
      this.persona=dato;
    },error=>console.log(error));
  }

  volverHome(){
    this.router.navigate(['/home'])
  }

  onSubmit():void{
    this.acercaDeServicios.editarPersona(this.id,this.persona).subscribe(dato=>{
      this.volverHome();
    })
  }

}
