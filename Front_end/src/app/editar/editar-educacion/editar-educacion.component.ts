import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { educacion } from 'src/app/models/educacion.model';
import { EducacionService } from 'src/app/servicios/educacion.service';

@Component({
  selector: 'app-editar-educacion',
  templateUrl: './editar-educacion.component.html',
  styleUrls: ['./editar-educacion.component.css']
})
export class EditarEducacionComponent implements OnInit {

  id:number;
  educacion:educacion = new educacion();
  
  constructor(private educacionServicio:EducacionService,
              private router:Router,
              private route:ActivatedRoute) { }

  ngOnInit(): void {
    this.id=this.route.snapshot.params['id'];
    this.educacionServicio.obtenerEducacionPorId(this.id).subscribe(dato=>{
      this.educacion=dato;
    },error=>console.log(error));
  }

  volverHome(){
    this.router.navigate(['/home']);
  }

  onSubmit(): void {
    this.educacionServicio.editarEducacionPorId(this.id,this.educacion).subscribe(dato =>{
      this.volverHome();
    })
  }

}
