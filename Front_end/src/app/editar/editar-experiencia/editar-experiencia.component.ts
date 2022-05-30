import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { experiencia } from 'src/app/models/experiencia.model';
import { ExperienciaService } from 'src/app/servicios/experiencia.service';

@Component({
  selector: 'app-editar-experiencia',
  templateUrl: './editar-experiencia.component.html',
  styleUrls: ['./editar-experiencia.component.css']
})
export class EditarExperienciaComponent implements OnInit {

  id:number;
  experiencia:experiencia = new experiencia();

  constructor(private experienciaServicio:ExperienciaService,
              private router:Router,
              private route:ActivatedRoute) { }

  ngOnInit(): void {
    this.id=this.route.snapshot.params['id'];
    this.experienciaServicio.obtenerExperienciaPorId(this.id).subscribe(dato =>{
      this.experiencia=dato;
    }, error=>console.log(error));
  }
  volverHome(){
    this.router.navigate(['/home']);
  }
  onSubmit(){
    this.experienciaServicio.editarExperienciaPorId(this.id,this.experiencia).subscribe(dato =>{
      this.volverHome();
    })
   
  }
}
