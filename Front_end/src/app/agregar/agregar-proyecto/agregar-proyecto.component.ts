import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { proyecto } from 'src/app/models/proyecto.model';
import { ProyectoService } from 'src/app/servicios/proyecto.service';

@Component({
  selector: 'app-agregar-proyecto',
  templateUrl: './agregar-proyecto.component.html',
  styleUrls: ['./agregar-proyecto.component.css']
})
export class AgregarProyectoComponent implements OnInit {

  proyecto:proyecto = new proyecto();

  constructor(private proyectoServicio:ProyectoService,
              private router:Router,
              private route:ActivatedRoute) { }

  ngOnInit(): void {
  }


  agregarProyecto(){
    this.proyectoServicio.agregarNuevoProyeto(this.proyecto).subscribe(dato=>{
      console.log("holaMundo");
      this.volverHome();
    })

  }
  volverHome(){
    this.router.navigate(['/home']);
  }
  onSubmit(){
    this.agregarProyecto();
  }

}
