import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { proyecto } from 'src/app/models/proyecto.model';
import { ProyectoService } from 'src/app/servicios/proyecto.service';

@Component({
  selector: 'app-editar-proyecto',
  templateUrl: './editar-proyecto.component.html',
  styleUrls: ['./editar-proyecto.component.css']
})
export class EditarProyectoComponent implements OnInit {

  id:number;
  proyecto:proyecto= new proyecto();

  constructor(private proyectoServicio:ProyectoService,
              private router:Router,
              private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.id=this.route.snapshot.params['id'];
    this.proyectoServicio.obtenerProyectoPorId(this.id).subscribe(dato=>{
      this.proyecto=dato;
    },error=>console.log(error));
  }

  volverHome(){
    this.router.navigate(['/home']);
  }
  onSubmit(){
    
    this.proyectoServicio.editarProyectoPorId(this.id,this.proyecto).subscribe(dato =>{
      this.volverHome();
    })
  }

}
